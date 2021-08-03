package lecture.swing;

import javax.swing.*;

public class SwingComponents extends JFrame {

    public SwingComponents(){
        setSize(300,500); // this.setSize();

        JLabel jLabel = new JLabel();
        jLabel.setText("abc");
        jLabel.setBounds(10,10, 200, 20);
        add(jLabel);

        JButton jButton = new JButton();
        jButton.setText("def");
        jButton.setBounds(10,40, 200, 20);
        add(jButton);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("ghi");
        jTextArea.append(" + abc");
        jTextArea.setBounds(10,70, 200, 20);
        add(jTextArea);

        JTextField jTextField = new JTextField();
        //JPasswordField jPasswordField = new JPasswordField();
        jTextField.setText("jkl");
        jTextField.setBounds(10,100, 200, 20);
        add(jTextField);

        JCheckBox jCheckBox1 = new JCheckBox();
        jCheckBox1.setText("abc");
        jCheckBox1.setBounds(10,130, 50, 20);
        add(jCheckBox1);

        JCheckBox jCheckBox2 = new JCheckBox();
        jCheckBox2.setText("def");
        jCheckBox2.setBounds(60,130, 50, 20);
        add(jCheckBox2);

        JCheckBox jCheckBox3 = new JCheckBox();
        jCheckBox3.setText("ghi");
        jCheckBox3.setBounds(110,130, 50, 20);
        add(jCheckBox3);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton jRadioButton1 = new JRadioButton();
        jRadioButton1.setText("abc");
        buttonGroup.add(jRadioButton1);
        jRadioButton1.setBounds(10,160, 50, 20);
        add(jRadioButton1);

        JRadioButton jRadioButton2 = new JRadioButton();
        jRadioButton2.setText("def");
        buttonGroup.add(jRadioButton2);
        jRadioButton2.setBounds(60,160, 50, 20);
        add(jRadioButton2);

        JRadioButton jRadioButton3 = new JRadioButton();
        jRadioButton3.setText("ghi");
        buttonGroup.add(jRadioButton3);
        jRadioButton3.setBounds(110,160, 50, 20);
        add(jRadioButton3);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new SwingComponents();
    }
}
