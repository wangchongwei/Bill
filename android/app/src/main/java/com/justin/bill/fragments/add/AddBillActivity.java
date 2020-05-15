package com.justin.bill.fragments.add;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.justin.bill.MainAdapter;
import com.justin.bill.R;
import com.justin.bill.fragments.expenses.ExpensesFragment;

import java.util.ArrayList;
import java.util.List;

public class AddBillActivity extends FragmentActivity {

    private ViewPager2 viewPager2;
    private List<Fragment>fragmentList;

    private int currentIndex = 0, lastIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill);
        initData();
        initView();
    }

    private void initData() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new ExpensesFragment());
    }

    private void initView() {
        viewPager2 = findViewById(R.id.viewPager2_AddBill);
        MainAdapter adapter = new MainAdapter(this, fragmentList);
        viewPager2.setAdapter(adapter);
    }
}
