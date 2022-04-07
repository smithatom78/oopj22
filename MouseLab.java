package module4;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
public class MouseLab extends Frame implements MouseListener,MouseMotionListener{
	String txt="";
	 
	public MouseLab(){
		
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(300,300);
	    setVisible(true);
	    addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	          System.exit(0);
	        }
	      });
	}
	
	// override the 5 abstract methods of ML
	public void mousePressed(MouseEvent e){
		// do some action to distinguish from other methods
	setBackground(Color.red);
	System.out.println("Mouse is Pressed");
	
	}
	public void mouseReleased(MouseEvent e){
		setBackground(Color.blue);
	    System.out.println("Mouse is Released");   
	}
	public void mouseClicked(MouseEvent e){
	setBackground(Color.green);
	  System.out.println("Mouse is Clicked");
	  setTitle("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e){
		setBackground(Color.cyan);
	    System.out.println("Mouse is Entered");
	 
	}
	public void mouseExited(MouseEvent e){
		setBackground(Color.magenta);
	    System.out.println("Mouse is Exited");
	    setTitle("Mouse Exited");
	}
	public void mouseMoved(MouseEvent me)
	{
	txt="hi my mouse is Moved";
	setForeground(Color.white);
	Graphics g=getGraphics();
	g.setColor(Color.BLACK);
	g.drawString(txt,me.getX(),me.getY());
	System.out.println("Mouse Moved");
	setTitle("Mouse Moved");
	}
	public void mouseDragged(MouseEvent me)
	{System.out.println("Mouse is Dragged");
	 Graphics g=getGraphics();  
	    g.fillOval(me.getX(),me.getY(),20,20);  	
	}
	public static void main(String args[]){
	     new MouseLab();
	}

}
