package com.gf.cordinatorlayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author: gaofei
 * @date: 2018/1/29
 * @desc:
 * @version:
 * @update:
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String[] titles;
    public ViewPagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
           return NestedScrollViewFragment.newInstance();
        } else {
            return RecycleViewFragment.newInstance();
        }

    }

    @Override
    public int getCount() {
        return titles.length;
    }
}
