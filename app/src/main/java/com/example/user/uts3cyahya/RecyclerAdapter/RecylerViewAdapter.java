package com.example.user.uts3cyahya.RecyclerAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.uts3cyahya.FungsiClass.PostImage;
import com.example.user.uts3cyahya.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by user on 23/10/2018.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.ViewHolder>{
    private ArrayList<PostImage> rvData;

    public RecylerViewAdapter(ArrayList<PostImage> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvUsername;
        public TextView tvCaption;
        public TextView tvJumlahLike;
        public ImageView imgPost;
        public CircleImageView imgProfile;

        public  ViewHolder(View v){
            super(v);
            tvUsername = v.findViewById(R.id.tvUser);
            tvCaption = v.findViewById(R.id.tvCaption);
            tvJumlahLike = v.findViewById(R.id.tvLikes);
            imgPost = v.findViewById(R.id.imagePost);
            imgProfile = v.findViewById(R.id.imageProfile);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_list,parent,false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvUsername.setText(rvData.get(position).getIdUser());
        holder.tvCaption.setText(rvData.get(position).getCaption());
        holder.tvJumlahLike.setText(rvData.get(position).getLikes()+" likes");
        holder.imgPost.setImageResource(rvData.get(position).getImagePost());
        holder.imgProfile.setImageResource(rvData.get(position).getImageProfile());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }




}
