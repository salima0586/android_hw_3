package com.example.android_hw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public
class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Country> list;
    Adapter adapter;


    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        initRecyclerView();
        initData();




    }
    private
    void initRecyclerView() {
        recyclerView = findViewById( R.id.recyclerView );
        adapter = new Adapter(  list);
        recyclerView.setAdapter( adapter );

        adapter.notifyDataSetChanged();
    }
    private
    void initData() {
        list = new ArrayList<>();

        list.add( new Country( R.drawable.kg,"Kyrgyzstan","Bishkek" ) );
        list.add( new Country( R.drawable.ru,"Russian","Москва" ) );
        list.add( new Country( R.drawable.by,"Белоруссия","Минск" ) );
        list.add( new Country( R.drawable.ua,"Украина","Киев" ) );
        list.add( new Country( R.drawable.tr,"Турция","Анкара" ) );
        list.add( new Country( R.drawable.it,"Италия","Рим" ) );
        list.add( new Country( R.drawable.jp,"Япония","Токио" ) );
        list.add( new Country( R.drawable.ch,"Чехия","Прага" ) );
        list.add( new Country( R.drawable.es,"Швейцария","Берн" ) );
        list.add( new Country( R.drawable.cz,"Испания","Мадрид" ) );
        list.add( new Country( R.drawable.in,"Индия","Дели" ) );
        list.add( new Country( R.drawable.td,"Молдова","Кишинев" ) );
        list.add( new Country( R.drawable.mv,"Азербайжан","Баку" ) );
        list.add( new Country( R.drawable.ge,"Грузия","Тбилиси" ) );
        list.add( new Country( R.drawable.au,"Австралия","Канберра" ) );
    }


}