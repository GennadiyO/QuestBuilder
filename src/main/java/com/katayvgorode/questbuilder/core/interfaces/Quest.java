package com.katayvgorode.questbuilder.core.interfaces;

import java.util.List;

public interface Quest {

    //Quest createQuest(String name);
    void add(Description description);
    void add(PicturePath picturePath);
    void add(List<Point> points);
    QuestXML save();
}