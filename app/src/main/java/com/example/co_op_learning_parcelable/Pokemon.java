package com.example.co_op_learning_parcelable;

// ** Required ** Must Import Parcel
import org.parceler.Parcel;


// ** Required ** Annotate
@Parcel
public class Pokemon {

    // ** Required ** Fields CAN'T be private
    String name;
    String attackName;
    int hp;

    // ** Requred ** must include an empty constructor
    public Pokemon() {
    }

    public Pokemon(String name, String attackName, int hp) {
        this.name = name;
        this.attackName = attackName;
        this.hp = hp;
    }

    // Helpful Getter / toString
    public String getName() {
        return name;
    }

    public String getAttackName() {
        return attackName;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "hp=" + hp +
                '}';
    }
}
