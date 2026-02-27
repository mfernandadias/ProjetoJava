package secao30JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class Exercicio01 extends Application {


    @Override
    public void start(Stage stage) {
        //titulo da janela
        stage.setTitle("Minha primeira Janela");

        //exibe a janela
        stage.show();

    }

    public static void main(String[] args){

        glaunch(args);
    }
}
