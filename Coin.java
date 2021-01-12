// *******************************************************************
//   Coin.java            Author: Lewis and Loftus
//
//   Represents a coin with two sides that can be flipped.
// *******************************************************************

public class Coin
{
   public final static int HEADS = 0;
   public final static int TAILS = 1;

   private int face;

// ---------------------------------------------
//   Default constructor
//   Sets up the coin by flipping it initially.
// ---------------------------------------------
   public Coin ()
   {
      flip();
   }

// -----------------------------------------------
//   Flips the coin by randomly choosing a face.
// -----------------------------------------------
   public void flip()
   {
      face = (int) (Math.random() * 2);
   }

// -----------------------------------------------------
//   Returns the current face of the coin as an integer.
//@return  HEADS or TAILS constant values
// -----------------------------------------------------
   public int getFace()
   {
      return face;
   }

// -----------------------------------------------------
//   Updates the current face of the coin as an integer.
//   Follows HEADS/TAILS constants as convention
// -----------------------------------------------------
   public void setFace(int f)
   {
      face = f;
   }

// ----------------------------------------------------
//   Returns the current face of the coin as a string.
// ----------------------------------------------------
   public String toString()
   {
      String faceName;
   
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
   
      return faceName;
   }
}
