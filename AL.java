import java.lang.*;
import java.util.*;

class LL
{
 public static void main(String arg[])
{
 LinkedList<String>obj=new LinkedList<String>();

obj.add("january");
obj.add("february");
obj.add("march");
obj.add("marvellous");
obj.add(2,"new");
obj.add("may");
obj.add("marvellous");
obj.add("marvellous");
obj.add("marvellous");

System.out.println("ArrayList contains:"+obj);

System.out.println("size is:"+obj.size());

int i=0;
System.out.println("Elements are using for loop:");
for(i=0;i<obj.size();i++)
{
 System.out.println(obj.get(i));
}
String str;
int cnt=0;
for(i=0;i<obj.size();i++)
{
 str=obj.get(i);
if(str.equals("marvellous"))
{
 cnt++;
}
}
System.out.println("marvellous occures at"+cnt+"times in arraylist");

if(obj.contains("april"))
{
 System.out.println("element is there");
}
int ret=obj.indexOf("april");
System.out.println("element is at:"+ret);
System.out.println("element at index 3 is:"+obj.get(3));

obj.remove(3);
obj.remove("april");
System.out.println("updated list is:"+obj);
Iterator iobj=obj.iterator();
while(iobj.hasNext())
{
 System.out.println(iobj.next());
}
obj.clear();
System.out.println("updated list is :"+obj);
}
}


 