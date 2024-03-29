package com.marcus.todolistt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> toDoItemArrayList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoItemArrayList = objects;
    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Obtain the LayoutInflater object
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // "Inflate" the View for each row
            View personalView = inflater.inflate(layout_id, parent, false);

            // Obtain the UI components and do the necessary binding
            TextView tvTitle = personalView.findViewById(R.id.textViewTitle);
            TextView tvDate = personalView.findViewById(R.id.textViewDate);

            // Obtain the Android Version information based on the position
            ToDoItem currentVersion = toDoItemArrayList.get(position);

            // Set values to the TextView to display the corresponding information
            tvTitle.setText(currentVersion.getTitle());
            tvDate.setText(currentVersion.getDateString());

            return personalView;
    }
}
