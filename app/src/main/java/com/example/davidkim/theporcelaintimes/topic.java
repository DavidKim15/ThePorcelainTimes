package com.example.davidkim.theporcelaintimes;

import java.util.ArrayList;

/**
 * Created by davidkim on 12/28/16.
 */

public class topic {

    //each topic will have an arrayList with it for the links
    private ArrayList<Object> list = new ArrayList<Object>();

    public topic (String topic) {
        list.add(topic);
    }

    /**
     * THIS METHOD IS SUBJECT TO CHANGE DEPENDING ON HOW WE WANT TO REPRESENT OUR ARTICLES
     * (probably would need another class where we add the articles,
     * but I'm waiting for Nick to lmk how he wants to store)
     *
     * @param link
     */
    public void addLink (String link) {
        list.add(link);
    }

    public String getTopicName() {
        return ""+list.get(0);
    }
}
