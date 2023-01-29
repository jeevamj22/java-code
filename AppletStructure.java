import java.applet.*;
import java.awt.*;
public class AppletStucture extends Applet
{
String str;
public void init()
{
str="Init method";
}
public void start()
{
str="Applet started";
}
public void stop()
{
str="Applet stopped";
repaint();
}
public void paint(Graphics g)
{
g.drawString(str,100,100);
}
public void destroy()
{
str="Applet is destroyed";
}
}
//<applet code="AppletStucture.class" width=500 height=500></applet>