package com.marcus.todolistt;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<ToDoItem> itemList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem=findViewById(R.id.listViewMSA);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2019,7,1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2019,9,22);

        itemList = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("MSA", calendar1);
        ToDoItem item2 = new ToDoItem("Go for haircut", calendar2);


        itemList.add(item1);
        itemList.add(item2);

        adapter = new CustomAdapter(this,R.layout.personal, itemList);
        lvItem.setAdapter(adapter);
    }
}
