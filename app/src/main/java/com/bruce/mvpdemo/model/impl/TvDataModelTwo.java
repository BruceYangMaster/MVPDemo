package com.bruce.mvpdemo.model.impl;

import com.bruce.mvpdemo.interf.DataLoadListener;
import com.bruce.mvpdemo.model.intf.ItvDataModel;

/**
 * Create By BruceYang on 2016-09-07 22:51
 */
public class TvDataModelTwo implements ItvDataModel {

    @Override
    public void loadData(DataLoadListener dataLoadListener) {
        String string = new String("数据二");
        dataLoadListener.onComplete(string);
    }
}
