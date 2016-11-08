public class DiceGame_Main
{

   public static void main(String[] args)
   {
      // 1. Instantier et DiceGame Objekt med navn "Player One"
   
      DiceGame diceGameOne = new DiceGame("Player One");   
      DiceGame diceGameTwo = new DiceGame("Player Two"); 
    
      // 2. Sæt spillet i gang
   
      diceGameOne.play();
      diceGameTwo.play();
        
   }

}