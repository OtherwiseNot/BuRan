package com.shuiyu.zhuan.videos;

import com.shuiyu.zhuan.base.BasePresenter;
import com.shuiyu.zhuan.base.BaseView;
import com.shuiyu.zhuan.bean.TypeBase;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * desc   : 描述
 * </pre>
 */
public interface IVideoTab {
    interface View extends BaseView<Presenter>{
        void doLoadData(TypeBase bean);
    }
    interface Presenter extends BasePresenter{
        void getLoadData();
    }
}
