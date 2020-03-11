package com.diluv.nodecdn.response.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ResponseStatus {

    @SerializedName("stats")
    @Expose
    private Map<String, Status> stats;

}
