package com.katayvgorode.questbuilder.core;

import java.util.List;

import com.katayvgorode.questbuilder.core.interfaces.Media;
import com.katayvgorode.questbuilder.core.interfaces.PicturePath;

public class QuestionWithAnswer implements Media {
    private String mediaName;
    private String mediaDescription;
    private PicturePath mediaPicture;
    private String mediaQuestion;
    private List<String> mediaAnswers;
    private int mediaRightAnswer;
    
    public QuestionWithAnswer() {
        this.mediaName = null;
        this.mediaDescription = null;
        this.mediaPicture = null;
        this.mediaQuestion = null;
        this.mediaAnswers = null;
        this.mediaRightAnswer = 0;
    }
    public QuestionWithAnswer(String mediaName, String mediaDescription, PicturePath mediaPicture, String mediaQuestion, List<String> mediaAnswers, int mediaRightAnswer) {
        this.mediaName = mediaName;
        this.mediaDescription = mediaDescription;
        this.mediaPicture = mediaPicture;
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
    public void setMediaPicture(PicturePath mediaPicture) {
        this.mediaPicture = mediaPicture;
    }
    public PicturePath getMediaPicture() {
        return mediaPicture;
    }
    public void setMediaQuestion(String mediaQuestion) {
        this.mediaQuestion = mediaQuestion;
    }
    public String getMediaQuestion() {
        return mediaQuestion;
    }
    public void setMediaAnswers(List<String> mediaAnswers) {
        this.mediaAnswers = mediaAnswers;
    }
    public List<String> getMediaAnswers() {
        return mediaAnswers;
    }
    public void setMediaRightAnswer(int mediaRightAnswer) {
        this.mediaRightAnswer = mediaRightAnswer;
    }
    public int getMediaRightAnswer() {
        return mediaRightAnswer;
    }
}
