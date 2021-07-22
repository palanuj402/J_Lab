import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
public class mouseevent2 extends Frame
{
  int x=0;
  int y=0;
 
 public void init()
 {
   addMouseListener(new mymouselistener());
  addWindowListener(new MyWindowAdapter());
 }
 public void paint(Graphics g)
 {
    g.drawLine(x,y,x,y);
    g.drawString(x + ","+ y, x,y);
 }
public class mymouselistener extends MouseAdapter
 {
  public void mouseClicked(MouseEvent e)
  {
  x = e.getX();
  y = e.getY();
  repaint();
  }
 }
 class MyWindowAdapter extends WindowAdapter
 {
public void windowClosing(WindowEvent we)
 {
System.exit(0);
 }
}
public static void main(String p[])
 {
   mouseevent2 me2 = new mouseevent2();
   me2.setSize(250, 250);
   me2.setVisible(true);
   me2.init();
 }
}