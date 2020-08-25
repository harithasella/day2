import java.util.*;
public class Main
{
    public static void main(String args[])
    {   
       Player p=new Player();
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the player name");
       p.name=s.nextLine();
       System.out.print("Enter the country name");
       p.country=s.nextLine();
       System.out.print("Enter the skill");
       p.skill=s.nextLine();
       System.out.println("Player details:");
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