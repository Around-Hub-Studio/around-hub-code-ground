package studio.aroundhub.codeground.lecture.swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Event Listener Example 1
 * 독립적인 클래스로 리스너 생성
 * https://thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class EventExample1 extends JFrame {

    private JButton jButton = new JButton("버튼");

    public EventExample1() {

        setSize(500,500);

        jButton.addActionListener(new ListenerClass());
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args){
        new EventExample1();
    }
}

class ListenerClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("호출!");
    }

}
