package secao30JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class OlaJavaFX extends Application {
    @Override
    public void start(Stage stage)  {
        // Texto
        Label label = new Label("Olá, JavaFX!");

       //loyout que centraliza os elementos
        StackPane root = new StackPane();
        root.getChildren().add(label);

        //cena (janela)
        Scene scene = new Scene(root, 400, 200);

        //configuração da janela
        stage.setTitle("minha Primeira Janela");
        stage.setScene(scene);
        stage.show(); 
    }

    public static void main(String[] args){
        launch(args);
    }
}
