package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Associe le layout XML à cette activité
        setContentView(R.layout.activity_main);

        // Récupération du bouton via son ID
        Button btnVoirLivres = findViewById(R.id.btnVoirLivres);

        // Ajout du listener pour le clic
        btnVoirLivres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Affiche le message Toast
                Toast.makeText(MainActivity.this,
                        "Accès à la liste des livres",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}