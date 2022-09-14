package com.example.co_op_learning_parcelable;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
//    private TextView userName;
    private ArrayList<Pokemon> pokemons;
    private Pokemon pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.btnSubmit);

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //------- this code works
//                Pokemon charizard = new Pokemon("Charizard", "Fire Spin", 120);
//                Parcelable parcelable = Parcels.wrap(charizard);
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra("DATA_KEY", parcelable);
//                startActivity(intent);
                //------ end

                //--- Array example - Random Pokemon (HP, Name, Attack)
                pokemons = new ArrayList<>();
                pokemons.add(new Pokemon("Charizard", "Fire Spin", 120));
                pokemons.add(new Pokemon("Blastoise", "Hydro Pump", 100));
                pokemons.add(new Pokemon("Alakazam", "Confuse Ray", 80));
                pokemons.add(new Pokemon("Clefairy", "Sing", 40));
                pokemons.add(new Pokemon("Hitmonchan", "Special Punch", 70));
                pokemons.add(new Pokemon("Machamp", "Seismic Toss", 100));
                pokemons.add(new Pokemon("Ninetales", "Fire Blast", 80));

                Parcelable parcelable = Parcels.wrap(pokemons);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("DATA_KEY", parcelable);
                startActivity(intent);
                //------- end

            }
        });

    }

}