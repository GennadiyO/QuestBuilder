package com.katayvgorde.questbuilder.core;

import com.katayvgorde.questbuilder.core.interfaces.*;

import java.util.List;

public class SimpleQuest implements Quest {
    private String name;
    private Description description;
    private PicturePath picturePath;
    private List<Point> points;

    public SimpleQuest(String name){
        this.name = name;
    }
/*
    public Quest createQuest(String name) {
        return new SimpleQuest(name);
    }
*/
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
}
