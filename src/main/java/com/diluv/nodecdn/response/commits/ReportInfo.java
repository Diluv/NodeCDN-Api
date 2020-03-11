package com.diluv.nodecdn.response.commits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReportInfo {

    @SerializedName("rate")
    @Expose
    private String rate = "";

    @SerializedName("received")
    @Expose
    private String received = "";

    @SerializedName("sent")
    @Expose
    private String sent = "";

    @SerializedName("speedup")
    @Expose
    private String speedup = "";
}
