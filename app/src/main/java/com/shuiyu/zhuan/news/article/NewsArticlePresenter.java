package com.shuiyu.zhuan.news.article;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * </pre>
 */
public class NewsArticlePresenter implements INewsArticle.Presenter {
    private INewsArticle.View mView;
    public NewsArticlePresenter(INewsArticle.View view) {
        this.mView = view;

    }

    @Override
    public void doLoadData() {

    }
}
