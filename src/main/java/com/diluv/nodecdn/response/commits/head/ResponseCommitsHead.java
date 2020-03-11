package com.diluv.nodecdn.response.commits.head;

import com.diluv.nodecdn.response.commits.Commit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseCommitsHead {
    @SerializedName("commit")
    @Expose
    private Commit commit;
}
