package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario extends JFrame{

    private JTextField campoA = new JTextField("", 10);
    private JTextField campoB = new JTextField("", 10);
    private JButton botao = new JButton("Somar");


    public Formulario(){

        super("Minha Janela");
        this.setSize(300, 150);

    }


}
