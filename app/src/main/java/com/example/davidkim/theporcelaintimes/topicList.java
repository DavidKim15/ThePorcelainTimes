package com.example.davidkim.theporcelaintimes;

/**
 * Created by davidkim on 1/9/17.
 */

import java.util.ArrayList;

public class topicList {

    private ArrayList<topic> listOfGivenTopics = new ArrayList<topic>();

    public topicList() {

    }

    public void addTopics(topic t) {
        listOfGivenTopics.add(t);
    }

    public topic getTopic(int i) {
        return listOfGivenTopics.get(i);
    }

}
