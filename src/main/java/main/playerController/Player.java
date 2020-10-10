package main.playerController;


import main.fieldController.Field;
import main.fieldController.Property;

import java.util.List;

public abstract class Player {
    final int starterMoney;
    int actualMoney;
    int position;
    boolean isAlive;
    List<Property> properties;


    protected Player(int starterMoney) {
        this.starterMoney = starterMoney;
        this.actualMoney = starterMoney;
        this.position = 0;
        this.isAlive = true;
    }


    public int move(int distance, int maxPosition){
        position =+ distance;
        if (position > maxPosition - 1) {
            position = position - maxPosition;
        }
        return position;
    }

    public void payToBank(){
        actualMoney -=
    };

    public abstract void payToPlayer();

    public void buyHouse() {
        actualMoney -=

    };

    public abstract void buyProperty();

    public abstract void decide(Field field);
}
