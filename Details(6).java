import java.util.*;
class ExtraType
{
    String name;
    long runs;
    public  void setName(String name)
    {
      this.name=name;
    }
   public void setRuns(long runs)
   {
      this.runs=runs;
   }
     public  String getName()
    {
       return name;
    }
   public long getRuns()
   {
       return runs;
   }
}
public class Details
{
    public static void main(String args[])
    {
         ExtraType t=new ExtraType();
         System.out.println("Enter the extratype details");
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         String[] a=str.split("#",-2);
         t.setName(a[0]);
         long l=Long.parseLong(a[1]);
         t.setRuns(l);
         System.out.println("ExtraType Details");
         System.out.println("ExtraType:" + t.getName());
         System.out.println("Runs:" + t.getRuns());
     }
}