package com.example.kenvin.mvp.view;

import com.example.kenvin.mvp.bean.Girl;

import java.util.List;

/**
 * Created by Kenvin on 2017/11/15.
 */

public interface IGrilView {
    /**
     * UI业务逻辑   加载进度条
     */
    void showLoading();

    /**
     * 加载完成，数据回调
     * @param grils
     */
    void showGrils(List<Girl> grils);
}
