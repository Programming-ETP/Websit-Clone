import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest8 extends JFrame{

  public static void main(String[] args){
    JTabbedPaneTest8 frame = new JTabbedPaneTest8();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JTabbedPaneTest8(){
    JTabbedPane tabbedpane = new JTabbedPane();

    JPanel tabPanel1 = new JPanel();
    tabPanel1.add(new JButton("button1"));

    JPanel tabPanel2 = new JPanel();
    tabPanel2.add(new JLabel("Name:"));
    tabPanel2.add(new JTextField("", 10));

    JPanel tabPanel3 = new JPanel();
    tabPanel3.add(new JButton("button2"));

    tabbedpane.addTab("tab1", tabPanel1);
    tabbedpane.addTab("tab2", tabPanel2);
    tabbedpane.addTab("tab3", tabPanel3);

    tabbedpane.setTabPlacement(JTabbedPane.BOTTOM);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}