package com.blogspot.yourfavoritekaisar.arableague;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class namanegaraActivity extends AppCompatActivity {

    @BindView(R.id.txtDetail)
    TextView txtDetail;
    @BindView(R.id.txt_Bio)
    TextView txtBio;
    @BindView(R.id.FotoNegara)
    ImageView FotoNegara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namanegara);
        ButterKnife.bind(this);

        txtDetail.setText(getIntent().getStringExtra("dn"));
        txtBio.setText(getIntent().getStringExtra("nn"));
        Glide.with(this).load(getIntent().getIntExtra("fn", 0)).into(FotoNegara);
    }
}
