package com.gf.cordinatorlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: gf
 * @date: 2018/1/29
 * @desc:
 * @version:
 * @update:
 */

public class RecycleViewFragment extends Fragment {
    public static Fragment newInstance() {
        RecycleViewFragment fragment = new RecycleViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycle_view, container, false);
        RecyclerView rv = view.findViewById(R.id.rv);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("position---" + i);
        }

        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new RecyclerViewAdapter(list));

        return view;
    }
}
