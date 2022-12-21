package com.example.snake_ladder;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Snake_Ladder extends Application {
    public static final int tileSize = 40, height=10, width=10;
    int lowerLine = tileSize*height;

    Player firstPlayer = new Player(tileSize, Color.BLACK, "Amit");
    Player secondPlayer = new Player(tileSize-10, Color.WHITE, "abcd");

    Pane createContent(){
        Pane root = new Pane();
        root.setPrefSize(width*tileSize, height*tileSize+50);

        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                Tile tile = new Tile(tileSize);
                tile.setTranslateX(j*tileSize);
                tile.setTranslateY(i*tileSize);
                root.getChildren().add(tile);
            }
        }

        Image img = new Image( "C:\\Users\\nisha\\IdeaProjects\\Snake_Ladder\\src\\main\\SnakeLadderBoard12Nov.jpg");
        ImageView boardImage = new ImageView();
        boardImage.setImage(img);
        boardImage.setFitWidth(tileSize*width);
        boardImage.setFitHeight(tileSize*height);

        Button playeroneButton = new Button("Player One");
        playeroneButton.setTranslateX(20);
        playeroneButton.setTranslateY(lowerLine+20);
        Button playertwoButton = new Button("Player Two");
        playertwoButton.setTranslateX(250);
        playertwoButton.setTranslateY(lowerLine+20);

        root.getChildren().addAll(boardImage, playeroneButton, playertwoButton, firstPlayer.getCoin(), secondPlayer.getCoin());

        return root;
    }


    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}