import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class GridLayoutTest4 extends JFrame{

  public static void main(String[] args){
    GridLayoutTest4 frame = new GridLayoutTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  GridLayoutTest4(){
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JButton button3 = new JButton("button3");
    JButton button4 = new JButton("button4");

    JPanel p = new JPanel();
    GridLayout layout = new GridLayout(2, 2);
    layout.setHgap(10);
    layout.setVgap(5);
    p.setLayout(layout);

    p.add(button1);
    p.add(button2);
    p.add(button3);
    p.add(button4);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}