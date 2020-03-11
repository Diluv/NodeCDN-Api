package com.diluv.nodecdn.response.commits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Commit {

    @SerializedName("author")
    @Expose
    private String author = "";

    @SerializedName("container")
    @Expose
    private String container = "";

    @SerializedName("data")
    @Expose
    private Report data;

    @SerializedName("id")
    @Expose
    private String id = "";

    @SerializedName("message")
    @Expose
    private String message = "";

    @SerializedName("status")
    @Expose
    private String status = "";

    @SerializedName("time")
    @Expose
    private String time = "";
}
