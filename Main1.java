import java.util.*;
public class Main
{
    public static void main(String args[])
    {   
       Venue v=new Venue();
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the venue name");
       v.name=s.nextLine();
       System.out.print("Enter the city name");
       v.city=s.nextLine();
       System.out.println("Venue details:");
       System.out.println("Venue Name:" + v.name);
       System.out.println("City Name:"+ v.city);
 }
 }
 class Venue
{
   String name;
   String city;
}
 

