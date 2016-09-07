package com.bruce.mvpdemo.model.impl;

import com.bruce.mvpdemo.interf.DataLoadListener;
import com.bruce.mvpdemo.model.intf.ItvDataModel;

/**
 * Create By BruceYang on 2016-09-07 22:34
 */

/**
 * 加载数据
 */
public class TvDataModel implements ItvDataModel {

    @Override
    public void loadData(DataLoadListener dataLoadListener) {
        Object object = new String("数据一");
        /**
         * 回调监听
         */
        dataLoadListener.onComplete(object);
    }
}
