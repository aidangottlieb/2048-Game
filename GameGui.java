/* program for 2048
   this is the game board i guess
   author: aidan gottlieb
   co author: ofek gila I suppose (is that how u spell ur last name)
*/

public class GameGui {
   public gameGui(int [][] numValues) {
      System.out.println(" ________________________");
      for(int a = 0; a < numValues.length; a ++) {
         System.out.println("|     |     |     |     |");
         for(int b = 0; b < numValues[a].length; b ++) {
            System.out.printf("|%05d'|", numValues[a][b]);
         }
         System.out.println("|_____|_____|_____|_____|");
      }
   }
}