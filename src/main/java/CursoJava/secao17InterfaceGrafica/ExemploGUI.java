package CursoJava.secao17InterfaceGrafica;

import javax.swing.*;

public class ExemploGUI {
    public static void main(String[] args){

        /*
        o que acontece
        Quando o usuário clica no botão, aparece uma caixa de diálogo com a mensagem
        "Você clicou no botão"
         */

        //cria a janela
        JFrame janela = new JFrame("Minha Primeira Interface");
        janela.setSize(300, 200);
        //
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        janela.setLayout(null);


        //cria o botão
        JButton botao = new JButton("Clique aqui");
        botao.setBounds(80,70, 130, 30); //x, y, largura, altura

        //cria o botão
        botao.addActionListener(e -> JOptionPane.showMessageDialog(null, "Você clicou no botão"));

        //adiciona o botão à janela
        janela.add(botao);

        //exibe a janela
        janela.setVisible(true);

    }
}
