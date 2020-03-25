// Mark Dugay
// Rock, Paper, Scissors, Lizard, Spock (RPSLS) Program

import java.util.Scanner;

public class RPSLS{
	public enum userChoice{
   	 Rock, Paper, Scissors, Lizard, Spock
     }

	public static final int OPTIONS = 5;
	private static final String NULL = null;
	
    public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("\nWelcome to Rock, Paper, Scissors, Lizard, Spock!\n");
      int userWinCount = 0;
      int computerWinCount = 0;
      int tieCount = 0;
      float avgGestures = 0;
      char playAgain = 'Y';
      String computerChoice = NULL;
      
      while (playAgain == 'Y' || playAgain =='y'){
  
    	  int randomChoice = (int)(Math.random() * OPTIONS);
    	  System.out.println("Please enter your choice: ");
    	  System.out.println("Rock, Paper, Scissors, Lizard, or Spock ?");
    	  String userChoice = input.next();

    	  // Use switch statement to change int to string
    	  // Compare computerChoice with userChoice using if-else statements
    
    	  switch(randomChoice){
    	  case 0 : // Rock
    		  computerChoice = "Rock";
    		  System.out.println("Computer chose: " + computerChoice);
    		  if (userChoice.equals(computerChoice)){
    			  System.out.println("It's a tie!");
    			  tieCount++;
    		  }
    		  else if (userChoice.equals("Scissors")){ //scissors
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Rock crushes Scissors. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Paper")){ //paper
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Paper covers Rock. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Lizard")){ //lizard
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Rock crushes Lizard. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Spock")){ //spock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Spock vaporizes Rock. You win!");
    			  userWinCount++;
    		  } 
    		  break;
    	  case 1 : //Scissors
    		  computerChoice = "Paper";
    		  System.out.println("Computer chose: " + computerChoice);
    		  if (userChoice.equals(computerChoice)){
    			  System.out.println("It's a tie!");
    			  tieCount++;
    		  }
    		  else if (userChoice.equals("Rock")){//rock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Paper covers Rock. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Scissors")){ //scissors
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Scissors cuts Paper. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Lizard")){ //lizard
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Lizard eats Paper. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Spock")){ //spock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Paper disproves Spock. You lose!");
    			  computerWinCount++;
    		  }
    		  break;
    	  case 2 : // Scissors
    		  computerChoice = "Scissors";
    		  System.out.println("Computer chose: " + computerChoice);
    		  if (userChoice.equals(computerChoice)){
    			  System.out.println("It's a tie!");
    			  tieCount++;
    		  }
    		  else if (userChoice.equals("Paper")){ //paper
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Scissors cuts Paper. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Rock")){ //rock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Rock crushes Scissors. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Lizard")){ //lizard
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Scissors decapitates Lizard. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Spock")){ //spock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Spock smashes Scissors. You win!");
    			  userWinCount++;
    		  }
    		  break;    
    	  case 3 : // Lizard
    		  computerChoice = "Lizard";
    		  System.out.println("Computer chose: " + computerChoice);
    		  if (userChoice.equals(computerChoice)){
    			  System.out.println("It's a tie!");
    			  tieCount++;
    		  }
    		  else if (userChoice.equals("Paper")){ //paper
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Lizard eats Paper. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Rock")){ //rock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Rock crushes Lizard. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Scissors")){ //scissors
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Scissors decapitates Lizard. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Spock")){ //spock
    			  System.out.println("You chose: " + userChoice);
    			  System.out.println ("Lizard poisons Spock. You lose!");
    			  computerWinCount++;
    		  }
    		  break;
    	  case 4 : // Spock
    		  computerChoice = "Spock";
    		  System.out.println("Computer chose: " + computerChoice);
    		  if (userChoice.equals(computerChoice)){
    			  System.out.println("It's a tie!");
    			  tieCount++;
    		  }
    		  else if (userChoice.equals("Paper")){ //paper
    			  System.out.println ("Paper disproves Spock. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Rock")){ //rock
    			  System.out.println ("Spock vaporizes Rock. You win!");
    			  userWinCount++;
    		  }
    		  else if (userChoice.equals("Scissors")){ //scissors
    			  System.out.println ("Spock smashes Scissors. You lose!");
    			  computerWinCount++;
    		  }
    		  else if (userChoice.equals("Lizard")){ //lizard
    			  System.out.println ("Lizard poisons Spock. You win!");
    			  userWinCount++;
    		  }
    		  break;	   
    	  }
    	  
    	  // Update score
    	   System.out.println("Update: The score is now " +userWinCount+ " (you) to " + computerWinCount + " (computer)");
    
    	  //prompt user if they would like to play another game
    	  System.out.println("Would you like to continue? (Y/N)");
    	  playAgain = input.next().charAt(0);
      }
      if(playAgain != 'Y' || playAgain != 'y'){
    	  input.close();	
    	  avgGestures = tieCount;
    	  avgGestures = avgGestures/5;
    	  System.out.println("Number of times the user won: " + userWinCount);
    	  System.out.println("Number of times the computer won: " + computerWinCount);
    	  System.out.println("Number of times the user and the computer tied: " + tieCount);
    	  System.out.println("Average number of gestures to determine a winner: " + avgGestures);
      }	
   }
}