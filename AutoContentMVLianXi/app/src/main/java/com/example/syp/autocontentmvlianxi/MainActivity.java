package com.example.syp.autocontentmvlianxi;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.syp.autocontentmvlianxi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        final CountWrapper countWrapper = new CountWrapper();

        binding.setCountWrapper(countWrapper);

        new Thread() {
            @Override
            public void run() {
                super.run();

                while (countWrapper.getCount() < 100) {
                    try {
                        sleep(1000);
                        binding.setCountWrapper(countWrapper);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
