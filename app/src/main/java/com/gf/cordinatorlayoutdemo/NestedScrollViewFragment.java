package com.gf.cordinatorlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author: gf
 * @date: 2018/1/29
 * @desc:
 * @version:
 * @update:
 */

public class NestedScrollViewFragment extends Fragment {
    public static NestedScrollViewFragment newInstance() {
        NestedScrollViewFragment nestedScrollViewFragment = new NestedScrollViewFragment();
        return nestedScrollViewFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_nested_scroll_view,container,false);
    }
}
