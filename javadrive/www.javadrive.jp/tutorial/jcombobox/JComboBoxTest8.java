import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JComboBoxTest8 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest8 frame = new JComboBoxTest8();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JComboBoxTest8(){
    String[] startTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    String[] endTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    JComboBox startCombo = new JComboBox(startTime);
    startCombo.setPreferredSize(new Dimension(80, 30));

    JComboBox endCombo = new JComboBox(endTime);
    endCombo.setPreferredSize(new Dimension(80, 30));
    endCombo.setEnabled(false);

    JPanel p = new JPanel();
    p.add(new JLabel("start:"));
    p.add(startCombo);
    p.add(new JLabel("  end:"));
    p.add(endCombo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}