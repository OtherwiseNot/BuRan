package com.shuiyu.zhuan.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.flyco.tablayout.SlidingTabLayout;
import com.shuiyu.zhuan.R;
import com.shuiyu.zhuan.base.BaseFragment;
import com.shuiyu.zhuan.base.BaseViewPagerFragmentAdapter;
import com.shuiyu.zhuan.bean.TypeBase;
import com.shuiyu.zhuan.news.article.NewsArticleView;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/29
 * </pre>
 */
public class NewsTabLayout extends BaseFragment<INewsTab.Presenter> implements INewsTab.View{
    public static final String TAG = "NewsTabLayout";
    private static volatile NewsTabLayout newsTabLayout = null;
    private List<Fragment> mFragmentList;
    private List<String> mTitleList;
    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    private ViewPagerFragmentAdapter mAdapter;

    public static NewsTabLayout getInstance() {
        if (newsTabLayout == null) {
            synchronized (NewsTabLayout.class) {
                if (newsTabLayout == null) {
                    newsTabLayout = new NewsTabLayout();
                }
            }
        }
        return newsTabLayout;
    }

    @Override
    protected int attachLayoutId() {
        return R.layout.fragment_news_tab;
    }

    @Override
    protected void initView(View view) {
        mSlidingTabLayout = view.findViewById(R.id.stab_main_news);
        mViewPager = view.findViewById(R.id.vp_main_news);
    }
    @Override
    protected void initData() {
        initTabs();
    }

    @Override
    public void doLoadData(TypeBase bean) {
        mFragmentList = new ArrayList<>();
        mTitleList = new ArrayList<>();
        for (TypeBase.DatasBean data : bean.getDatas()) {
            Fragment fragment = null;
            mTitleList.add(data.getArt_typename());
            fragment = NewsArticleView.newInstance(data.getArt_typeid() + "");
            mFragmentList.add(fragment);
        }
        mAdapter = new ViewPagerFragmentAdapter(getChildFragmentManager(), mFragmentList, mTitleList);
        mViewPager.setAdapter(mAdapter);
        mSlidingTabLayout.setViewPager(mViewPager);
    }

    @Override
    public void setPresenter(INewsTab.Presenter presenter) {
        if(null == presenter){
            this.presenter = new NewsTabPresenter(this);
        }
    }

    public class ViewPagerFragmentAdapter extends BaseViewPagerFragmentAdapter<NewsArticleView> {

        public ViewPagerFragmentAdapter(FragmentManager fm, List listData, List<String> listTitle) {
            super(fm, listData, listTitle);
        }
    }

    private void initTabs() {
        presenter.getLoadData();
    }
}
