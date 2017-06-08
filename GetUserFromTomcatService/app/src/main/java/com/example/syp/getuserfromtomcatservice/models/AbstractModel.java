package com.example.syp.getuserfromtomcatservice.models;


import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by syp on 17-5-22.
 */
public abstract class AbstractModel {

    private JSONObject jsonObject;

    public AbstractModel(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public AbstractModel() {
        jsonObject = new JSONObject();
    }

    public AbstractModel(String json) throws JSONException {
        this.jsonObject = new JSONObject(json);
    }

    public JSONObject gettoJsonObject() {
        return jsonObject;
    }

    @Override
    public String toString() {
        return gettoJsonObject().toString();
    }
}
