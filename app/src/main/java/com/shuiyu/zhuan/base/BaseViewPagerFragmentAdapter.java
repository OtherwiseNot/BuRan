package com.shuiyu.zhuan.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * <pre>
 * author : buran
 * time   : 2018/07/03
 * </pre>
 */
public class BaseViewPagerFragmentAdapter<T extends Fragment> extends FragmentStatePagerAdapter {
    private List<T> listData;

    private List<String> listTitle;

    public BaseViewPagerFragmentAdapter(FragmentManager fm , List<T> listData, List<String> listTitle) {
        super(fm);
        this.listData = listData;
        this.listTitle = listTitle;
    }

    public List<T> getListData() {
        return listData;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }

    public List<String> getListTitle() {
        return listTitle;
    }

    public void setListTitle(List<String> listTitle) {
        this.listTitle = listTitle;
    }

    @Override
    public T getItem(int position) {
        return listData == null ? null : listData.get(position);
    }

    @Override
    public int getCount() {
        return listData == null ? 0 : listData.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (listTitle != null && listTitle.size() != 0) {
            return listTitle.get(position);
        }
        return super.getPageTitle(position);
    }
}
