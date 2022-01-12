package com.example.rvinsidensv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.rvinsidensv.adapter.CustomAdapter;
import com.example.rvinsidensv.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    NestedScrollView nestedScrollView;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


        ArrayList<Member> members = prepareMemberList();
        refreshAdapter(members);
    }



    private void initViews() {
        nestedScrollView = findViewById(R.id.nestedScrollView);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

    }

    private void refreshAdapter(ArrayList<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }

    private ArrayList<Member> prepareMemberList() {
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            if(i == 1 || i == 10){
                members.add(new Member("PDP"+i, "PDP"+i));
            } else{
                members.add(new Member("PDP"+i, "PDP"+i));
            }
        }
        return members;
    }
}