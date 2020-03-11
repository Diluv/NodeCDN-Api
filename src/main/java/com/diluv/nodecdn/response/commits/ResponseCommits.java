package com.diluv.nodecdn.response.commits;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseCommits {

    @SerializedName("commits")
    @Expose
    private List<Commit> commits = null;
}
