import java.lang.*;
class hello
{
 //System.out.println("id="+obj.getid()+,"name="+obj.getname(),"salary="+obj.getsalary() );
{

employee obj1=new employee();
obj1.getid();
obj1.getname();
obj1.getsalary();

employee obj2=new employee();
obj2.getid();
obj2.getname();
obj2.getsalary();

int nextid=new Nextid();

}
}
class employee
{
 private int id;
private String name;
private double salary;
private static int Nextid;

static
{
  Nextid=1000;

}
{
 this.id=nextid;
}
public employee()
{
 this.id=0;
this.name="\0";
this.salary=0;
}

public employee(int a,String b,double c)
{
 this.id=a;
this.name=b;
this.salary=c;
}
  

public int getid()
{
 return id;
}

public String getname()
{
return name;
}

public double getsalary()
{
return salary;
}
}



