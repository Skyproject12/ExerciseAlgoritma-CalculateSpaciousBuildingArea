import java.awt.FlowLayout ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menghitung_design {
  JFrame frame = new JFrame ("menghitung");
  JPanel panel = new JPanel (new FlowLayout ());
  
  
  JButton tombol11 = new JButton("LUAS PERSEGI");
  JButton tombol12 = new JButton("LUAS SEGITIGA");
  JButton tombol13 = new JButton("LUAS PERSEGI PANJANG");
  JButton tombol14 = new JButton("LUAS TRAPESIUM");
  JButton tombol15 = new JButton("LAYANG - LAYANG");
  
  
  public void ui () {
	  frame.setVisible(true);
	  frame.setSize(240,220);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	  
	  panel.add(tombol11);
	  panel.add(tombol12);
	  panel.add(tombol13);
	  panel.add(tombol14);
	  panel.add(tombol15);
  }
}