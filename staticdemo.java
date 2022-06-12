import java.lang.*;
class staticdemo
{
    public static void main(String a[])
{
Demo obj;//inside constructor 
obj=new Demo();
obj.fun();//inside nonstatic fun 0,0,0
obj.gun();

}
}
class Demo
{
public int i;
public int j;
public static int k;
static 
{
System.out.println("inside static block");
k=11;
}
public  Demo()
{
    System.out.println("inside constructor");
    this.i=0;
    this.j=0;
}
public void fun()
{
    System.out.println("inside nonstatic fun");
    System.out.println(this.i);
     System.out.println(this.j);
    System.out.println(this.k); 
}
public static void gun()
{
    System.out.println("inside static gun");
    System.out.println(k);
}
}

