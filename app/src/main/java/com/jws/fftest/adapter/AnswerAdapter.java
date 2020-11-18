package com.jws.fftest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jws.fftest.R;

import java.util.List;

/**
 * 类说明
 *
 * @author jiangwensong
 * @date 2020/11/18
 */
public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.AnswerVH> {
    List<String> mDatas;

    public AnswerAdapter(List<String> data){
        mDatas = data;
    }

    @NonNull
    @Override
    public AnswerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerVH holder, int position) {
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    class AnswerVH extends RecyclerView.ViewHolder {
        TextView serial;
        TextView answer;

        public AnswerVH(@NonNull View itemView) {
            super(itemView);
            serial = itemView.findViewById(R.id.serial);
            answer = itemView.findViewById(R.id.answer);
        }

        public void bindView(int position){
            String answerStr = mDatas.get(position);
            answer.setText(answerStr);
            //TODO
        }

    }
}
