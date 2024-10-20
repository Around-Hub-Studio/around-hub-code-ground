package studio.aroundhub.codeground.lecture.swing;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {

  JButton button1 = new JButton();
  JButton button2 = new JButton();
  JButton button3 = new JButton();
  JButton button4 = new JButton();
  JButton button5 = new JButton();

  public BorderLayoutExample() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.setSize(400, 400);

    this.setLayout(new BorderLayout());

    setComponents();
    this.setVisible(true);
  }

  private void setComponents() {
    button1.setText("버튼1");
    // this.add(button1, BorderLayout.LINE_START);
    this.add(button1, BorderLayout.WEST);

    button2.setText("버튼2");
    this.add(button2, BorderLayout.CENTER);

    button3.setText("버튼3");
    // this.add(button3, BorderLayout.LINE_END);
    this.add(button3, BorderLayout.EAST);

    button4.setText("버튼4");
    // this.add(button4, BorderLayout.PAGE_START);
    this.add(button4, BorderLayout.NORTH);

    button5.setText("버튼5");
    // this.add(button5, BorderLayout.PAGE_END);
    this.add(button5, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
    new BorderLayoutExample();
  }
}
