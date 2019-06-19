package com.example.e_commerce.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import com.example.e_commerce.Adapter.RecyclerAdapter;
import com.example.e_commerce.ModelClass.ListModel;
import com.example.e_commerce.R;

import java.util.ArrayList;
import java.util.List;

public class Search_Activity1 extends AppCompatActivity {

    private RecyclerView recycler_view;
    private SearchView searchView;
    private List<ListModel> listModels;
    private LinearLayoutManager layoutManager;
    int numberOfColumns = 3;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_1);




        recycler_view=findViewById(R.id.recyclerview);
        searchView=findViewById(R.id.searchView);

        listModels=new ArrayList<ListModel>();
        ListModel listModel;
        listModel = new ListModel(R.drawable.adidas, "Addidas new market ","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.applewatch, "AppleWatch new look","345267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.asuswatch, "Asuswatch new market look","345267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.ic_launcher_foreground, "Induction","345265267");
        listModels.add(listModel);
        listModel = new ListModel(R.drawable.boschtool, "Induction","345265267");
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

        toolbar=  findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setTitle(R.string.Search_Activity);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

}

