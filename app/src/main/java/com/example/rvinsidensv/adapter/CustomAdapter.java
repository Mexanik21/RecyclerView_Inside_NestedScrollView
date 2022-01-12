package com.example.rvinsidensv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rvinsidensv.R;
import com.example.rvinsidensv.model.Member;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Member> members;

    public CustomAdapter(Context context, ArrayList<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout_view,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
        if(holder instanceof CustomViewHolder){
            TextView textView = ((CustomViewHolder) holder).textView;
        }
    }


    @Override
    public int getItemCount() {
        return members.size();
    }


    private class CustomViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView textView;

        public CustomViewHolder(View v) {
            super(v);
            view = v;
            textView = view.findViewById(R.id.tv_text);
        }
    }

}
