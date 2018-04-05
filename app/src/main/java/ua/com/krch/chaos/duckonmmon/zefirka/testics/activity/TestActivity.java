package ua.com.krch.chaos.duckonmmon.zefirka.testics.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.R;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.animation.ZoomOutPageTransformer;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.constant.Constants;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.entity.Test;
import ua.com.krch.chaos.duckonmmon.zefirka.testics.fragment.ItemViewPagerFragment;

public class TestActivity extends AppCompatActivity implements ItemViewPagerFragment.OnFragmentRadioButtonClickListener {

    @BindView(R.id.pager)
    ViewPager viewPager;

    private Test test;

    private ArrayList<String> answersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        test = (Test) getIntent().getSerializableExtra(Constants.TEST);

        answersList = new ArrayList<>();

        ScreenSlidePagerAdapter screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(screenSlidePagerAdapter);
        viewPager.setPageTransformer(true,new ZoomOutPageTransformer());


    }

    @Override
    public void OnClick(String answer) {

    }

    @Override
    public void OnFinishClick() {

    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ItemViewPagerFragment.newInstance(test,position);
        }

        @Override
        public int getCount() {
            return test.getQuestions().size();
        }
    }
}