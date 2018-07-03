package com.shuiyu.zhuan.news.article;

import com.shuiyu.zhuan.base.BasePresenter;
import com.shuiyu.zhuan.base.BaseView;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * desc   : 描述
 * </pre>
 */
public interface INewsArticle {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void doLoadData();

    }
}
