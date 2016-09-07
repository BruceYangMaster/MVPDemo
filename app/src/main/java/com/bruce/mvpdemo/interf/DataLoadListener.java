package com.bruce.mvpdemo.interf;

/**
 * Create By BruceYang on 2016-09-07 22:29
 */
public interface DataLoadListener {
    void onSuccess();

    void onFail();

    void onComplete(Object object);
}
