package com.example.homma.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by fujimoto_t on 2018/03/24.
 */

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {
    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstPageFragment.newInstance(android.R.color.holo_blue_bright);
            case 1:
                return SecondPageFragment.newInstance(android.R.color.holo_green_light);
            case 2:
                return ThirdPageFragment.newInstance(android.R.color.holo_red_dark);
            case 3:
                return FourthPageFragment.newInstance(android.R.color.holo_orange_light);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "NEW!!";
            case 1:
                return "イベントを探す";
            case 2:
                return "お気に入り";
            case 3:
                return "マイページ";
        }
        return null;
    }
}