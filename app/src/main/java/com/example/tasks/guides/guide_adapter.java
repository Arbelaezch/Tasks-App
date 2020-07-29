package com.example.tasks.guides;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.tasks.R;

public class guide_adapter extends ArrayAdapter {

    //to reference the Activity / Stores what activity the ListView is on.
    private final Activity context;

    //to store the animal images
    //private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    //private final String[] infoArray;


    public guide_adapter(Activity context, String[] nameArrayParam) {
        super(context, R.layout.guide_row_listview , nameArrayParam);
        this.context = context;
        //this.imageIDarray = imageIDarray;
        this.nameArray = nameArrayParam;
        //this.infoArray = infoArray;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.guide_row_listview, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.guides_titles);
        //TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        //infoTextField.setText(infoArray[position]);
        //imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };
}
