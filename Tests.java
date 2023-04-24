public class Tests {

    public static void main(String[] args){
        System.out.println("testing my NimRunner class:");
        System.out.println("testing runGame()");
        System.out.println(NimRunner.runGame(1, true)); //should be false (Y win)
        System.out.println(NimRunner.runGame(10, true)); //should be true (X win)
        System.out.println(NimRunner.runGame(1, false)); //should be true (X win)
        System.out.println(NimRunner.runGame(10, false)); //should be false (Y win)

        //not working hmmmm
        System.out.println("testing minimax:");
        System.out.println(NimRunner.minimax(1, true)); //should be 1
        System.out.println(NimRunner.minimax(2, true)); //should be 1
        System.out.println(NimRunner.minimax(3, true)); //should be 1
        System.out.println(NimRunner.minimax(4, true)); //should be -1
        System.out.println(NimRunner.minimax(5, true)); //should be -1
        System.out.println(NimRunner.minimax(6, true)); //should be -1
        System.out.println(NimRunner.minimax(7, true)); //should be 1

        System.out.println("testing best move:");
        

    }

}