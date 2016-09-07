package com.bruce.mvpdemo.view.intf;

/**
 * Create By BruceYang on 2016-09-07 22:32
 */
public interface ItvView {
    /**
     * 显示数据到tv上
     *
     * @param object
     */
    void showData(Object object);

    /**
     * 加载进度条
     */
    void showLoading();
}
