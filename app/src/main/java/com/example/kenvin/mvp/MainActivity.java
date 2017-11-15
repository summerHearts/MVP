package com.example.kenvin.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kenvin.mvp.adapter.GirlListAdapter;
import com.example.kenvin.mvp.bean.Girl;
import com.example.kenvin.mvp.present.GirlPresentV1;
import com.example.kenvin.mvp.view.IGrilView;

import java.util.List;

/**
 * 属于视图层 View
 */

public class MainActivity extends BaseActivity<IGrilView,GirlPresentV1<IGrilView>> implements IGrilView{
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_v1);
        listView= (ListView) findViewById(R.id.listview);
        mPresent.fectch();
    }
    @Override
    public void showLoading() {
        Toast.makeText(this,"正在拼命加载",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGrils(List<Girl> grils) {
        listView.setAdapter(new GirlListAdapter(this,grils));
    }
    @Override
    protected GirlPresentV1<IGrilView> createPresent() {
        return new GirlPresentV1<>(this);
    }
}

