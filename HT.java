import java.lang.*;
import java.util.*;
class ht
{
public static void main(String agr[])
{
Hashtable<Integer,String>obj=new Hashtable<Integer,String>();

obj.put(key:11,value:"amit");
obj.put(key:21,value:"piyush");
obj.put(key:22,value:"mayur");
obj.put(key:30,value:"sagar");
obj.put(key:34,value:"dinesh");

 System.out.println("paduka alya...:"+obj.get(key:21));
System.out.println(x:"data from hash table");

Enumeration eobj=obj.keys();

while(eobj.hasMoreElements())
{
// System.out.println(obj.get(eobj.nextElement()));
System.out.println(eobj.nextElement());

}
}
}

