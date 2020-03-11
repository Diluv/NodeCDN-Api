package com.diluv.nodecdn.utils;

import com.diluv.nodecdn.request.RequestClearCache;
import com.diluv.nodecdn.request.RequestCommit;
import com.diluv.nodecdn.response.Response;
import com.diluv.nodecdn.response.clearcache.ResponseClearCache;
import com.diluv.nodecdn.response.commits.head.ResponseCommitsHead;
import com.diluv.nodecdn.response.status.ResponseStatus;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface NodeCDNEndpoints {

    @RequestLine("POST /commit")
    @Headers("Content-Type: application/json")
    Response<ResponseCommitsHead> postCommit(RequestCommit commit);

    @RequestLine("GET /status")
    Response<ResponseStatus> getStatus();

    // Currently disabled
//    @RequestLine("GET /commits")
//    Response<ResponseCommits> getCommits();

    @RequestLine("GET /commits/{head}")
    Response<ResponseCommitsHead> getCommit(@Param("head") String head);

    @RequestLine("POST /clear-cache")
    @Headers("Content-Type: application/json")
    Response<ResponseClearCache> postClearCache(RequestClearCache urls);
}
