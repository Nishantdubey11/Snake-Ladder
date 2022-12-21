package com.example.snake_ladder;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
    private Circle coin;
    private String name;
    private int coinPosition;

    public Player(int tileSize, Color coinColour, String playername){
        coinPosition = 1;
        coin = new Circle(tileSize/2);
        coin.setFill(coinColour);
        coin.setTranslateX(20);
        coin.setTranslateY(380);
    }

    public Circle getCoin() {
        return coin;
    }

    public int getCoinPosition() {
        return coinPosition;
    }
}
