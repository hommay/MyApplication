package com.example.homma.myapplication;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by fujimoto_t on 2018/03/24.
 */

public class ThirdPageFragment extends Fragment {
    private final static String BACKGROUND_COLOR = "background_color";

    public static ThirdPageFragment newInstance(@ColorRes int IdRes) {
        ThirdPageFragment frag = new ThirdPageFragment();
        Bundle b = new Bundle();
        b.putInt(BACKGROUND_COLOR, IdRes);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thirdfragment, null);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_main_linearlayout);

        return view;
    }
}
