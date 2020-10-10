package main;

import main.fieldController.Field;
import main.playerController.Player;
import java.util.Random;
import java.util.Set;

public class Board {
    Field[] fields;
    Set<Player> players;

    public Board(Field[] fields, Set<Player> players) {
        this.fields = fields;
        this.players = players;
    }

    public void makeMoveAllPlayers() {
        Random random = new Random();
        int maxPosition = fields.length;
        for (Player player : players) {
            int distance = random.nextInt(6) + 1;
            int positon = player.move(distance, maxPosition);
            player.decide(fields[positon]);

        }
    }
}
