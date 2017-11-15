package com.example.kenvin.mvp.present;

import java.lang.ref.WeakReference;

/**
 * Created by Kenvin on 2017/11/15.
 */

public abstract class BasePersenter <T>  {
    /**
     * 持有UI接口的弱引用
     */
    protected WeakReference<T> mViewRef;

    /**
     * 获取数据方法
     */
    public abstract void fectch();

    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解绑
     */
    public void detach() {

        if(mViewRef!=null) {
            mViewRef.clear();
            mViewRef=null;
        }
    }
}
