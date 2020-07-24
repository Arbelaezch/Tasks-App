package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.tasks.guides.GuideMainActivity;
import com.example.tasks.tasks.tasksMainActivity;

public class MainActivity extends AppCompatActivity {
    private Button guideButton;
    private Button taskButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        guideButton = (Button) findViewById(R.id.guideButton);
        guideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGuides();
            }
        });

        taskButton = (Button) findViewById(R.id.tasksButton);
        taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTasks();
            }
        });

    }


    public void goToGuides() {
        Intent intent = new Intent(this, GuideMainActivity.class);
        //String message = guideButton.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void goToTasks() {
        Intent intent = new Intent(this, tasksMainActivity.class);
        //String message = guideButton.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

