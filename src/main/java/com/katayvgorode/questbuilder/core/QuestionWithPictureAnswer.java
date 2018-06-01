package com.katayvgorode.questbuilder.core;

import java.util.List;

import com.katayvgorode.questbuilder.core.interfaces.Media;
import com.katayvgorode.questbuilder.core.interfaces.PicturePath;

public class QuestionWithPictureAnswer implements Media {
    private String mediaName;
    private String mediaDescription;
    private String mediaQuestion;
    private List<PicturePath> mediaAnswers;
    private int mediaRightAnswer;
    
    public QuestionWithPictureAnswer() {
        this.mediaName = null;
        this.mediaDescription = null;
        this.mediaQuestion = null;
        this.mediaAnswers = null;
        this.mediaRightAnswer = 0;
    }
    public QuestionWithPictureAnswer(String mediaName, String mediaDescription, String mediaQuestion, List<PicturePath> mediaAnswers, int mediaRightAnswer) {
        this.mediaName = mediaName;
        this.mediaDescription = mediaDescription;
        this.mediaQuestion = mediaQuestion;
        this.mediaAnswers = mediaAnswers;
        this.mediaRightAnswer = mediaRightAnswer;
    }
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }
    public String getMediaName() {
        return mediaName;
    }
    public void setMediaDescription(String mediaDescription) {
        this.mediaDescription = mediaDescription;
    }
    public String getMediaDescription() {
        return mediaDescription;
    }
    public void setMediaQuestion(String mediaQuestion) {
        this.mediaQuestion = mediaQuestion;
    }
    public String getMediaQuestion() {
        return mediaQuestion;
    }
    public void setMediaAnswers(List<PicturePath> mediaAnswers) {
        this.mediaAnswers = mediaAnswers;
    }
    public List<PicturePath> getMediaAnswers() {
        return mediaAnswers;
    }
    public void setMediaRightAnswer(int mediaRightAnswer) {
        this.mediaRightAnswer = mediaRightAnswer;
    }
    public int getMediaRightAnswer() {
        return mediaRightAnswer;
    }
}