package com.shuiyu.buran.news;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shuiyu.buran.R;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/29
 * </pre>
 */
public class NewsTabLayout extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_tab, container, false);
        return view;
    }
}
