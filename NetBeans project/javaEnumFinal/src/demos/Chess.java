/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

/**
 *
 * @author Agrata
 */
public class Chess {
    
    enum chessPlayer
    {
        WHITE,BLACK;
    }
    final chessPlayer getPlayer()
    {
        return chessPlayer.WHITE;
    }
    
     /*void getPlayer()
    {
        System.out.println("player not available");
    }
    * *
    */
    
    
    final chessPlayer newPlayer()
    {
        return chessPlayer.BLACK;
    }
       
    public static void main(String[] args)
    {
     Chess c = new Chess();
     System.out.println("Chess player old ="+c.getPlayer());
     System.out.println("Chess player new ="+c.newPlayer());
    }
}
