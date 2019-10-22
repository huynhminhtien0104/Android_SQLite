package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DB db=new DB(this);
        SinhVien sv =new SinhVien(2,"Huynh Minh tien");
        db.addSV(sv);
        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
    }
}
