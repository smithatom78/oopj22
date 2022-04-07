package module5;
import java.awt.*;  
import java.awt.event.*;  
public class ActionEventDemo1 extends Frame implements ActionListener {  
    Label l;  
    public static void main(String argv[]) {  
    	ActionEventDemo1 t = new ActionEventDemo1();  
    }  
    public ActionEventDemo1() {  
      
    		setLayout(new BorderLayout());  
         
            Button b1 = new Button("My Button1");  
            b1.addActionListener(this);  
            add(b1, BorderLayout.NORTH);  
            Button b2 = new Button("My Button2");  
            b2.addActionListener(this);  
            add(b2, BorderLayout.SOUTH);  
            l = new Label("My Label");  
            add(l, BorderLayout.CENTER);
            Button b3 = new Button("My Button3");  
            b3.addActionListener(this);  
            add(b3, BorderLayout.WEST);  
            Button b4 = new Button("My Button4");  
            b4.addActionListener(this);  
            add(b4, BorderLayout.EAST);  
            addWindowListener(new WindowAdapter() {  
                public void windowClosing(WindowEvent we) {  
                    System.exit(0);  
                }  
            });  
      
        setSize(500, 500);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
        Button bton = (Button) e.getSource();  
         l.setText(bton.getLabel());  
    }  
}  