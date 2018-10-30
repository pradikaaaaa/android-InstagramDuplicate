package com.example.user.uts3cyahya;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.uts3cyahya.Koneksi.SessionManagement;
import com.example.user.uts3cyahya.RecyclerAdapter.ImageAdapterGridView;

public class ProfileActivity extends AppCompatActivity {
    GridView mGridView;
    TextView mUser, mNama, mEmail;
    Button btnLogout;
    ImageView btnHome;
    Integer[] imageIDs = {
      R.drawable.ayamjago, R.drawable.pic4, R.drawable.pic6,
            R.drawable.pic2, R.drawable.pic1, R.drawable.pic3,
            R.drawable.pic5, R.drawable.pp01, R.drawable.pp02,
            R.drawable.kak_seto, R.drawable.tyrantrum,
    };
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageAdapterGridView adapterGridView = new ImageAdapterGridView(imageIDs,this);

        mGridView = findViewById(R.id.GridViewProfile);
        mGridView.setAdapter(adapterGridView);

        mUser = findViewById(R.id.tvUserProfile);
        mNama = findViewById(R.id.tvNamaProfile);
        mEmail = findViewById(R.id.tvEmailProfile);

        btnLogout = findViewById(R.id.buttonLogoutProfile);
        btnHome = findViewById(R.id.imgProfileHome);
        final SessionManagement sm = new SessionManagement(getApplicationContext());

        mUser.setText(sm.getKeyUsername());
        mNama.setText(sm.getKeyNama());
        mEmail.setText("email : "+sm.getKeyEmail());

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sm.logoutUser();
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
