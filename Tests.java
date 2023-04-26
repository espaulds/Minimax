public class Tests {

    public static void main(String[] args){
        System.out.println("testing my NimRunner class:");
        System.out.println("testing runGame()");
        System.out.println(NimRunner.runGame(1, true) == false); //should be false (Y win)
        System.out.println(NimRunner.runGame(10, true) == true); //should be true (X win)
        System.out.println(NimRunner.runGame(1, false) == true); //should be true (X win)
        System.out.println(NimRunner.runGame(10, false) == false); //should be false (Y win)

        System.out.println("testing minimax:");
        System.out.println(NimRunner.minimax(1, true) == -1); //should be -1
        System.out.println(NimRunner.minimax(2, false) == -1); //should be -1
        System.out.println(NimRunner.minimax(5, false) == 1); //should be 1
        System.out.println(NimRunner.minimax(6, true) == 1); //should be 1
        System.out.println(NimRunner.minimax(3, false) == -1); //should be -1
        System.out.println(NimRunner.minimax(1, false) == 1); //should be 1


        System.out.println("testing best move:");
        System.out.println(NimRunner.bestMove(6, true) == 1); //should be 1 (to get to 5 pieces for their move)
        System.out.println(NimRunner.bestMove(3, true) == 2); //should be 2
        System.out.println(NimRunner.bestMove(6, false) == 1); //should be 1
        System.out.println(NimRunner.bestMove(4, false) == 3); //should be 3
        System.out.println(NimRunner.bestMove(5, false)); //should be random (1)
        System.out.println(NimRunner.bestMove(3, false) == 2); //should be 2
        
        //edge test cases
        System.out.println("edge test cases:");
        System.out.println(NimRunner.runGame(0, true) == true); //should be true, no pieces to take
        System.out.println(NimRunner.runGame(100, true) == true); //should be true (X win)
        System.out.println(NimRunner.minimax(0, true) == 1); //should be 1
        System.out.println(NimRunner.minimax(0, false) == -1); //should be -1
        System.out.println(NimRunner.bestMove(0, true)); //should be random (1)
        System.out.println(NimRunner.bestMove(0, false)); //should be random (1)
        System.out.println(NimRunner.bestMove(1, true)); //should be random (1)
        System.out.println(NimRunner.bestMove(1, false)); //should be random (1)
        System.out.println(NimRunner.bestMove(2, true) == 1); //should be 1
        System.out.println(NimRunner.bestMove(2, false) == 1); //should be 1
        System.out.println(NimRunner.bestMove(8, true) == 3); //should be random 3
        System.out.println(NimRunner.bestMove(8, false) == 3); //should be random 3

    }

}