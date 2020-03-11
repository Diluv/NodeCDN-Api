package com.diluv.nodecdn.response.commits.head;

import com.diluv.nodecdn.response.commits.Commit;
import com.google.gson.annotations.Expose;

public class ResponseCommitsHead {

    @Expose
    private Commit commit;

    public Commit getCommit() {
        return this.commit;
    }
}
