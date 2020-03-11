package com.diluv.nodecdn.request;

import com.google.gson.annotations.Expose;

import java.util.Arrays;
import java.util.List;

public class RequestClearCache {

    @Expose
    private List<String> urls;

    public RequestClearCache(List<String> urls) {
        this.urls = urls;
    }

    public RequestClearCache(String... urls) {
        this.urls = Arrays.asList(urls);
    }
}
