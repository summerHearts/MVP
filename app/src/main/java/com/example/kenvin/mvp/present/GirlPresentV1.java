package com.example.kenvin.mvp.present;

import com.example.kenvin.mvp.bean.Girl;
import com.example.kenvin.mvp.model.GirlModelImlV1;
import com.example.kenvin.mvp.model.IGirlModel;
import com.example.kenvin.mvp.view.IGrilView;

import java.util.List;

/**
 * Created by Kenvin on 2017/11/15.
 */

public class GirlPresentV1 <T>  extends  BasePersenter<IGrilView> {
    /**
     * 持有视图层 UI接口的引用  此时的视图层Activity
     */
    IGrilView mGrilView;

    public GirlPresentV1(IGrilView mGrilView) {
        this.mGrilView = mGrilView;
    }

    /**
     * 持有模型Model的引用
     */
    IGirlModel girlModel=new GirlModelImlV1();

    @Override
    public  void fectch()
    {
        mGrilView.showLoading();
        if(girlModel!=null)
        {
            /**
             * 参数为数据回调监听
             */
            girlModel.loadGirl(new IGirlModel.GirlOnLoadlitener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //回调视图层
                    mGrilView.showGrils(girls);
                }
            });
        }
    }
}
