// ********************************************************************
// InARow.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class InARow
{
   public static void main (String[] args)
   {
      final int FLIPS = 100; // number of coin flips
   
      int currentRun = 0; // length of the current run of HEADS
      int maxRun = 0;     // length of the maximum run so far
      int totalHeads = 0; // total # of heads tossed in this game.
      int longestStreak=0;
   // Create a coin object
      BiasedCoin shrish = new BiasedCoin();
   
   /* Flip the coin 100 times, printing the result each time 
        and updating the stats data fields */
      for(int i=0;i<FLIPS;i++)
      {
         shrish.flip();
         if(shrish.getBias()==0)
         {
            System.out.println("HEADS");
            totalHeads++;
            currentRun++;
            
         }
         else
         {
            System.out.println("TAILS");
            if(currentRun>longestStreak)
            {
               longestStreak=currentRun;
            }
            currentRun=0;
         
         
         }
         maxRun++;
      }
   // Print the results
      System.out.println("Total Heads: "+totalHeads);
      System.out.println("Max Run: "+maxRun);
      System.out.println("There were "+ longestStreak +" heads in a row");
   
   }
}
