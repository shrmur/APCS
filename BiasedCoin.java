// *******************************************************************
//   BiasedCoin.java            Author: Lewis and Loftus
//
// Name:Shrish Murugapandi 
// Class: AP Computer Science
//   Represents a coin with two sides that can be flipped.
// *******************************************************************

public class BiasedCoin extends Coin
{
   private double bias;
   private double face;
   
   public BiasedCoin()
   {
      super();
      bias=0.5;
   }
   
   public BiasedCoin(double bias)
   {
      super();
      this.bias=bias;
   }
   
   public void flip()
   {
      face= Math.random()*1.00;
   }
   
   public int getBias()
   {
   
      if(face<bias)
      {
         face=HEADS;
         return HEADS;
      } 
      else
      {
         face=TAILS;
         return TAILS;
      }
   
   }


}
