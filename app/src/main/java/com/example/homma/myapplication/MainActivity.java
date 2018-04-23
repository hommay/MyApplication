package com.example.homma.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }

    private void setViews() {

        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        tabLayout = (TabLayout) findViewById(R.id.main_tab);
        viewPager = (ViewPager) findViewById(R.id.main_viewpager);

        toolbar.setTitle("EVENT's");
        setSupportActionBar(toolbar);

        FragmentManager manager = getSupportFragmentManager();
        MainFragmentPagerAdapter adapter = new MainFragmentPagerAdapter(manager);
        Fragment fragone = new FirstPageFragment();
        Fragment fragtwo = new SecondPageFragment();
        Fragment fragthird = new ThirdPageFragment();
        Fragment fragfourth = new FourthPageFragment();

        Bundle args = new Bundle();
        args.putString("text", "First Fragment");
        fragone.setArguments(args);

        args = new Bundle();
        args.putString("text", "Second Fragment");
        fragtwo.setArguments(args);

        args = new Bundle();
        args.putString("text", "Third Fragment");
        fragthird.setArguments(args);

        args = new Bundle();
        args.putString("text", "Third Fragment");
        fragfourth.setArguments(args);

        adapter.addFragment(fragone, "New!");
        adapter.addFragment(fragtwo, "search");
        adapter.addFragment(fragthird, "favorite");
        adapter.addFragment(fragfourth, "my page");

        viewPager.setAdapter(adapter);

        setDrawer();
        tabLayout.setupWithViewPager(viewPager);
        setupTabLayout();
    }

    private void setupTabLayout() {
        tabLayout.getTabAt(0).setIcon(R.drawable.report_problem_black);
        tabLayout.getTabAt(1).setIcon(R.drawable.search_black);
        tabLayout.getTabAt(2).setIcon(R.drawable.favorite_black);
        tabLayout.getTabAt(3).setIcon(R.drawable.perm_identity_black);
    }

    private void setDrawer() {
        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawer);
        NavigationView navigationView = (NavigationView) findViewById(R.id.main_drawer_navigation);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(select);
    }

    private NavigationView.OnNavigationItemSelectedListener select = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            //本来ならここで分岐の処理を
            drawerLayout.closeDrawers();
            return true;
        }
    };
}
