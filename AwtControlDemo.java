package module5;
import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo extends Frame implements ActionListener
{Label statusLabel;
   public AwtControlDemo()
   {
	   setTitle("Java AWT Examples");
	     setSize(400,400);
	     setLayout(new GridLayout(3, 1));
	     addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      statusLabel = new Label();        
	      Button okButton = new Button("OK");
	      Button submitButton = new Button("Submit");
	      Button cancelButton = new Button("Cancel");
	      okButton.addActionListener(this); 
	      submitButton.addActionListener(this); 
	      cancelButton.addActionListener(this); 
	      add(statusLabel);
	      add(okButton);
	      add(submitButton);
	      add(cancelButton);   
	      setVisible(true);   

   }
   public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();  
       if( command.equals( "OK" ))  {
          statusLabel.setText("Ok Button clicked.");
       }
       else if( command.equals( "Submit" ) )  {
          statusLabel.setText("Submit Button clicked."); 
       }
       else  {
          statusLabel.setText("Cancel Button clicked.");
       }  
   }
   public static void main(String[] args)
   {
      new AwtControlDemo();
    
   }
}

