package com.example.syp.getusers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.syp.getusers.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syp on 17-5-23.
 */

public class UserListAdapter extends BaseAdapter {
    private List<User> users = new ArrayList<>();
    private Context context;

    public UserListAdapter(Context context) {
        this.context = context;
    }

    public void add(User user) {
        users.add(user);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_list_item, null);
            convertView.setTag(new UserListItemViewHolder((TextView) convertView.findViewById(R.id.tvUserName), (TextView) convertView.findViewById(R.id.tvDescription)));
        }

        UserListItemViewHolder holder = (UserListItemViewHolder) convertView.getTag();

        User user = (User) getItem(position);

        holder.getTvUserName().setText(String.format("名字：%s", user.getName()));
        holder.getTvDescription().setText(String.format("年龄:%d,性别：%s", user.getAge(), user.getGender()));

        return null;
    }

    public Context getContext() {
        return context;
    }
}
