package main;

import main.fieldController.Field;
import main.fieldController.Luck;
import main.fieldController.Property;
import main.fieldController.Service;
import main.playerController.Brave;
import main.playerController.Player;
import main.playerController.Shy;
import main.playerController.Tactical;

import java.util.*;


public class GameController {
    Field[] fields = new Field[10];
    Set<Player> players = new HashSet<Player>();
    int starterMoney = 4000;
    int rounds = 10;

    public void runGame() {
        initializeBoard();
        initializePlayer();
        Board board = new Board(fields, players);
        for (int i = 0; i<rounds; i++) {
            board.makeMoveAllPlayers();
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < fields.length; i++) {
            if (i % 3 == 0) {
                fields[i] = new Property("property");
            } else if (i % 2 == 0) {
                fields[i] = new Service("service", 500);
            } else  {
                fields[i] = new Luck("luck", 500);
            }
        }
    }

    private void initializePlayer() {
        players.add(new Brave(starterMoney));
        players.add(new Tactical(starterMoney));
        players.add(new Shy(starterMoney));

    }
}
