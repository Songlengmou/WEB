package com.example.syp.databinding1;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.syp.databinding1.databinding.ActivityMainBinding;

/**
 * Created by syp on 17-5-24.
 * <p>
 * MVP(主持人)
 * <p>
 * <p>
 * 事件绑定
 */

public class Presenter {
    private ActivityMainBinding binding;
    private Context context;

    public Presenter(ActivityMainBinding binding, Context context) {
        this.binding = binding;
        this.context = context;

        //① 一般用这个
        binding.setUser(new User("XiaoHua"));
        binding.setPresenter(this);

        // ②如果用这个，就要去布局里删除android:text="@{user.name}"
//        binding.tvOut.setText("Hello Android");

//        binding.btnClickMe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public ActivityMainBinding getBinding() {
        return binding;
    }

    public Context getContext() {
        return context;
    }

    //需要用到在布局 被注掉的 Button
    public void btnClickMeClickedHandler(View v) {
        Toast.makeText(context, "Button clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * 需要在布局里填这个  才能用下方方法
     * <Button
     * android:id="@+id/btnClickMe"
     * android:layout_width="wrap_content"
     * android:layout_height="wrap_content"
     * android:onClick="@{()->presenter.btnClicked(user.name)}"
     * android:text="Click me" />
     */
    public void btnClicked(String words) {
        Toast.makeText(context, words, Toast.LENGTH_SHORT).show();
    }

}
