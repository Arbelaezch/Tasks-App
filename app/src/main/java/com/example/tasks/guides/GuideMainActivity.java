package com.example.tasks.guides;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tasks.R;

public class GuideMainActivity extends AppCompatActivity {
    private ListView listView;

    String[] nameArray = {"Walrus","Pig","Sheep","Rabbit","Snake","Spider" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_main);

        guide_adapter whatever = new guide_adapter(this, nameArray);

        // Reference to the listView from activity_main.xml using its id.
        listView = findViewById(R.id.guides_list);
        listView.setAdapter(whatever);

    }
}