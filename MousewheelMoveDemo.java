package module4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousewheelMoveDemo extends JPanel implements MouseWheelListener {
  JTextArea textArea = new JTextArea();

  JScrollPane scrollPane = new JScrollPane(textArea);

  final static String newline = "\n";

  public MousewheelMoveDemo() {
    super(new BorderLayout());
    textArea.setEditable(false);
    
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setPreferredSize(new Dimension(400, 250));
    add(scrollPane, BorderLayout.CENTER);
    textArea.append("This text area displays information " + "about its mouse wheel events."
        + newline);

    textArea.addMouseWheelListener(this);

    setPreferredSize(new Dimension(450, 350));
    setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
  }

  public void mouseWheelMoved(MouseWheelEvent e) {
    String message;
    int notches = e.getWheelRotation();
    if (notches < 0) {
      message = "Mouse wheel moved UP " + -notches + " notch(es)" + newline;
    } else {
      message = "Mouse wheel moved DOWN " + notches + " notch(es)" + newline;
    }
    if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
      message += "    Scroll type: WHEEL_UNIT_SCROLL" + newline;
      message += "    Scroll amount: " + e.getScrollAmount() + " unit increments per notch"
          + newline;
      message += "    Units to scroll: " + e.getUnitsToScroll() + " unit increments" + newline;
      message += "    Vertical unit increment: "
          + scrollPane.getVerticalScrollBar().getUnitIncrement(1) + " pixels" + newline;
    } else { // scroll type == MouseWheelEvent.WHEEL_BLOCK_SCROLL
      message += "    Scroll type: WHEEL_BLOCK_SCROLL" + newline;
      message += "    Vertical block increment: "
          + scrollPane.getVerticalScrollBar().getBlockIncrement(1) + " pixels" + newline;
    }
    saySomething(message, e);
  }

  void saySomething(String eventDescription, MouseWheelEvent e) {
    textArea.append(e.getComponent().getClass().getName() + ": " + eventDescription);
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }
  public static void main(String[] args) {
    JFrame frame = new JFrame("MouseWheelEventDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComponent newContentPane = new MousewheelMoveDemo();
    newContentPane.setOpaque(true); // content panes must be opaque
    frame.setContentPane(newContentPane);

    frame.pack();
    frame.setVisible(true);
  }
}