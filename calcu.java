import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class calcu
{
 public static void main(String arg[])
{
 System.out.println("print the data on consol");
marvellousframe  mobj=new marvellousframe("PPA");
}
}

class marvellousframe
{
 public Frame fobj;
public marvellousframe(String name)
{
 fobj=new Frame(name);
fobj.setSize(600,600);
fobj.setVisible(true);
fobj.addWindowListener(new marvellousListener());
}
}


class marvellousListener extends WindowAdapter
{
 public void windowClosing(WindowEvent obj)
{
 System.exit(0);
}
}

