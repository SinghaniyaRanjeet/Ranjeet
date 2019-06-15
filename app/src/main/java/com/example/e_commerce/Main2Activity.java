package com.example.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recycler_view;
    private List<ListModel> listModels;
    private LinearLayoutManager layoutManager;
    int numberOfColumns = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        recycler_view=findViewById(R.id.recyclerview);
        listModels=new ArrayList<ListModel>();
        ListModel listModel;


        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_background, "Induction","345267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_background, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_background, "Induction","345267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_background, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);



        layoutManager = new LinearLayoutManager(this);
        recycler_view.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        RecyclerAdapter adapter = new RecyclerAdapter(this, listModels);
        recycler_view.setAdapter(adapter);





    }
    }

