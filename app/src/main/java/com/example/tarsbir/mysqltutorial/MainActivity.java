package com.example.tarsbir.mysqltutorial;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
   // private RecyclerView recyclerView;
    //private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
    }
    public void askQuestion(View view){
        Intent i = new Intent(MainActivity.this,AskQuestion.class);
        startActivity(i);
    }
}
