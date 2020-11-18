package com.jws.fftest.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.jws.fftest.R;
import com.jws.fftest.adapter.QuestionAdapter;

/**
 * 类说明
 *
 * @author jiangwensong
 * @date 2020/11/18
 */
public class TestActivity extends Activity {

    private ViewPager mViewPager;
    private TextView mTittle;
    //
    private QuestionAdapter mQuestionAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
    }

    private void initView(){
        mViewPager = findViewById(R.id.view_pager);
        mTittle = findViewById(R.id.tittle);
    }

    private void initViewPager(){
        mQuestionAdapter = new QuestionAdapter();
        mViewPager.setAdapter(mQuestionAdapter);
    }
}
