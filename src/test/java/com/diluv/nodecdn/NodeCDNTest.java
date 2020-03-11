package com.diluv.nodecdn;

import com.diluv.nodecdn.request.RequestClearCache;
import com.diluv.nodecdn.response.Response;
import com.diluv.nodecdn.response.clearcache.ResponseClearCache;
import com.diluv.nodecdn.response.commits.head.ResponseCommitsHead;
import com.diluv.nodecdn.response.status.ResponseStatus;
import com.diluv.nodecdn.utils.FileReader;
import com.diluv.nodecdn.utils.NodeCDNEndpoints;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NodeCDNTest {

    private static NodeCDNEndpoints nodeCDN;
    private static MockClient mockClient;

    @BeforeAll
    public static void setup() {
        mockClient = new MockClient()
                .ok(HttpMethod.GET, "/status", FileReader.readFile("responses/status/ok_transferring.json"))
                .ok(HttpMethod.GET, "/commits/527368293c0b24a3e2fef6c4c0e5002c", FileReader.readFile("responses/commitHead.json"))
                .ok(HttpMethod.POST, "/clear-cache", FileReader.readFile("responses/clear-cache/ok.json"));

        nodeCDN = Feign.builder()
                .client(mockClient)
                .encoder(new GsonEncoder(NodeCDN.GSON))
                .decoder(new GsonDecoder(NodeCDN.GSON))
                .target(new MockTarget<>(NodeCDNEndpoints.class));
    }

    @Test
    public void getStatus() {
        Response<ResponseStatus> response = nodeCDN.getStatus();

//        Assertions.assertEquals(new JsonParser().parse(data), GSON.toJsonTree(response));
    }

    @Test
    public void getCommit() {
        Response<ResponseCommitsHead> response = nodeCDN.getCommit("527368293c0b24a3e2fef6c4c0e5002c");

//        Assertions.assertEquals(new JsonParser().parse(data), GSON.toJsonTree(response));
    }

    @Test
    public void postClearCache() {
        Response<ResponseClearCache> response = nodeCDN.postClearCache(new RequestClearCache("text.txt"));

//        Assertions.assertEquals(new JsonParser().parse(data), GSON.toJsonTree(response));
    }
}
