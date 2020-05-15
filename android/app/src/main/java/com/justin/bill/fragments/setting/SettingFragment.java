package com.justin.bill.fragments.setting;
/*
 * created by Justin on 2020-05-15
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.justin.bill.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SettingFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_setting, container, false);
        return fragmentView;
    }


}
