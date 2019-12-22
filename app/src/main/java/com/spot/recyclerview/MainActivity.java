package com.spot.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordListAbdul = new LinkedList<>();
    private int mCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //step 1
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            mWordListAbdul.addLast("Word " + mCount++);
            Log.d("WordList", mWordListAbdul.getLast());
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        //step 1a.
        WordListAdapterAmit amit = new WordListAdapterAmit(this,mWordListAbdul);// step 2
        RecyclerView recyclerView = findViewById(R.id.recyclerViewChaya);
        recyclerView.setAdapter(amit);//step 3

        LinearLayoutManager nikitaLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(nikitaLayoutManager);

    }
}
