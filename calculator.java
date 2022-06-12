import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class calculator
{
 public static void main(String arg[])
{
 System.out.println("print the data on consol");
marvellousframe  mobj=new marvellousframe("PPA");
}
}

class marvellousframe
{
 public frame fobj;
public marvellousframe(String name)
{
 fobj=new frame(name);
fobj.setsize(600,600);
fobj.setvisible(true);
fobj.addwindowListener(new marvellousListener());
}
}


class marvellousListener extends windowAdapter
{
 public void windowclosing(windowevent obj)
{
 system.exit(0)
}
}

