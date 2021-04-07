package com.example.exercisepam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity{
    TextView tvnama, tvnomor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Imam":
                tvnama.setText("ImamZakky");
                tvnomor.setText("082284299551");
                break;
            case "Zakky" :
                tvnama.setText("Zakky Imam");
                tvnomor.setText("082284299542");
                break;
            case "Rimuru" :
                tvnama.setText("Rimuru Tempest");
                tvnomor.setText("082284299543");
                break;
            case "Tempest" :
                tvnama.setText("Tempest Rimuru");
                tvnomor.setText("082284299544");
                break;
            case "Luffy" :
                tvnama.setText("D Luffy");
                tvnomor.setText("082284299545");
                break;
            case "Zoro" :
                tvnama.setText("R Zoro");
                tvnomor.setText("082284299546");
                break;
            case "Sanji" :
                tvnama.setText("V Sanji");
                tvnomor.setText("082284299547");
                break;
            case "Nami" :
                tvnama.setText("Nami Nam");
                tvnomor.setText("082284299548");
                break;
            case "Robin" :
                tvnama.setText("Nico Robin");
                tvnomor.setText("082284299549");
                break;
            case "Franky" :
                tvnama.setText("Frany Gaga");
                tvnomor.setText("082284288550");
                break;
        }
    }
}