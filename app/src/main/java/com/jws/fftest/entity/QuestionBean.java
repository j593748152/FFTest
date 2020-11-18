package com.jws.fftest.entity;

import java.util.List;

/**
 * 类说明
 *
 * @author jiangwensong
 * @date 2020/11/18
 */
public class QuestionBean {
    int type;
    String question;
    List<AnswerBean> answerList;
    String privateAnswer;
    String correctAnswer;
    boolean answered;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerBean> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<AnswerBean> answerList) {
        this.answerList = answerList;
    }

    public String getPrivateAnswer() {
        return privateAnswer;
    }

    public void setPrivateAnswer(String privateAnswer) {
        this.privateAnswer = privateAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }
}
