package com.diluv.nodecdn.response.clearcache;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseClearCache {

    @Expose
    private Result result;

    @Expose
    @SerializedName("cleared_urls")
    private List<String> clearedUrls;

    public Result getResult() {
        return this.result;
    }

    public List<String> getClearedUrls() {
        return this.clearedUrls;
    }
}
