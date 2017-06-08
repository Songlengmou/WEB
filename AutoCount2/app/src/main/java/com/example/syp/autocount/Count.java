package com.example.syp.autocount;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by syp on 17-5-24.
 * <p>
 * 通过Observable的方式去通知UI数据已经改变了,
 * 再getter方法上添加Bindable注解，在setter方法中使用notifying提醒UI更新数据。
 */


//继承BaseObservable
public class Count extends BaseObservable {

    private int count = 0;
    private String countString = "Current count:0";

    //  @Bindable 这个是自己加的
    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        //指明变化属性
        notifyPropertyChanged(BR.count);  //解决数据绑定的界面刷新问题
        setCountString("Current count:" + this.count);
    }

    @Bindable
    public String getCountString() {
        return countString;
    }

    public void setCountString(String countString) {
        this.countString = countString;
        notifyPropertyChanged(BR.countString);
    }
}
