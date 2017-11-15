package com.example.kenvin.mvp.model;

import com.example.kenvin.mvp.bean.Girl;

import java.util.List;

/**
 * Created by Kenvin on 2017/11/15.
 */

public interface IGirlModel {

    /**
     * Model数据回传
     * @param girlOnLoadlitener
     */
    void loadGirl(GirlOnLoadlitener girlOnLoadlitener);

    interface  GirlOnLoadlitener {
        void  onComplete(List<Girl> girls);
    }
}
