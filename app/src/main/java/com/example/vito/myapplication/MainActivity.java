package com.example.vito.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btConnection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfirstlayout);

        //on recupère le bouton dans une variable
        btConnection = (Button) findViewById(R.id.bt_connection);

        btConnection.setOnClickListener(this);
    }
    // Methode associé à l'appui du Bouton
    public void onClick(View view)
    {

        if(R.id.bt_connection == view.getId())
        {
            Log.i("Bouton","Clic Clic!");

            Intent nextActivity = new Intent(this,DetailActivity.class);
            //on passe l'intention au système
            startActivity(nextActivity);
        }
        else
        {
            Log.e("Bonton","clic pas implémenté !");
        }
    }
}