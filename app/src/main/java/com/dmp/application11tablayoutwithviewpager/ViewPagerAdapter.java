package com.dmp.application11tablayoutwithviewpager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int numberOfTabs;
    Context mContext;
    public ViewPagerAdapter(Context context, @NonNull FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        this.mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new ChatFragment();
            case 1: return new StatusFragment();
            case 2: return new CallsFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mContext.getString(R.string.chat);
            case 1: return mContext.getString(R.string.status);
            case 2: return mContext.getString(R.string.calls);
            default: return null;
        }
    }
}
