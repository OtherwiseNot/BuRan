package com.shuiyu.zhuan.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/25
 * </pre>
 */
@GlideModule
public class ImageLoader extends AppGlideModule {
    public static void loadCenterCrop(Context context, String url, ImageView view, int defaultResId) {
        GlideApp.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop())
                .into(view);
    }

    /**
     * 带加载异常图片
     */
    public static void loadCenterCrop(Context context, String url, ImageView view, int defaultResId, int errorResId) {
        GlideApp.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop().error(errorResId))
                .into(view);
    }

    /**
     * 带监听处理
     */
    public static void loadCenterCrop(Context context, String url, ImageView view, RequestListener listener) {
        GlideApp.with(context)
                .load(url)
                .transition(withCrossFade())
                .apply(new RequestOptions().centerCrop())
                .listener(listener)
                .into(view);
    }

    public static void loadNormal(Context context, String url, ImageView view) {
        GlideApp.with(context).load(url).into(view);
    }
}
