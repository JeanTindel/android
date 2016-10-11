package com.example.vito.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<String>datas = new ArrayList<String>();
    ListView listView;
    ArrayAdapter arrayAdapter;

    Button btAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //on recupère le bouton dans une variable
        btAdd = (Button) findViewById(R.id.btAdd);

        btAdd.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.ListView);
        //on construit un objet qui va faire la passerelle entre le tableau d'objet java et la vue ListView
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas);
        //on associe l'adaptater a notre listView
        listView.setAdapter(arrayAdapter);
    }

    public void onClick(View view)
    {
        EditText objet = (EditText)findViewById(R.id.Text);

        arrayAdapter.notifyDataSetChanged();
        datas.add(objet.getText().toString());

        objet.setText("");

    }
}