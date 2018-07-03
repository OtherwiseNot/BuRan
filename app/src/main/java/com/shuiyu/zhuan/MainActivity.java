package com.shuiyu.zhuan;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.shuiyu.zhuan.base.BaseActivity;
import com.shuiyu.zhuan.news.NewsTabLayout;
import com.shuiyu.zhuan.videos.VideosTabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    private static final int FRAGMENT_NEWS = 0;
    private static final int FRAGMENT_VIDEO = 1;
    private static final int FRAGMENT_OTHER = 2;
    private static final int FRAGMENT_MEDIA = 3;

    @BindView(R.id.fragment)
    FrameLayout mFragment;
    @BindView(R.id.llout_news)
    LinearLayout mLloutNews;
    @BindView(R.id.llout_video)
    LinearLayout mLloutVideo;
    @BindView(R.id.llout_other)
    LinearLayout mLloutOther;
    @BindView(R.id.llout_mine)
    LinearLayout mLloutMine;

    private NewsTabLayout mNewsTabLayout;
    private VideosTabLayout mVideosTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (savedInstanceState != null) {
            mNewsTabLayout = (NewsTabLayout) getSupportFragmentManager().findFragmentByTag(NewsTabLayout.class.getName());
            mVideosTabLayout = (VideosTabLayout) getSupportFragmentManager().findFragmentByTag(VideosTabLayout.class.getName());
        } else {
            showFragment(FRAGMENT_NEWS);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @OnClick({R.id.llout_news, R.id.llout_video, R.id.llout_other, R.id.llout_mine})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llout_news:
                showFragment(FRAGMENT_NEWS);
                break;
            case R.id.llout_video:
                showFragment(FRAGMENT_VIDEO);
                break;
            case R.id.llout_other:
                break;
            case R.id.llout_mine:
                break;
        }
    }

    private void showFragment(int index) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideFragment(transaction);
        switch (index) {
            case FRAGMENT_NEWS:
                if (mNewsTabLayout == null) {
                    mNewsTabLayout = NewsTabLayout.getInstance();
                    transaction.add(R.id.fragment, mNewsTabLayout, NewsTabLayout.class.getName());
                } else {
                    transaction.show(mNewsTabLayout);
                }
                break;
            case FRAGMENT_VIDEO:
                if (mVideosTabLayout == null) {
                    mVideosTabLayout = VideosTabLayout.getInstance();
                    transaction.add(R.id.fragment, mVideosTabLayout, VideosTabLayout.class.getName());
                } else {
                    transaction.show(mVideosTabLayout);
                }
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (mNewsTabLayout != null) {
            transaction.hide(mNewsTabLayout);
        }
        if (mVideosTabLayout != null) {
            transaction.hide(mVideosTabLayout);
        }
    }

}
