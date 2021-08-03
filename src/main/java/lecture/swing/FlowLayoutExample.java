package lecture.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();

    //JButton[] buttonList = new JButton[5];

    public FlowLayoutExample() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(400,400);

        this.setLayout(new FlowLayout());

        setComponents();
        this.setVisible(true);
    }

    private void setComponents(){
        button1.setText("버튼1");
        this.add(button1);

        button2.setText("버튼2");
        this.add(button2);

        button3.setText("버튼3");
        this.add(button3);

        button4.setText("버튼4");
        this.add(button4);

        button5.setText("버튼5");
        this.add(button5);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
