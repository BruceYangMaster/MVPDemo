package com.bruce.mvpdemo.presenter;

import com.bruce.mvpdemo.interf.DataLoadListener;
import com.bruce.mvpdemo.model.impl.TvDataModel;
import com.bruce.mvpdemo.model.impl.TvDataModelTwo;
import com.bruce.mvpdemo.model.intf.ItvDataModel;
import com.bruce.mvpdemo.view.intf.ItvView;

/**
 * Create By BruceYang on 2016-09-07 22:38
 */
public class TvDataPresenter {
    //view
    ItvView mTvView;
    //model
    ItvDataModel mTvDataModel = new TvDataModel();

    public TvDataPresenter(ItvView mTvView) {
        this.mTvView = mTvView;
    }

    /**
     * bind view和model
     */
    public void fecthData() {
        mTvView.showLoading();
        //
        mTvDataModel.loadData(new DataLoadListener() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onFail() {

            }

            @Override
            public void onComplete(Object object) {
//传给view显示
                mTvView.showData(object);
            }
        });
    }

    /**
     * 策略模式
     *
     * @param i
     */
    public void setDataType(int i) {
        switch (i) {
            case 1:
                mTvDataModel = new TvDataModel();
                break;
            case 2:
                mTvDataModel = new TvDataModelTwo();
                break;
        }
    }
}
