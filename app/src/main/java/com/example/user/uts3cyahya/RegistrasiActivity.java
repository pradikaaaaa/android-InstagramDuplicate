package com.example.user.uts3cyahya;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.uts3cyahya.Koneksi.DataHelper;

public class RegistrasiActivity extends AppCompatActivity {
    DataHelper dbHelper;
    Button btnDaftar;
    EditText email, nama, username, password;
    TextView tvMnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        email = findViewById(R.id.editTextEmail);
        nama = findViewById(R.id.editTextNama);
        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);

        dbHelper = new DataHelper(this);

        tvMnLogin = findViewById(R.id.tvMenuLogin);
        btnDaftar = findViewById(R.id.buttonCreateAkun);


        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cekKosong(email) && cekKosong(nama) && cekKosong(username) && cekKosong(password)){
                    BuatAkun(email.getText().toString(),nama.getText().toString(),username.getText().toString(),password.getText().toString());
                }else{
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvMnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(login);
            }
        });

    }

    public boolean cekKosong(EditText editText){
        if(editText.getText().toString().length() == 0){
            return false;
        }else{
            return true;
        }
    }

    public void BuatAkun(String email, String nama, String username, String password){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL("INSERT INTO tbl_user(email,nama,username,password)" +
                "VALUES ('"+email+"','"+nama+"', '"+username+"','"+password+"')");
        Toast.makeText(getApplicationContext(),"Anda sudah terdaftar",Toast.LENGTH_SHORT).show();
        finish();
    }
}
