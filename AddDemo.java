import java.applet.*;
import java.awt.*;
public class AddDemo extends Applet
{
int a;
int b;
int c;
public void init()
{
a=Integer.parseInt(getParameter("a"));
b=Integer.parseInt(getParameter("b"));
c=a+b;
}
public void paint(Graphics g)
{
g.drawString("Addition result is:"+Integer.toString(c),20,20);
}
}
/*<applet code="AddDemo.class" width=500 height=500>
<param name="a" value="10"/>
<param name="b" value="20"/>
</applet>
*/