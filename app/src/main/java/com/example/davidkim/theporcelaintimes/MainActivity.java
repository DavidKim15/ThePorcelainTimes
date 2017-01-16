package com.example.davidkim.theporcelaintimes;

import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;
    private int count;
    private topicList topicList = new topicList();
    //this array will hold the interests that the user chooses
    private ArrayList <com.example.davidkim.theporcelaintimes.topic> array =
            new ArrayList <com.example.davidkim.theporcelaintimes.topic>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.listView);
        count = layout.getChildCount();

        for (int k = 0; k < count; k ++) {
            CheckBox child = (CheckBox)layout.getChildAt(k);
            topicList.addTopics(new topic(""+child.getText()));
        }

    }



    public void confirmInterest (View v) {


        for (int i = 0; i < count; i ++) {
            CheckBox child = (CheckBox)layout.getChildAt(i);
            if (child.isChecked()) {
                array.add(topicList.getTopic(i));
            }
        }

        for (int j = 0; j < array.size(); j ++) {
            System.out.println(array.get(j).getTopicName());
        }
    }

    public ArrayList<com.example.davidkim.theporcelaintimes.topic> getArray() {
        return array;
    }

}
