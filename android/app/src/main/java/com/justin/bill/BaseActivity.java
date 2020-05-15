package com.justin.bill;
/*
 * created by Justin on 2020-05-15
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class BaseActivity extends Activity {


    public static List<Activity>activityList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityList.add(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        activityList.remove(this);
    }
}
