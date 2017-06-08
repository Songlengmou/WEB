package com.example.syp.databinding1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.syp.databinding1.databinding.ActivityMainBinding;

/**
 * MVP(主持人)
 * <p>
 * 面向对象功能扩展：(1)继承  (2)聚合
 */
public class MainActivity extends AppCompatActivity {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter = new Presenter(binding, this);


//        binding.tvOut.setText("Hello Android DataBinding");
//
//        User u = new User("XiaoJing");
//        binding.setUser(u);
    }
}
