package com.example.android.travelukraine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKyiv;
    Button btnLviv;
    Button btnOdesa;
    Button btnZaporizhzhia;
    Button btnChernivtsi;
    Button btnIvFrankivsk;
    Button btnRivne;
    Button btnLutsk;
    Button btnUzhgorod;
    Button btnKamianets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKyiv = (Button) findViewById(R.id.btnKyiv);
        btnKyiv.setOnClickListener(this);
        btnLviv = (Button) findViewById(R.id.btnLviv);
        btnLviv.setOnClickListener(this);
        btnOdesa = (Button) findViewById(R.id.btnOdesa);
        btnOdesa.setOnClickListener(this);
        btnZaporizhzhia = (Button) findViewById(R.id.btnZaporizhzhia);
        btnZaporizhzhia.setOnClickListener(this);
        btnChernivtsi = (Button) findViewById(R.id.btnChernivtsi);
        btnChernivtsi.setOnClickListener(this);
        btnIvFrankivsk = (Button) findViewById(R.id.btnIvFrankivsk);
        btnIvFrankivsk.setOnClickListener(this);
        btnRivne = (Button) findViewById(R.id.btnRivne);
        btnRivne.setOnClickListener(this);
        btnLutsk = (Button) findViewById(R.id.btnLutsk);
        btnLutsk.setOnClickListener(this);
        btnUzhgorod = (Button) findViewById(R.id.btnUzhgorod);
        btnUzhgorod.setOnClickListener(this);
        btnKamianets = (Button) findViewById(R.id.btnKamianets);
        btnKamianets.setOnClickListener(this);

        Toast toast = Toast.makeText(this, "Please choose location", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActivityCity.class);
        // указываем первым параметром ключ, а второе значение
        // по ключу мы будем получать значение с Intent
        intent.putExtra("name", ((Button) v).getText().toString());
        startActivity(intent);
    }

}


