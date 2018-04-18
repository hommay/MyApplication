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
                FirstPageFragment firstPageFragment = new FirstPageFragment();
                return firstPageFragment;
            case 1:
                SecondPageFragment secondPageFragment = new SecondPageFragment();
                return secondPageFragment;
            case 2:
                ThirdPageFragment thirdPageFragment = new ThirdPageFragment();
                return thirdPageFragment;
            case 3:
                FourthPageFragment fourthPageFragment = new FourthPageFragment();
                return fourthPageFragment;
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