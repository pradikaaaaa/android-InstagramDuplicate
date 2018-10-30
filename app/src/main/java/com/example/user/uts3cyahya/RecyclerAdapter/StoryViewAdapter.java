package com.example.user.uts3cyahya.RecyclerAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.uts3cyahya.FungsiClass.StoryImage;
import com.example.user.uts3cyahya.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by user on 28/10/2018.
 */

public class StoryViewAdapter extends RecyclerView.Adapter<StoryViewAdapter.ViewHolder>{
    private ArrayList<StoryImage> rvData;

    public StoryViewAdapter(ArrayList<StoryImage> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvUser;
        public CircleImageView imgProfile;

        public ViewHolder(View v){
            super(v);
            tvUser = v.findViewById(R.id.tvUserStory);
            imgProfile = v.findViewById(R.id.imageProfileStory);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_story,
                parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewAdapter.ViewHolder holder, int position) {
        holder.tvUser.setText(rvData.get(position).getUsername());
        holder.imgProfile.setImageResource(rvData.get(position).getImagePP());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
