package com.justin.bill;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.justin.bill.fragments.add.AddBillActivity;
import com.justin.bill.fragments.add.AddFragment;
import com.justin.bill.fragments.chart.ChartFragment;
import com.justin.bill.fragments.home.HomeFragment;
import com.justin.bill.fragments.personal.PersonalFragment;
import com.justin.bill.fragments.setting.SettingFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


    private ViewPager2 viewPager2;
    private MainAdapter adapter;

    // 当前下标、上一次下标
    private int currentIndex = 0, lastIndex = 0;

    // fragment 列表
    private List<Fragment>mainFragmentList;

    private LinearLayout homeLayout, chartLayout, addLayout, personalLayout, settingLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    /**
     * 数据初始化
     */
    private void initData() {
        mainFragmentList = new ArrayList<>();
        mainFragmentList.add(new HomeFragment());
        mainFragmentList.add(new ChartFragment());
        mainFragmentList.add(new AddFragment());
        mainFragmentList.add(new PersonalFragment());
        mainFragmentList.add(new SettingFragment());


    }

    /**
     * 视图初始化
     */
    private void initView() {
        viewPager2 = findViewById(R.id.viewPager2_main);
        adapter = new MainAdapter(this, mainFragmentList);
        viewPager2.setAdapter(adapter);


        findViewById(R.id.layout_Home).setOnClickListener(this);
        findViewById(R.id.layout_Chart).setOnClickListener(this);
        findViewById(R.id.layout_Add).setOnClickListener(this);
        findViewById(R.id.layout_Personal).setOnClickListener(this);
        findViewById(R.id.layout_Setting).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.layout_Home:
                currentIndex = 0;
                break;

            case R.id.layout_Chart:
                currentIndex = 1;
                break;

            case R.id.layout_Add:
                currentIndex = 2;
                Intent intent = new Intent(MainActivity.this, AddBillActivity.class);
                startActivityForResult(intent, IntentCode.INTENT_ADD_BILL_ACTIVITY);
                break;

            case R.id.layout_Personal:
                currentIndex = 3;
                break;

            case R.id.layout_Setting:
                currentIndex = 4;
                break;


            default:
                break;
        }
        // 当当前下标与上一次下标一致，认为是重复操作
        if(currentIndex == lastIndex) return;
//        viewPager2.setCurrentItem(currentIndex);
//        lastIndex = currentIndex;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
