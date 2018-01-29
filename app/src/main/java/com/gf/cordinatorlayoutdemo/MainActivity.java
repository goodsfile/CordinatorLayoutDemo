package com.gf.cordinatorlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * @author: gf
 * @date: 2018/1/29
 * @desc:
 * @version:
 * @update:
 */

public class MainActivity extends AppCompatActivity {
    private String[] titles = new String[]{"NestedScrollView", "RecyclerView"};
    private ViewPagerIndicator mIndicator;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        mIndicator = findViewById(R.id.indicator);
        mViewPager = findViewById(R.id.viewpager);
        mIndicator.setTitles(titles);
        mIndicator.setIndicatorColor(R.color.colorAccent);
    }

    private void initListener() {
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mIndicator.scroll(position, positionOffset);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),titles));
    }

}
