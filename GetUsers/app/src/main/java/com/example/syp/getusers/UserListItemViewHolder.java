package com.example.syp.getusers;

import android.widget.TextView;

/**
 * Created by syp on 17-5-23.
 */

public class UserListItemViewHolder {
    private TextView tvUserName, tvDescription;

    public UserListItemViewHolder(TextView tvUserName, TextView tvDescription) {
        this.tvUserName = tvUserName;
        this.tvDescription = tvDescription;
    }

    public TextView getTvUserName() {
        return tvUserName;
    }

    public TextView getTvDescription() {
        return tvDescription;
    }
}
