package com.example.trainhelloworld;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    //Base adapter ambil list dan ditaruh di Base Adapter
    Activity act;
    Integer[] id_gambar_buah2;
    String[] nama_buah2;

    public CustomAdapter(MainActivity mainActivity, Integer[] id_gambar_buah, String[] nama_buah) {
        act = mainActivity;
        id_gambar_buah2 = id_gambar_buah;
        nama_buah2 = nama_buah;
    }

    @Override
    public int getCount() {
        return id_gambar_buah2.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) act.getSystemService(act.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_item, null);
        //Buat wadahnya
        ImageView img = (ImageView) v.findViewById(R.id.imgbuah);
        TextView txt = (TextView) v.findViewById(R.id.txtnamabuah);

        //Tampilkan isinya
        txt.setText(nama_buah2[i]);
        img.setImageResource(id_gambar_buah2[i]);

        return v;
    }
}
