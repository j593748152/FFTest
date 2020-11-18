package com.jws.fftest.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.jws.fftest.R;
import com.jws.fftest.entity.QuestionBean;
import com.jws.fftest.entity.QuestionType;

import java.util.List;

/**
 * 类说明
 *
 * @author jiangwensong
 * @date 2020/11/18
 */
public class QuestionAdapter extends PagerAdapter {
    private static final String TAG = "QuestionAdapter";
    private List<QuestionBean> mDatas;


    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_question, null);
        //
        TextView question = view.findViewById(R.id.question);
        RecyclerView recyclerView = view.findViewById(R.id.rv_answer_list);
        EditText editText = view.findViewById(R.id.edit_text);
        LinearLayout llCorrectAnswer = view.findViewById(R.id.ll_correct_answer);
        TextView correctAnswer = view.findViewById(R.id.correct_answer);
        //
        QuestionBean bean = mDatas.get(position);
        if(bean.getType() == QuestionType.choice){
            recyclerView.setVisibility(View.VISIBLE);
            editText.setVisibility(View.GONE);
        }else if (bean.getType() == QuestionType.choice){
            recyclerView.setVisibility(View.GONE);
            editText.setVisibility(View.VISIBLE);
        }else {
            Log.e(TAG,"question type error");
        }
        if (bean.isAnswered()){
            llCorrectAnswer.setVisibility(View.VISIBLE);
        }else {
            llCorrectAnswer.setVisibility(View.GONE);
        }
        //
        question.setText(bean.getQuestion());
        correctAnswer.setText(bean.getCorrectAnswer());
        AnswerAdapter answerAdapter = new AnswerAdapter(bean.getAnswerList());
        recyclerView.setAdapter(answerAdapter);
        //TODO
        //
        return view;
    }
}
