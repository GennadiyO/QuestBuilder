package com.katayvgorode.questbuilder.core;

import com.katayvgorode.questbuilder.core.interfaces.*;

import java.util.List;

public class SimpleQuest implements Quest {
    private String name;
    private Description description;
    private PicturePath picturePath;
    private List<Point> points;
    private Point firstPoint;
    private int comlexity;
    private int distance;
    private int ageRate;

    public SimpleQuest(String name){
        this.name = name;
    }
    public void add(Description description) {
        this.description = description;
    }
    public void add(PicturePath picturePath) {
        this.picturePath = picturePath;
    }
    public void add(List<Point> points) {
        this.points = points;
    }
    public QuestXML save() {
        //TODO need to finish this method
        return null;
    }
    public String getName() {
        return name;
    }
    public Description getDescription() {
        return description;
    }
    public PicturePath getPicturePath() {
        return picturePath;
    }
    public List<Point> getPoints() {
        return points;
    }
    public void setAgeRate(int ageRate) {
        this.ageRate = ageRate;
    }
    public void setComlexity(int comlexity) {
        this.comlexity = comlexity;
    }
    public void addToDistance(int distance) {
        this.distance = this.distance + distance;
    }
    public int getAgeRate() {
        return ageRate;
    }
    public int getComlexity() {
        return comlexity;
    }
    public int getDistance() {
        return distance;
    }
    public void setFirstPoint() {
        if (points.isEmpty()) {
            this.firstPoint = null;
        } else {
            this.firstPoint = points.get(0);
        }
    }
    public Point getFirstPoint() {
        return firstPoint;
    }
}