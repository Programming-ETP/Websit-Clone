import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JTreeTest4 extends JFrame{

  public static void main(String[] args){
    JTreeTest4 frame = new JTreeTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JTreeTest4(){
    String[] treedata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    JTree tree = new JTree(treedata);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}