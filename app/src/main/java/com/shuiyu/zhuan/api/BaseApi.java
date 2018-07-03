package com.shuiyu.zhuan.api;

import com.shuiyu.zhuan.bean.TypeBase;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/26
 * </pre>
 */
public interface BaseApi {
    String HOST = "http://beizhuan.51dzhuan.com/";

    @GET("beizhuan/minfo/call.action?" +
            "opttype=ART_TYPE&" +
            "jdata=%7B%22" +
            "app_id%22%3A%22" +
            "xzwl%22%2C%22" +
            "app_token%22%3A%22" +
            "xzwltoken070704%22%2C%22os%22%3A%22" +
            "android%22%2C%22" +
            "pars%22%3A%7B%22" +
            "openid%22%3A%22orLJBwOHB_rmguSPhH5epBQQsCc4%22%7D%2C%22" +
            "vercode%22%3A19%2C%22" +
            "version%22%3A%223.0.6%22%7D")
    Call<TypeBase> getArtType();
}
