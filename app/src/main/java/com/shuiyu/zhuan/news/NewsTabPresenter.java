package com.shuiyu.zhuan.news;

import com.shuiyu.zhuan.api.BaseApi;
import com.shuiyu.zhuan.bean.TypeBase;
import com.shuiyu.zhuan.utils.RetrofitFactory;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * desc   : 描述
 * </pre>
 */
public class NewsTabPresenter implements INewsTab.Presenter{
    INewsTab.View mView;
    public NewsTabPresenter(INewsTab.View view) {
        this.mView = view;
    }

    @Override
    public void getLoadData() {
        RetrofitFactory.getRetrofit()
                .create(BaseApi.class)
                .getArtType()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TypeBase>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TypeBase typeBase) {
                        mView.doLoadData(typeBase);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
