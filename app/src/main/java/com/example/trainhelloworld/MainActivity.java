package com.example.trainhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Inisialisasi Variable dan Array
    ListView list;
    //Insisialisaasi Array
    private String[] nama_buah = {"Alpukat", "Apel", "Ceri", "Durian", "Jambu", "Manggis", "Strawberry"};
    private Integer[] id_gambar_buah = {R.drawable.apel1, R.drawable.apel1, R.drawable.ceri1,
            R.drawable.duriani, R.drawable.jambuairi, R.drawable.manggisi, R.drawable.strawberrya};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Tampilan
        list = (ListView) findViewById(R.id.listView2);

        //Buat class baru dengan nama CustomAdapter
        CustomAdapter adapter = new CustomAdapter(this, id_gambar_buah, nama_buah);
        list.setAdapter(adapter);

        //Aksi ketika action di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent b = new Intent(MainActivity.this, DetailListView.class);
                b.putExtra("namabuah", nama_buah[i]);
                b.putExtra("gambarbuah", id_gambar_buah[i]);
                startActivity(b);
            }
        });
    }
}
