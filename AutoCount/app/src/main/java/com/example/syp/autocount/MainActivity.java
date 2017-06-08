package com.example.syp.autocount;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.syp.autocount.databinding.ActivityMainBinding;

/**
 * https://developer.android.google.cn/topic/libraries/data-binding/index.html
 * <p>
 * MV模式(不是MVC)
 * <p>
 * dataBinding实现数据和UI绑定的的框架
 * ActivityMainBinding 此类包含从layout属性到layout的Views中所有的bindings
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final CountWrapper countWrapper = new CountWrapper();
        dataBinding.setCountWrapper(countWrapper);

        new Thread() {
            @Override
            public void run() {
                super.run();

                while (countWrapper.getCount() < 100) {
                    try {
                        sleep(1000);
                        countWrapper.setCount(countWrapper.getCount() + 1);
                        dataBinding.setCountWrapper(countWrapper);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
