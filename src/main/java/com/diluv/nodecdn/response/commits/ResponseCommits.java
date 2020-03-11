package com.diluv.nodecdn.response.commits;

import com.google.gson.annotations.Expose;

import java.util.List;

public class ResponseCommits {

    @Expose
    private List<Commit> commits;

    public List<Commit> getCommits() {
        return this.commits;
    }
}
