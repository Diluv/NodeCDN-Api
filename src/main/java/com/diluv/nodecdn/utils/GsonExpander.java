package com.diluv.nodecdn.utils;

import com.diluv.nodecdn.NodeCDN;
import feign.Param;

public class GsonExpander implements Param.Expander {
    @Override
    public String expand(Object value) {
        return NodeCDN.GSON.toJson(value);
    }
}
