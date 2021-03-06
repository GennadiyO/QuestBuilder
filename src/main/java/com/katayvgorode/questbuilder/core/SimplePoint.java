package com.katayvgorode.questbuilder.core;

import java.util.List;

import com.katayvgorode.questbuilder.core.interfaces.Media;
import com.katayvgorode.questbuilder.core.interfaces.Point;

public class SimplePoint implements Point {
    private String name;
    private String pointDescription;
    private String longitudeCoordinate;
    private String latitudeCoordinate;
    private List<Media> mediaList;
    
    public SimplePoint(String name, String longitudeCoordinate, String latitoudeCoordinate) {
        this.name = name;
        this.longitudeCoordinate = longitudeCoordinate;
        this.latitudeCoordinate = latitoudeCoordinate;
    }
    public void addMedia(Media media){
        //TODO need to finish it like media.setPicture; media.setAudio; etc
        mediaList.add(media);
    }
}