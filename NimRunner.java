import java.util.*;
import java.io.*;
public class NimRunner {


    public static void main(String[] args){
        boolean turn = true;
        runGame();
    }

    public static boolean runGame(boolean turn){
        int state = 10;
        while(state > 0){           
            if(turn == true){
                state = state - getXMove(state);
                turn = false;
            } else {
                state = state - getYMove(state);
                turn = true;
            }
        }
        return turn;
    }

    public static int getXMove(int state){
        return 1;
    }

    public static int getYMove(int state){
        return 1;
    }

    public static int minimax(int state, boolean myTurn){
        
    }

    //extra 
    // public static void display(){
        
    // }
}