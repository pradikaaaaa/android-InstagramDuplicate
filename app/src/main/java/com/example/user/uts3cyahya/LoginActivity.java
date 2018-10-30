package com.example.user.uts3cyahya;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.uts3cyahya.Koneksi.DataHelper;
import com.example.user.uts3cyahya.Koneksi.SessionManagement;

public class LoginActivity extends AppCompatActivity {
    Button btnMasuk, btnLogin;
    TextView tvDaftar;
    protected Cursor cursor;
    EditText user, pass;
    DataHelper dbHelper;
    //SessionManagement sessionManagement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHelper = new DataHelper(this);
        user = findViewById(R.id.edtUsername);
        pass = findViewById(R.id.edtPassword);

        btnLogin = findViewById(R.id.buttonLogin);
        btnMasuk = findViewById(R.id.buttonMasukSebagai);
        tvDaftar = findViewById(R.id.tvMenuDaftar);

        SessionManagement sessionManagement = new SessionManagement(this.getApplication());

        if(sessionManagement.isLoggedIn()){
            goToMenu();
        }

        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daftar = new Intent(getApplicationContext(),RegistrasiActivity.class);
                startActivity(daftar);
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CekLogin(user.getText().toString(),pass.getText().toString());

            }
        });


        btnMasuk.setText("Masuk sebagai @yahuya");
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CekLogin("yahuya","qwerty");
            }
        });

    }

    public void CekLogin(String user, String pass){
        SessionManagement sessionManagement = new SessionManagement(this.getApplication());
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM tbl_user WHERE username = " +
                        "'"+user+"' AND password = '"+pass+"'",
                null);
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            sessionManagement.createLoginSession(user,cursor.getString(1).toString(),cursor.getString(2).toString());
            Toast.makeText(getApplicationContext(),"Benar",Toast.LENGTH_SHORT).show();
            goToMenu();
        }else{
            Toast.makeText(getApplicationContext(),"Salah",Toast.LENGTH_SHORT).show();
        }
    }

    public void goToMenu(){
        Intent login = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(login);
    }

}
