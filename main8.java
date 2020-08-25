import java.util.Scanner;
import java.util.*;
class Wicket
{
private long over;
private long ball;
private long wicketType;
private String playerName;
private String bowlerName;


Wicket(long over,long ball,long wicketType,String playerName,String bowlerName)

this.over=over;
this.ball=ball;
this.wicketType=wicketType;
this.playerName=playerName;
this.bowlerName=bowlerName;
}
public String getOver()
{
return over;
}

public void setOver(Long newover)
{
this.over=newover;
}

public String getBall()
{
return ball;
}

public void setOver(Long newball)
{
this.ball=newball;

}

}
class D
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Wicket wt=new Wicket();

System.out.println("enter the number of wickets:");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("enter the details of:"+i);
String over=s.nextLine();
String[] a=over.split(",",-2);
wi.over=a[0];
wi.ball=a[1];
wi.wicketType=a[2];
wi.playerName=a[3];
wi.bowlerName=a[4];

}
System.out.println("Player details:");
System.out.println("Player name:"+wi.over);
System.out.println("country name:"+wi.ball);
System.out.println("skill:"+wi.wicketType);
System.out.println("skill:"+wi.playerName);
System.out.println("skill:"+wi.boelerName);


}
}