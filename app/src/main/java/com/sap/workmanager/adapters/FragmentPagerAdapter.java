package com.sap.workmanager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sap.workmanager.model.Sheet1;

import java.util.ArrayList;

/**
 * Created by Varun Karhadkar on 05/08/2018.
 */

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private Sheet1 sheet;
    private ArrayList<AdapterWraper> mList;

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setData(ArrayList<AdapterWraper> s1) {
        this.mList = s1;
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        OperationsFragment fragment = new OperationsFragment();
        fragment.setData(mList.get(position).getOperation());
        return fragment;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position).getTitle();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;

    }
}
