package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLivres;
    private LivreAdapter livreAdapter;
    private ArrayList<Livre> listeLivres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewLivres = findViewById(R.id.recyclerViewLivres);
        listeLivres = new ArrayList<>();

        listeLivres.add(new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupery", "9780156013987", true));
        listeLivres.add(new Livre(2, "L'Etranger", "Albert Camus", "9782070360024", false));
        listeLivres.add(new Livre(3, "Les Miserables", "Victor Hugo", "9782253096344", true));
        listeLivres.add(new Livre(4, "Une si longue lettre", "Mariama Ba", "9782841290529", true));
        listeLivres.add(new Livre(5, "Le Vieux Negre et la Medaille", "Ferdinand Oyono", "9782264018304", false));
        listeLivres.add(new Livre(6, "Madame Bovary", "Gustave Flaubert", "9782070409228", true));
        listeLivres.add(new Livre(7, "La Peste", "Albert Camus", "9782070360420", false));
        listeLivres.add(new Livre(8, "Sous l'orage", "Seydou Badian", "9782708707691", true));

        recyclerViewLivres.setLayoutManager(new LinearLayoutManager(this));
        livreAdapter = new LivreAdapter(listeLivres);
        recyclerViewLivres.setAdapter(livreAdapter);
    }
}