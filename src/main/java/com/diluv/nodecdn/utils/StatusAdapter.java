package com.diluv.nodecdn.utils;

import com.diluv.nodecdn.response.status.Status;
import com.diluv.nodecdn.response.status.StatusCommitting;
import com.diluv.nodecdn.response.status.StatusOffline;
import com.diluv.nodecdn.response.status.StatusOk;
import com.google.gson.*;

import java.lang.reflect.Type;

public class StatusAdapter implements JsonDeserializer<Status> {

    @Override
    public Status deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String status = json.getAsJsonObject().get("status").getAsString();
        Gson g = new Gson();

        switch (status) {
            case "ready": {
                return g.fromJson(json, StatusOk.class);
            }
            case "offline": {
                return g.fromJson(json, StatusOffline.class);
            }
            case "committing": {
                return g.fromJson(json, StatusCommitting.class);
            }
            default: {
                return g.fromJson(json, Status.class);
            }
        }
    }
}
