package com.spot.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordListAbdul = new LinkedList<>();
    private int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            mWordListAbdul.addLast("Word " + mCount++);
            Log.d("WordList", mWordListAbdul.getLast());
        }
    }


}
