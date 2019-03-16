package com.example.recepty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class ReceptInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recept_info);

        Intent intent = getIntent();
        //извлекаем gson строчку из интент
        String receptJson = intent.getStringExtra("receptJson");

        Gson gson = new Gson();
        //десериализуем объект класса рецепт
        Recept rb = gson.fromJson(receptJson,Recept.class);

        //вывод информации по рецепту на активити

        TextView nazv = (TextView)findViewById(R.id.textViewNazv);
        nazv.setText(rb.getNazvanie());

        TextView opis = (TextView)findViewById(R.id.textViewOpis);
        opis.setText(rb.getPolnoeOpisanie());


    }
}
