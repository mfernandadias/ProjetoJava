package CursoJava.secao17InterfaceGrafica;

import javax.swing.*;

public class SaudacaoGUI {
    /*
    Como funciona por trás
    * criação da janela: JFrame é container principal
    Adição de componentes: JButton, JLabel, JTextFiels são colocados dentro do JFrame
    Eventos: métodos como addActionListener() escutam ações do usuário (ex: clique)
    Exibições: setVisible(true) mostra a janela na tela
     */

    public static void main(String[] args){
        JFrame frame = new JFrame("Saudação");

        frame.setSize(350, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Digite seu nome: ");
        label.setBounds(30, 30, 150, 25);
        frame.add(label);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(150, 30, 150, 25);
        frame.add(campoNome);

        JButton botao = new JButton("Saudar");
        botao.setBounds(120, 80, 100, 30);
        frame.add(botao);

        botao.addActionListener(e -> {
            String nome = campoNome.getText();
            JOptionPane.showMessageDialog(frame, "Olá, " + nome + "!");
        });

        frame.setVisible(true);
        /*
        O que esse programa faz:
        Pede o nome do usuário
        Quando ele clica em "Saudar", aparece uma mensagem com o nome digitado
         */
    }
}

