package com.example.trainhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailListView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_view);

        ImageView img = (ImageView) findViewById(R.id.imgdetail);
        TextView txt = (TextView) findViewById(R.id.txtdetail);

        //Bawa data, putExtra buat bawa data
        Intent b = getIntent();
        String namabuah = b.getStringExtra("namabuah");
        Integer gambarbuah = b.getIntExtra("gambarbuah", 0);

        img.setImageResource(gambarbuah);
        txt.setText(namabuah);
    }
}
