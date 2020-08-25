import java.util.*;
public class Main
{
    public static void main(String args[])
    {    
       Player p=new Player();
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the  player details");
       String name=s.nextLine();
        String[] arr=name.split(",",-2);
        for(int i=0;i<arr.length;i++)
       {
           p.name=arr[0];
           p.country=arr[1];
           p.skill=arr[2];
       }
       System.out.println("Player Details");
       System.out.println("Player Name:" + p.name);
       System.out.println("Country Name:"+ p.country);
       System.out.println("Skill:"+ p.skill);
       
    }
}
 class Player
{
  
   String name;
   String country;
   String skill;
 }