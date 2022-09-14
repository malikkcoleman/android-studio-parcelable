package com.example.co_op_learning_parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import org.parceler.Parcels;

import java.util.ArrayList;



public class MainActivity2 extends AppCompatActivity {

    //public static final String EXTRA_DATA = "EXTRA_DATA";

    private TextView firstName, firstAttack, firstHP;
    private TextView secName, secAttack, secHP;
    private TextView thirdName, thirdAttack, thirdHP;
    private ArrayList<Pokemon> pokemons;
    private Pokemon charizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstName = findViewById(R.id.firstName);
        firstAttack = findViewById(R.id.firstAttack);
        firstHP = findViewById(R.id.firstHP);

        //---- This code works (single Pokemon object example)
//        Parcelable parcelable = getIntent().getParcelableExtra("DATA_KEY");
//        charizard = Parcels.unwrap(parcelable);
//
//        firstName.setText(charizard.getName());
//        firstAttack.setText(charizard.getAttackName());
//        firstHP.setText(Integer.toString(charizard.getHp()));
        //----- END


        //----- Array Example (random pokemon)

        Parcelable parcelable = getIntent().getParcelableExtra("DATA_KEY");
        pokemons = Parcels.unwrap(parcelable);
        int random_selector = (int)(Math.random() * (pokemons.size()));
        firstName.setText("Name: " + pokemons.get(random_selector).getName());
        firstAttack.setText("Attack: " + pokemons.get(random_selector).getAttackName());
        firstHP.setText(Integer.toString(pokemons.get(random_selector).getHp()) + "HP");


    }
}