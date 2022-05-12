package studio.aroundhub.codeground.lecture.jframe;

import javax.swing.*;

public class Main extends JFrame {

    // Main 화면
    JLabel labelTitle = new JLabel();


    // Main 화면 메뉴
    JMenuBar jMenuBar = new JMenuBar();

    JMenu file = new JMenu();
    JMenu studyMaterial = new JMenu();
    JMenu tool = new JMenu();
    JMenu help = new JMenu();

    public Main() {

        // 제목 설정
        super("어라운드 허브 스튜디오 실습 페이지");

        // 레이아웃 설정
        this.setLayout(null);
        this.setSize(500, 500);


        // 창 닫을 경우 프로그램 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLabel();
        setMenu();
        open();

    }

    public void setLabel(){
        labelTitle.setText("Around Hub Studio Page");
        labelTitle.setBounds(20,20,400,15);

        this.add(labelTitle);
    }

    public void setMenu(){
        file.add(new JMenuItem("종료"));

        studyMaterial.add(new JMenuItem("준비중"));

        tool.add(new JMenuItem("계산기"));
        tool.add(new JMenuItem("구구단"));

        help.add(new JMenuItem("업데이트"));
        help.add(new JMenuItem("About"));

        jMenuBar.add(file);
        jMenuBar.add(studyMaterial);
        jMenuBar.add(tool);
        jMenuBar.add(help);

        jMenuBar.setSize(500,100);

        this.setJMenuBar(jMenuBar);
    }

    public void open() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
