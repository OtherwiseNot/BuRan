package com.shuiyu.zhuan.news.article;

import android.os.Bundle;
import android.view.View;

import com.shuiyu.zhuan.R;
import com.shuiyu.zhuan.base.BaseFragment;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * </pre>
 */
public class NewsArticleView extends BaseFragment<INewsArticle.Presenter> implements INewsArticle.View {
    private static final String TAG = "NewsArticleView";
    private String mNewID;

    public static NewsArticleView newInstance(String newID) {
        Bundle bundle = new Bundle();
        bundle.putString(TAG, newID);
        NewsArticleView view = new NewsArticleView();
        view.setArguments(bundle);
        return view;
    }

    @Override
    protected int attachLayoutId() {
        return R.layout.fragment_list;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void setPresenter(INewsArticle.Presenter presenter) {
        if (null == presenter) {
            this.presenter = new NewsArticlePresenter(this);
        }
    }
}
