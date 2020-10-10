package main.playerController;

import main.fieldController.Field;
import main.fieldController.Luck;
import main.fieldController.Property;

import java.util.Properties;

public class Brave extends Player{

    public Brave(int starterMoney) {
        super(starterMoney);
    }

    @Override
    public void decide(Field field) {

        if(field instanceof Property){
            Property actualProperty = (Property)field;
            if (actualProperty.owner == null) {
                actualProperty.owner = this;
            } else if (actualProperty.owner == this) {
                buyHouse();
            }
        } else if (field instanceof Luck) {
            payToBank();
        }



    }


}
