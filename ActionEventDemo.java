package module5;
import java.awt.*;
import java.awt.event.*;
class ActionEventDemo extends Frame implements ActionListener
{
    TextField textField;
    Label myLabel;
    ActionEventDemo ()
    {
        textField = new TextField ("My TextField");
        myLabel=new Label("My Label");
        myLabel.setBounds (60, 50, 200, 20);
        textField.setBounds (60, 50, 200, 20);
        Button button = new Button ("Say Hello");
        button.setBounds (90, 140, 75, 40);
        button.addActionListener (this);
        add(myLabel);
        add (textField);
        add (button);
        setSize (550,550);
        //setLayout(new GridLayout(3,1));
        setLayout(new FlowLayout());
        setVisible (true);
  addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });  

    }
    public void actionPerformed (ActionEvent e)
    {
        textField.setText ("Plz practice Java");
        myLabel.setText("Hellooo");
       
    }
   
    
    public static void main (String args[])
    {
        new ActionEventDemo ();
    }
}