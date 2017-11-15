package com.example.kenvin.mvp;

import android.app.Activity;
import android.os.Bundle;

import com.example.kenvin.mvp.present.BasePersenter;

/**
 * Created by Kenvin on 2017/11/15.
 */

public abstract class BaseActivity <V,T extends BasePersenter<V>> extends Activity {

    protected  T mPresent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresent=createPresent();
        mPresent.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        mPresent.detach();
        super.onDestroy();
    }

    /**
     * 子类实现具体的构建过程
     * @return
     */
    protected abstract T createPresent() ;
}
