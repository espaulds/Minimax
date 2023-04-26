import java.util.*;
import java.io.*;
public class NimRunner {


    public static void main(String[] args){
        boolean turn = true;
        //runGame(true);
    }

    //runs game of simple nim game
    public static boolean runGame(ArrayList<Integer> state, boolean turn){
        //random state number
        //int state = 10;
        //runs loop while state is more than 0
        while(state > 0){  
            //if it is your turn...         
            if(turn == true){
                //...the state is altered by your move (hard coded to be 1)
                state = state - getXMove(state);
                //change so next loop is not your turn
                turn = false;
            //if it is not your turn...
            } else {
                //...the state is altered by their move (hard coded to be 1)
                state = state - getYMove(state);
                //change so next loop is your turn
                turn = true;
            }
        }
        //returns true if X one, false if Y won
        return turn;
    }

    //move methods --> hard coded to be 1 for both
    public static ArrayList<Integer> getXMove(ArrayList<Integer> state){
        return 1;
    }

    public static ArrayList<Integer> getYMove(ArrayList<Integer> state){
        return 1;
    }

    //tells if state is good or bad for player
    public static int minimax(ArrayList<Integer> numPiecesRemaining, boolean myTurn){
        //base case --> getting best outcome scores
        for(int i = 0; i<numPiecesRemaining.size(); i++){
            if(numPiecesRemaining.get(i) == 0){
                if(myTurn == true){
                    //good for player one
                    return 1;
                } else {
                    //bad for player one
                    return -1;
                }
        //recursive step
            } else { 
                //arraylist to hold all possible scores in the turn
                ArrayList<Integer> scores = new ArrayList<>();
                //for loop going through all 3 possible moves
                for(int numPiecesToTake = 1; numPiecesToTake<numPiecesRemaining.size(); numPiecesToTake++){
                    //if that move can be made (you can take that number of pieces)...
                    if(numPiecesRemaining.get(i) >= numPiecesToTake){
                        //...and add best outcome scores to score
                            //runnning minimax recursively again to get that information in base case
                        scores.add(minimax(numPiecesRemaining.get(i)-numPiecesToTake, !myTurn));
                    }
                }
                //if it is your turn...
                if(myTurn == true){
                    //...return the HIGHEST (1) of the array
                    return Collections.max(scores); //return max of array
                } else {
                    //...return the LOWEST (-1) of the array
                    return Collections.min(scores); //return min of array
                }
            }
        }
    }

    //gets the best possible move for the player
    public static int bestMove(ArrayList<Integer> numPiecesRemaining, boolean myTurn){
        //for the number of possible moves (taking 1-3)
        for(int numPiecesToTake = 1; numPiecesToTake<4; numPiecesToTake++){
            //delcaring varible for minimax (to see if move is good or bad)
            int determination = 0;
            ///if move can be made...
            if(numPiecesRemaining >= numPiecesToTake){
                //...set determination to best move for player from minimax
                determination = minimax(numPiecesRemaining-numPiecesToTake, !myTurn);
            }  
            //if determination is 1 (good for player 1)...
            if(determination == 1 && myTurn == true){
                //...do that turn
                return numPiecesToTake;
            //if determination is -1 (good for player 2)...
            } else if(determination == -1 && myTurn == false) {
                //...they do that turn
                return numPiecesToTake;
            }
        }
        //if a best move doesn't exist (1), then just do a random move (1-3)
        return (int) Math.random()*3+1;


        //regular nim attempt code for getting possible moves
        public static ArrayList<ArrayList<Integer>> getPossMoves(ArrayList<Integer> state, boolean turn){
            ArrayList<ArrayList<Integer>> numMoves = new ArrayList<ArrayList<>>();
            for(int i = 0; i<state.size(); i++){
                for(int i = j; j<state.get(i); j++){
                    ArrayList<Integer> oneMove = new ArrayList<>(Arrays.asList(0,0,0));
                    oneMove.set(i,j);
                }
               numMoves.add(oneMove); 
            }
            return numMoves;
        }
    }

    

    //extra 
    // public static void display(){
        
    // }
}


/*refactoring --> 
- for loop for number of moves (possible to take more than 3)
- change state to add piles 
- change how many you can take based on how many are in a pile

change state to AL
change move to parallel AL
- Xmove & Ymove no longer integer now AL
- change for loops not to be hard coded to 3 moves
- need an AL of AL with all possible moves

- outside for loop runs amount of piles
- inside for loop runs peices in each pile 
- runs minimax on all possible moves within pieces in each pile (1-max in pile), gets best move
*/

/* getPossMoves()
#1 --> set up moves AL(AL(INT))
#2 --> (outer loop) for loop to iterate though each state (represents each pile)
    #3 --> (inner loop) for loop (or while loop) to iterate through number of possible pieces you can take from THIS particular pile (this particular index)
        can take from 1 - num of pieces (runs for numPieces)
        #4 --> make new AL(INT) (oneMove) represents one move (move being made or considered), being added to AL(AL(INT)) later
            empty arraylist [0,0,0]
        #5 --> at the index at in state (pile index), add the number of pieces 
            add where you are in loop to arraylist (at that pile): if at 1 --> [1,0,0], if 2 --> [2,0,0]
        #6 --> add onMove to moves


called in Minimax
- passing in state AL
    minimax:
    getPossMoves(state)
        iterate through moves
            figure out new state
            call minimax(new state)
called in getX & getY
 

*/
