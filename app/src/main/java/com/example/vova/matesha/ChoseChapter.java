package com.example.vova.matesha;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ChoseChapter extends AppCompatActivity {
    
    ViewPager pager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_chapter);

        pager = findViewById(R.id.pager);
        pagerAdapter = new SampleFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    TabLayout tabLayout = findViewById(R.id.sliding_tabs);
    tabLayout.setupWithViewPager(pager);
        tabLayout.setTabTextColors(Color.BLACK,Color.WHITE);
    }

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
  final int PAGE_COUNT = 2;
  private String tabTitles[] = new String[] { getString(R.string.algebra), getString(R.string.geometry)};


  public SampleFragmentPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override public int getCount() {
      return PAGE_COUNT;
  }

  @Override public Fragment getItem(int position) {
    return Chapters.newInstance(position + 1);
  }

  @Override public CharSequence getPageTitle(int position) {
    return tabTitles[position];
  }
}

    }

