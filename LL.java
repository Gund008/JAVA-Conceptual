import java.lang.*;
import java.util.*;
class ST
{
public static void main(String arg[])
{
 Stack<student>obj=new Stack<student>();
student s1=new student(1,"amit",89);
student s2=new student(2,"pooja",93);
student s3=new student(3,"rohit",80);
student s4=new student(4,"sachin",97);

obj.push(s1);
obj.push(s2);
obj.push(s3);
obj.push(s4);

student ref=null;
Iterator iob=obj.iterator();
while(iob.hasNext())
{
ref=(student)iob.next();
ref.display();
}
System.out.println("poped elements are");
ref=obj.pop();
ref.display();
ref=obj.pop();
ref.display();
ref=obj.pop();
ref.display();
}
}

class student
{
public int rno;
public String name;
public int Marks;

public student(int a,String str,int b)
{
 this.rno=a;
this.name=str;
this.Marks=b;
}

public void display()
{
 System.out.println("rollno:"+this.rno+"name:"+this.name+"Marks:"+this.Marks);
}
}




