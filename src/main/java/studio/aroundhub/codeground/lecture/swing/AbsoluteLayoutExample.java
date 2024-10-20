package studio.aroundhub.codeground.lecture.swing;

import javax.swing.*;

public class AbsoluteLayoutExample extends JFrame {

  JButton button1 = new JButton();
  JButton button2 = new JButton();
  JButton button3 = new JButton();
  JButton button4 = new JButton();
  JButton button5 = new JButton();

  public AbsoluteLayoutExample() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    this.setSize(400, 400);

    this.setLayout(null);

    setComponents();
    this.setVisible(true);
  }

  private void setComponents() {
    button1.setText("버튼1");
    // button1.setBounds(10,10,100,50);
    button1.setSize(100, 50);
    button1.setLocation(10, 10);
    this.add(button1);

    button2.setText("버튼2");
    button2.setBounds(30, 30, 100, 50);
    this.add(button2);

    button3.setText("버튼3");
    button3.setBounds(100, 100, 100, 50);
    this.add(button3);

    button4.setText("버튼4");
    button4.setBounds(210, 200, 100, 50);
    this.add(button4);

    button5.setText("버튼5");
    button5.setBounds(10, 210, 100, 50);
    this.add(button5);
  }

  public static void main(String[] args) {
    new AbsoluteLayoutExample();
  }
}
