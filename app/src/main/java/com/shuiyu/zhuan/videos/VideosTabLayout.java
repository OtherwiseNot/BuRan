package com.shuiyu.zhuan.videos;

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
 * time   : 2018/07/03
 * </pre>
 */
public class VideosTabLayout extends BaseFragment<IVideoTab.Presenter> implements IVideoTab.View {
    private static final String TAG = "VideoTabLayout";
    private static volatile VideosTabLayout videosTabLayout;
    private SlidingTabLayout mMStabMainVideos;
    private ViewPager mMVpMainVideos;
    private ViewPagerFragmentAdapter mAdapter;

    public static VideosTabLayout getInstance() {
        if (videosTabLayout == null) {
            synchronized (VideosTabLayout.class) {
                if (videosTabLayout == null) {
                    videosTabLayout = new VideosTabLayout();
                }
            }
        }
        return videosTabLayout;
    }

    @Override
    protected int attachLayoutId() {
        return R.layout.fragment_videos_tab;
    }

    @Override
    protected void initView(View view) {
        mMStabMainVideos = view.findViewById(R.id.stab_main_videos);
        mMVpMainVideos = view.findViewById(R.id.vp_main_videos);
    }

    @Override
    protected void initData() {
        presenter.getLoadData();
    }

    @Override
    public void setPresenter(IVideoTab.Presenter presenter) {
        if (null == presenter) {
            this.presenter = new VideoTabPresenter(this);
        }
    }

    @Override
    public void doLoadData(TypeBase bean) {
        List<Fragment> mFragmentList = new ArrayList<>();
        List<String> mTitleList = new ArrayList<>();
        for (TypeBase.DatasBean data : bean.getDatas()) {
            Fragment fragment = null;
            mTitleList.add(data.getArt_typename());
            fragment = NewsArticleView.newInstance(data.getArt_typeid() + "");
            mFragmentList.add(fragment);
        }
        mAdapter = new ViewPagerFragmentAdapter(getChildFragmentManager(), mFragmentList, mTitleList);
        mMVpMainVideos.setAdapter(mAdapter);
        mMStabMainVideos.setViewPager(mMVpMainVideos);
    }
    public class ViewPagerFragmentAdapter extends BaseViewPagerFragmentAdapter<NewsArticleView> {

        public ViewPagerFragmentAdapter(FragmentManager fm, List listData, List<String> listTitle) {
            super(fm, listData, listTitle);
        }
    }
}
