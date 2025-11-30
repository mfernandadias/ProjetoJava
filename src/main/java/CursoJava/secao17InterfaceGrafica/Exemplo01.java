package CursoJava.secao17InterfaceGrafica;

import javax.swing.*;

public class Exemplo01 {
    public static void main(String[] args){
        JFrame janela = new JFrame("Minha primeira janela");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
