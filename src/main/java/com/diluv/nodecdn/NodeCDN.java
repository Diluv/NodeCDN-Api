package com.diluv.nodecdn;

import com.diluv.nodecdn.response.status.Status;
import com.diluv.nodecdn.utils.NodeCDNEndpoints;
import com.diluv.nodecdn.utils.StatusAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;

import java.util.logging.Logger;

/**
 * An API lib based on the documentation and examples provided by NodeCDN, https://nodecdn.net/api
 */
public class NodeCDN {

    public static final Logger LOG = Logger.getLogger("NodeCDN-API");
    public static final Gson GSON = new GsonBuilder().registerTypeAdapter(Status.class, new StatusAdapter()).create();

    private final String username;
    private final String password;

    private NodeCDNEndpoints nodeCDNEndpoints;

    public NodeCDN(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public NodeCDNEndpoints getNodeCDNService() {
        if (this.nodeCDNEndpoints == null) {
            this.nodeCDNEndpoints = Feign.builder()
                    .client(new OkHttpClient())
                    .encoder(new GsonEncoder())
                    .decoder(new GsonDecoder(NodeCDN.GSON))
                    .requestInterceptor(new BasicAuthRequestInterceptor(this.username, this.password))
                    .target(NodeCDNEndpoints.class, "https://api.nodecdn.net");
        }
        return this.nodeCDNEndpoints;
    }
}
