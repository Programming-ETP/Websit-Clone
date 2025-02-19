import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest6 extends JFrame{

  public static void main(String[] args){
    JDesktopPaneTest6 frame = new JDesktopPaneTest6();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JDesktopPaneTest6(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe1 = new JInternalFrame("IFrame1", true);
    iframe1.setSize(250, 120);
    iframe1.setLocation(10, 10);
    iframe1.setVisible(true);

    JInternalFrame iframe2 = new JInternalFrame("IFrame2");
    iframe2.setSize(250, 120);
    iframe2.setLocation(30, 30);
    iframe2.setResizable(false);
    iframe2.setVisible(true);

    desktop.add(iframe1);
    desktop.add(iframe2);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}
