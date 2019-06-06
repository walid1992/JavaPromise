package com.walid.promise.interfaces;

/**
 * Author   : walid
 * Data     : 2017-04-07  18:53
 * Describe :
 */
public interface IReject<T> {
    void run(T err);
}