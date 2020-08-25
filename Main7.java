class Delivery
{  
   private long over;
   private  long ball;
   private long runs;
    private String batsman;
   private String bowler;
    private String nonStriker;
    Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
    {
      this.over=over;
      this.ball=ball;
      this.runs=runs;
      this.batsman=batsman;
      this.bowler=bowler;
      this.nonStriker=nonStriker;
    }
    Delivery()
    {
    }
     
    public long getOver()
    {
       return over;
     }
      public long getBall()
    {
       return ball;
     }
    public long getRuns()
    {
       return runs;
     }
     public  String getBatsman()
    {
       return batsman;
    }
   public String getBowler()
   {
       return bowler;
    }
    public String getNonstriker()
    {
       return nonStriker;
    } 
}  

public class Main
{
  public static void main(String args[])
 {
   Delivery d=new Delivery(long a,long b,long c,String d,String e,String f);
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the over");
      long a=s.nextLong();
     System.out.println("Enter the ball");
      long b=s.nextLong();
       System.out.println("Enter the runs");
      long c=s.nextLong();
     System.out.println("Enter the batsman name");
      String d=s.nextLine();
    System.out.println("Enter the bowler name");
      String e=s.nextLine();
   System.out.println("Enter the nonstriker name");
      String f=s.nextLine();
    System.out.println("Over:" + d.getOver());
     System.out.println("Ball:" + d.getBall());
     System.out.println("Runs:" + d.getRuns());
     System.out.println("Batsman:" + d.getBatsman());
     System.out.println("Bowler:" + d.getBowler());
     System.out.println("NonStriker:" + d.getNonStriker());
  }
}
    

   
     
   