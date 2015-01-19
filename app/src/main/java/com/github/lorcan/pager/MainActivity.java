package com.github.lorcan.pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.github.lorcan.pager.fragment.Fragment1;
import com.github.lorcan.pager.fragment.Fragment2;
import com.github.lorcan.pager.view.DirectionalViewPager;

/**
 * Created by luocan on 15/1/19.
 */
public class MainActivity extends FragmentActivity {

    private DirectionalPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DirectionalViewPager pager = (DirectionalViewPager) findViewById(R.id.pager);
        pager.setOrientation(DirectionalViewPager.VERTICAL);
        adapter = new DirectionalPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }


    private class DirectionalPagerAdapter extends FragmentPagerAdapter {


        public DirectionalPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
