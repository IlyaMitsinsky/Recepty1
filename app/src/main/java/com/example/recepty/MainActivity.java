package com.example.recepty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Recept> spisokReceptov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: переделать под загрузку из интернета;

        spisokReceptov = new ArrayList<Recept>();

        Recept recept = new Recept("Омлет","Описание","Описание");
        recept.setFoto("omlet.png");


        ArrayList<IngredienRecepta> ingredients = new ArrayList<IngredienRecepta>();
        IngredienRecepta ingredient = new IngredienRecepta("Яйцо куриное", 6.0, "шт.");
        ingredients.add(ingredient);
        ingredient = new IngredienRecepta("Молоко", 200.0, "мл");
        ingredients.add(ingredient);
        ingredient = new IngredienRecepta("Соль поваренная");
        ingredients.add(ingredient);

        recept.setIngredienty(ingredients);

        spisokReceptov.add(recept);

     //   ArrayList<String> nazvania = new ArrayList<String>();

      //  for (Recept rb: spisokReceptov){
       //     nazvania.add(rb.getNazvanie());
       // }

        // находим список
        final ListView spisokView = (ListView) findViewById(R.id.spisok);

        // создаем адаптер
        ArrayAdapter<Recept> adapter = new ArrayAdapter<Recept>(this,
                android.R.layout.simple_list_item_1, spisokReceptov);

        // присваиваем адаптер списку
        spisokView.setAdapter(adapter);

        spisokView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Создаём объект для сериализации рецепта
                Gson gson = new Gson();
                //получаем рецепт, на который нажал пользователь
                Recept recept = (Recept)((ListView)findViewById(R.id.spisok)).getSelectedItem();
                //Сериализуем объект рецепт в строку
                String receptJson = gson.toJson(recept);
                //создаём интент для перезода в активити ReceptInfo
                Intent i = new Intent(MainActivity.this,ReceptInfo.class);
                //Добавляем в интент данные
                i.putExtra("receptJson",receptJson);

                startActivity(i);


            }
        });



    }
}
