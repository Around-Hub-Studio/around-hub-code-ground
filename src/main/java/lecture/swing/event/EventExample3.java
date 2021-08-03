package lecture.swing.event;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Event Listener Example 3
 * 리스너를 상속받아 핸들러 직접 구현
 * https://thinkground.studio
 * YouTube : Around Hub Studio
 *
 * @author Flature
 */
public class EventExample3 extends JFrame implements ActionListener {

    private JButton jButton = new JButton("버튼");

    public EventExample3() {

        setSize(500, 500);

        jButton.addActionListener(this);
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("호출!");
    }

    public static void main(String[] args) {
        new EventExample4();
    }
}
