package module5;
import java.awt.*;

import javax.swing.*;
public class Jlist {
	  public static void main(String[] args) {  
		  JFrame f = new JFrame("My Frame title");
			JPanel p = new JPanel( );
	Choice myList = new Choice();
	myList.add("CSE");
	myList.add("ECE");
	myList.add("EEE");
	myList.add("IT");
	p.add(myList);
	f.add(p);
	f.setVisible(true);
	f.setSize(640,480);
	f.setLayout(null);	
	  }
}
