import java.lang.*;

class command
{
public static void main(String arg[])
{
 System.out.println("number of commandline argument are:"+arg.length);
System.out.println(" first number is:"+arg[0] );
System.out.println("second number  is:"+arg[1]);
int ans=Integer.parseInt(arg[0])+Integer.parseInt (arg[1]);
System.out.println("addtion is :"+ans);
}
}


