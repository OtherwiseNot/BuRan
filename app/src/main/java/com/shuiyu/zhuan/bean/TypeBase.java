package com.shuiyu.zhuan.bean;

import java.util.List;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/26
 * </pre>
 */
public class TypeBase {

    /**
     * datas : [{"art_typeid":30,"art_typename":"推荐"},{"art_typeid":7,"art_typename":"健康"},{"art_typeid":6,"art_typename":"美文"},{"art_typeid":8,"art_typename":"美食"},{"art_typeid":9,"art_typename":"常识"},{"art_typeid":32,"art_typename":"娱乐"},{"art_typeid":10,"art_typename":"两性"},{"art_typeid":31,"art_typename":"社会"},{"art_typeid":4,"art_typename":"搞笑"},{"art_typeid":14,"art_typename":"母婴"},{"art_typeid":12,"art_typename":"历史"},{"art_typeid":40,"art_typename":"励志"},{"art_typeid":37,"art_typename":"新闻"},{"art_typeid":33,"art_typename":"旅游"},{"art_typeid":42,"art_typename":"奇葩事"}]
     * displayindex : 0
     * err_code :
     * ret : ok
     * return_msg :
     */

    private int displayindex;
    private String err_code;
    private String ret;
    private String return_msg;
    private List<DatasBean> datas;

    public int getDisplayindex() {
        return displayindex;
    }

    public void setDisplayindex(int displayindex) {
        this.displayindex = displayindex;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * art_typeid : 30
         * art_typename : 推荐
         */

        private int art_typeid;
        private String art_typename;

        public int getArt_typeid() {
            return art_typeid;
        }

        public void setArt_typeid(int art_typeid) {
            this.art_typeid = art_typeid;
        }

        public String getArt_typename() {
            return art_typename;
        }

        public void setArt_typename(String art_typename) {
            this.art_typename = art_typename;
        }
    }
}
