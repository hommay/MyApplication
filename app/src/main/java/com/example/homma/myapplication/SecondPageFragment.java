package com.example.homma.myapplication;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SearchView;

/**
 * Created by fujimoto_t on 2018/03/24.
 */

public class SecondPageFragment extends Fragment {
    private final static String BACKGROUND_COLOR = "background_color";
    private String searchWord;

    public static SecondPageFragment newInstance(@ColorRes int IdRes) {
        SecondPageFragment frag = new SecondPageFragment();
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
        View view = inflater.inflate(R.layout.secondfragment, container, false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_main_linearlayout);

        //SearchViewの実装
        SearchView searchView = (SearchView) view.findViewById(R.id.search);
        searchView.setIconifiedByDefault(false);
        searchView.setSubmitButtonEnabled(true);
        return view;
    }
}

