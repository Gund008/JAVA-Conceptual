import java.lang.*;
class abstractdemo
{
public static void main(String a[])
{
PNB pobj=new PNB();
SBI sobj=new SBI();

pobj.credit(1000);
pobj.debit(200);

System.out.println(pobj.balance);
}
}

abstract class RBI
{
 public int balence;
public RBI()
{
  this.balance=0;
}
public void credit(int amount)
{
 this.balance=this.balance+amount;
}
public void debit(int amount)
{
 this.balance=this.balance-amount;
}
public abstract int calculateintrest();//virtual 
}

class SBI extends RBI
{
public int accountnumber;
public int IFSC;
public int calculateintrest()
{
return 6;
}
}

class PNB extends RBI
{
public int accountnumber;
public int IFSC;
public int calculateintrest()
{
return 7;
}
}