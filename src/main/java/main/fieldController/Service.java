package main.fieldController;

public class Service extends Field{

    final int moneyToBank;

    public Service(String type, int moneyToBank) {
        super(type);
        this.moneyToBank = moneyToBank;
    }
}
