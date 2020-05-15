package com.justin.bill;
/*
 * created by Justin on 2020-05-15
 * email: wcw1992yu@163.com
 * github: https://github.com/wangchongwei
 */

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainAdapter extends FragmentStateAdapter {

    private List<Fragment>fragmentList;

    public MainAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    public MainAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public MainAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    public MainAdapter(FragmentActivity fragmentActivity, List<Fragment>fragmentList) {
        this(fragmentActivity);
        this.fragmentList = fragmentList;
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
