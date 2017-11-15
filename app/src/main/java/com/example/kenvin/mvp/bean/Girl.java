package com.example.kenvin.mvp.bean;

/**
 * Created by Kenvin on 2017/11/15.
 */

public class Girl {
    public int icon;
    public String like;
    public String style;

    public Girl(int icon, String like, String style) {
        this.icon = icon;
        this.like = like;
        this.style = style;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
