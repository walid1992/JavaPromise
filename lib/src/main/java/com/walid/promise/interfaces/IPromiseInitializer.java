package com.walid.promise.interfaces;

/**
 * Author   : walid
 * Data     : 2017-04-07  18:53
 * Describe :
 */
public interface IPromiseInitializer<ResolveData, RejectData> {
    void run(IResolve<ResolveData> resolve, IReject<RejectData> reject);
}
