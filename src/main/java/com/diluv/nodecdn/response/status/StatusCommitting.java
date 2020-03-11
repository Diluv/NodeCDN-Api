package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusCommitting extends Status {

    @SerializedName("report")
    @Expose
    private Report report;

    @SerializedName("remaining")
    @Expose
    private String remaining = "";

    @SerializedName("log")
    @Expose
    private String log = "";

    @SerializedName("rate")
    @Expose
    private String rate = "";

    @SerializedName("progress")
    @Expose
    private int progress = 0;
}
