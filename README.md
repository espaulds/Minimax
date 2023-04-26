# Minimax

## background and motivation:

- Nim is a mathematical game of strategy in which two players take turns removing objects from distinct heaps or piles. The Minimax algorithm is a simulation of Nim that generates the most optimal move (choosing from 1-3 objects from the pile) for the player. Using recusion, the program is able to generate all possible outcomes for the player, therefore, it is sure to predict the most optimal path to take in order to win the game. 
- Nim is a very good test for this algorthm as there are many possible outcomes based on how many object a player takes, therefore, many places for the recusive function to run. It also is a two-player, zero-sum game and has very simple implementation, so its easier to test it on a simple game before testing it on a more complecated game like chess. 

## usage:
In order to run my code and play this game, one should create a new java file. In their main method, they will be able to call the NimRunner methods of runGame, minimax, and best move. When calling the runGame method, the user should input into the parameters an int representing the number of starting pieces (state), and a boolean that represents whether player X or player Y is starting (true if player X and false if player Y). To use the minimax method, the inputs are an interger representing the number of pieces in the game and a boolean representing whose turn it is. This method will return either 1 or -1, an indicator of who the game favors at that turn. Finally, if bestMove were to be called, its inputs are the number of pieces in the game and a boolean representing the turn. This method will return the most favorable turn for the outcome of a win for that user. 

## future directions:
- (written before development of Regular Nim game): If I were to make updates to this code, I would probably add the feature to add how many piles are available to pick from in the game. That would mean there would be a limit on how many a player could take during a certain turn as they cannot take from multiple piles. 
- (after Regular Nim game): If I were to update my code now, I would try to refactor my code to make it even more general or even just the least hard-coded it can be. If someone were to run this program through the command line, theoretically this code code read-in a game tree/map file (if I were to add a parse method to do so). For now, the input for the simple nim game should just be number of starting pieces and who has the first turn. 


