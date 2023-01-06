package lab01;

public class CoinFlipExperiment {
	
	/** Returns the amount of money you’d win or lose
	* by flipping an unbalanced coin 100 times.
	*
	* @return the amount of money won/lost
	*/
	static public int coinFlipExperiment ()
	{
	// finish this function: it should be as easy as moving around some code
		int winnings;
		winnings = 0;
		for (int i = 0; i <100; i++) {
		double flip = Math.random();
		if (flip < 0.505) {
			winnings +=1;
		}
		else {
			winnings -= 1;
		}
		}
		return(winnings);
	}
		


	
	public static void main(String[] args) {
		int amount = coinFlipExperiment ();
		System.out.println ("Win/loss amount: " + amount);
		/*
		// Declare an int variable to keep track of winnings.
		int winnings;
		// Set winnings to 0.
		winnings = 0;
		// Loop 100 times.
		for (int i = 0; i <100; i++) {
			// Flip the coin – reuse the code you wrote in the lab
			// If heads, add $1 to winnings.
			// If tails, subtract $1 from winnings.
			double flip = Math.random();
			if (flip < 0.505) {
				winnings +=1;
			}
			else {
				winnings -= 1;
			}
		}
		
		
		// Print out winnings.
		System.out.println("Winnings: " + winnings);
		*/
		
	}
}
