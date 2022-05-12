package studio.aroundhub.codeground.lecture.swing;

import javax.swing.*;

public class MiniMetro extends JFrame {

    public MiniMetro(){
        setTitle("Mini Metro Simulator");

        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

    }

    public static void main(String[] args){
        new MiniMetro();
    }
}
