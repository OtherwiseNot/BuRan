package com.shuiyu.buran;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.shuiyu.buran.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fragment)
    FrameLayout mFragment;
    @BindView(R.id.llout_news)
    LinearLayout mLloutNews;
    @BindView(R.id.llout_photo)
    LinearLayout mLloutPhoto;
    @BindView(R.id.llout_toher)
    LinearLayout mLloutToher;
    @BindView(R.id.llout_mnie)
    LinearLayout mLloutMnie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
