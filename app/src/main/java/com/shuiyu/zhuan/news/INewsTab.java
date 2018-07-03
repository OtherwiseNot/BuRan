package com.shuiyu.zhuan.news;

import com.shuiyu.zhuan.base.BasePresenter;
import com.shuiyu.zhuan.base.BaseView;
import com.shuiyu.zhuan.bean.TypeBase;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * </pre>
 */
public interface INewsTab {
    interface View extends BaseView<Presenter>{
       void doLoadData(TypeBase bean);
    }

    interface Presenter extends BasePresenter{
        void getLoadData();
    }
}
