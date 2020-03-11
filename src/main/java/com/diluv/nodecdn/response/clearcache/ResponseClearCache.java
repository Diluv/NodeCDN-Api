package com.diluv.nodecdn.response.clearcache;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseClearCache {

    @SerializedName("result")
    @Expose
    private Result result;

    @SerializedName("cleared_urls")
    @Expose
    private List<String> clearedUrls;
}
