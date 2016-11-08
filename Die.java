import java.util.Random;

public class Die
{
   // Attributter
   
   private int faceValue;
   private Random rnd = new Random(); 

   // Metoder
   
   public int getFaceValue()
   {
      // Returner faceValue
      
      return faceValue;
   
   }

   public void roll()
   {
      // Skal rulle terningen, dvs sætte faceValue til en værdi mellem 1 og 6 (tilfældigt)

      faceValue = rnd.nextInt(6) + 1;
   }   

}