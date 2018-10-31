package com.blogspot.yourfavoritekaisar.arableague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecylerActivitiy extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView my_recycler_view;

    String[] nama_Negara, detail_Negara;
    int[] fotoNegara;
    AdapterArab adapterArab ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_activitiy);
        ButterKnife.bind(this);


        nama_Negara = getResources().getStringArray(R.array.nama_negara);
        detail_Negara = getResources().getStringArray(R.array.detail_negara);
        fotoNegara = new int[]{R.drawable.algeria,R.drawable.saudi,R.drawable.bahrain,R.drawable.comoros,R.drawable.djibouti,
        R.drawable.egypt,R.drawable.iraq,R.drawable.jordan,R.drawable.kuwait};

        adapterArab = new AdapterArab(RecylerActivitiy.this, fotoNegara,nama_Negara,detail_Negara);
        my_recycler_view.setHasFixedSize(true);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(RecylerActivitiy.this));
        my_recycler_view.setAdapter(adapterArab);

    }
}
