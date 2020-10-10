package main.fieldController;

import main.playerController.Player;

public class Property extends Field{

    final int priceOfProperty;
    final int priceOfHouse;
    final int toPayWithHouse;
    final int toPayWithoutHouse;
    public boolean hasHouse;
    public Player owner;


    public Property(String type) {
        this.priceOfProperty = 1000;
        this.priceOfHouse = 4000;
        this.toPayWithHouse = 100;
        this.toPayWithoutHouse = 500;
        this.hasHouse = false;
        this.owner = null;
    }
}
