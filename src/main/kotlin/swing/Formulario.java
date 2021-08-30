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
        JPanel pn1 = new JPanel();
        pn1.add(new JLabel("Valor 1"));
        pn1.add(campoA);

        JPanel pn2 = new JPanel();
        pn2.add(new JLabel("Valor 2"));
        pn2.add(campoB);

        JPanel pn3 = new JPanel();
        pn3.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executarAccao();
            }
        });

        this.setLayout(new GridLayout(3, 1));
        this.add(pn1);
        this.add(pn2);
        this.add(pn3);

        this.setVisible(true);
    }


    public void executarAccao(){
        
    }

}
