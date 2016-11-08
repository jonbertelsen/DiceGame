import java.io.*;

public class DiceGame
{
   // Attributter

   private String name;
   private Die d1;
   private Die d2;

   // Metoder
   
   public DiceGame(String name)
   {
      this.name = name;
   }
   
   public void play()
   {
      int sum;
      
      // Instantier d1 og d2

      d1 = new Die();
      d2 = new Die();
            
      // Rul d1
      
      d1.roll();
      
      // Rul d2
      
      d2.roll();
      
      // Læg værdierne af d1 og d2 sammen
     
      sum = d1.getFaceValue() + d2.getFaceValue();
      
      // Hvis d1 + d2 = 7 har du vundet ellers har systemet vundet
     
      if (sum == 7)
      {
         System.out.println("Du har vundet");
      }
      else
      {
         System.out.println("Systemet har vundet");
      }
      
      // Udskriv resultat 
      
      //System.out.printf("d1:%d, d2:%d, sum:%d",
      //d1.getFaceValue(),d2.getFaceValue(),sum);
      
      System.out.println("Player: " + this.name);
      System.out.print("d1:" + d1.getFaceValue());
      System.out.print("d2:" + d2.getFaceValue());
      System.out.println("Sum:" + sum);
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return this.name;
   }
   

}