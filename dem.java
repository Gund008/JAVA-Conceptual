import java.lang.*;
import java.util.*;

class demmo
{
 public static void main(String arg[])
{
Scanner sobj=new Scanner(System.in);

 System.out.println("enter first number");
 int ino1=sobj.nextInt();

 System.out.println("enter second number");
 int ino2=sobj.nextInt();

excep  eobj=new eobj();
 int ret=eobj.division(ino1,ino2);
System.out.println("division is :"+ret);

return 0;
}
}

class excep
{
 public int division(int ino1,int ino2)
{
 return ino1/ino2;
}
}


