package com.example.user.uts3cyahya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.user.uts3cyahya.FungsiClass.PostImage;
import com.example.user.uts3cyahya.FungsiClass.StoryImage;
import com.example.user.uts3cyahya.RecyclerAdapter.RecylerViewAdapter;
import com.example.user.uts3cyahya.RecyclerAdapter.StoryViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvView, rvStory;
    private RecyclerView.Adapter adapter, adapterStory;
    private RecyclerView.LayoutManager layoutManager, layoutManagerStory;
    private ArrayList<PostImage> dataSet;
    private ArrayList<StoryImage> dataStory;
    ImageView btnProfile;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfile = findViewById(R.id.imgMenuProfile);

        dataSet = new ArrayList<>();
        dataStory = new ArrayList<>();
        initDataset();
        initStory();

        rvView = findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecylerViewAdapter(dataSet);
        rvView.setAdapter(adapter);

        ///----------
        rvStory = findViewById(R.id.rv_story);
        rvView.setHasFixedSize(true);

        layoutManagerStory = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        rvStory.setLayoutManager(layoutManagerStory);

        adapterStory = new StoryViewAdapter(dataStory);
        rvStory.setAdapter(adapterStory);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(pro);
            }
        });

    }

    public void initDataset(){
        dataSet = new ArrayList<>();
        dataSet.add(new PostImage("kak_seto","Solusi disetiap masalah","1900",R.drawable.pic1,R.drawable.kak_seto));
        dataSet.add(new PostImage("kembangturi","#2019GantiCaptain","2000",R.drawable.pic2,R.drawable.ayamjago));
        dataSet.add(new PostImage("kembangturi","Dikala saya bingung","1341",R.drawable.pic3,R.drawable.ayamjago));
        dataSet.add(new PostImage("abdullah","Hayo maen yuk","1200",R.drawable.pic4,R.drawable.pp02));
        dataSet.add(new PostImage("kak_seto","Kalo kamu cari yang ganteng, aku mundur." +
                "Tapi kalo kamu cari yang mundur, aku ganteng.","5000",R.drawable.pic6,R.drawable.kak_seto));
//        dataSet.add(new PostImage("yahuya","Bismillah hari pertama lancar","1.900"));
//        dataSet.add(new PostImage("dimdim","Hallo gaes","10"));
//        dataSet.add(new PostImage("yahuya","Kau tidak benar - benar membuka hati, sebab aku hanya sebatas pelampiasan rasa sepi.","2.000"));
    }

    public void initStory(){
        dataStory = new ArrayList<>();
        dataStory.add(new StoryImage(R.drawable.kak_seto,"yahuya"));
        dataStory.add(new StoryImage(R.drawable.ayamjago,"pradika"));
        dataStory.add(new StoryImage(R.drawable.pp01,"abcd"));
        dataStory.add(new StoryImage(R.drawable.pp02,"qwerty"));
        dataStory.add(new StoryImage(R.drawable.pp03,"bowooo"));
        dataStory.add(new StoryImage(R.drawable.pp02,"qwerty"));
        dataStory.add(new StoryImage(R.drawable.pp03,"bowooo"));
        dataStory.add(new StoryImage(R.drawable.pp02,"qwerty"));
        dataStory.add(new StoryImage(R.drawable.pp03,"bowooo"));

//        dataStory.add("yahuya");
//        dataStory.add("shanju");
//        dataStory.add("nabilah");
//        dataStory.add("haruka");
//        dataStory.add("melody");
//        dataStory.add("putri");
//        dataStory.add("kutu");
//        dataStory.add("kusam");
    }
}
