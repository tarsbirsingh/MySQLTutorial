package com.example.tarsbir.mysqltutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void mTutorial(View view){
        Intent Tutorial = new Intent(this,TutorialActivity.class);
        startActivity(Tutorial);
    }
    public void askQuestion(View view){
        Intent i = new Intent(MainActivity.this,AskQuestion.class);
        startActivity(i);
    }
}
