package com.example.syp.autocontentmvlianxi;

/**
 * Created by syp on 17-5-23.
 */

public class CountWrapper {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCountString() {
        return this.count + "";
    }
}
