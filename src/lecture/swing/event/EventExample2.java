package lecture.swing.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Event Listener Example 2
 * 리스너 클래스를 내부 클래스로 생성
 * https://thinkground.studio
 * YouTube : Around Hub Studio
 * @author Flature
 */
public class EventExample2 extends JFrame {

    private JButton jButton = new JButton("버튼");

    public EventExample2() {

        setSize(500,500);

        jButton.addActionListener(new ListenerClass());
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    class ListenerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("호출!");
        }
    }

    public static void main(String[] args){
        new EventExample4();
    }
}

