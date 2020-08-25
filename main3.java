import java.util.*;
public class Main
{
    public static void main(String args[])
    {    Delivery d=new Delivery();
           d.displayDeliveryDetails();
    }
}
 class Delivery
{
   Long over;
   Long ball;
   Long runs;
   String batsman;
   String bowler;
   String nonStriker;
   void displayDeliveryDetails()
   {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the over");
       over=s.nextLong();
       System.out.print("Enter the ball");
       ball=s.nextLong();
       System.out.print("Enter the runs");
       runs=s.nextLong();
       System.out.print("Enter the batsman name");
       batsman=s.next();
       System.out.print("Enter the bowler name");
       bowler=s.next();
       System.out.print("Enter the nonStriker name");
       nonStriker=s.next();
       System.out.println("Delivery Details");
       System.out.println("Over:" + over);
       System.out.println("Ball:"+ ball);
       System.out.println("Runs:"+ runs);
       System.out.println("Batsman:" + batsman);
       System.out.println("Bowler:"+ bowler);
       System.out.println("NonStriker:"+ nonStriker);
     }

}