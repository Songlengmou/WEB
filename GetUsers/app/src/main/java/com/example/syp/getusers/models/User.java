package com.example.syp.getusers.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by syp on 17-5-22.
 */
public class User extends AbstractModel {

    private String name;
    private int age;
    private String gender;

    public User() {
    }

    public User(JSONObject jsonObject) {
        super(jsonObject);
    }

    public User(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public User(String json) throws JSONException {
        super(json);
    }

    public String getName() {
        try {
            return gettoJsonObject().getString("name");
        } catch (JSONException e) {
            return null;
        }
    }

    public void setName(String name) {
        try {
            gettoJsonObject().put("name", name);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取用户名字，如果没有该字段，则返回-1
     *
     * @return
     */
    public int getAge() {
        try {
            return gettoJsonObject().getInt("age");
        } catch (JSONException e) {
            return -1;
        }
    }

    public void setAge(int age) {
        try {
            gettoJsonObject().put("age", age);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getGender() {
        try {
            return gettoJsonObject().getString("gender");
        } catch (JSONException e) {
            return null;
        }
    }

    public void setGender(String gender) {
        try {
            gettoJsonObject().put("gender", gender);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
