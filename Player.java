/**
 * Player is an implementation of the StrategicPlayer interface.
 * A simple strategy is employed to attempt to win a game with four coins and
 * two reveals per turn.  A simpler strategy is use to play a game with any other
 * setup.
 * 
 * @author Evan Ballinger
 * @author Tien Liu
 * @author Justin Wu
 * @version 20181013
 */

public class Player implements StrategicPlayer {
	private int coinsPerWheel;
	private int revealsPerSpin;
	private int maxNumSpins;
	
	public void beginGame(int newCoinsPerWheel, int newRevealsPerSpin, int newMaxNumSpins) {
		coinsPerWheel = newCoinsPerWheel;
		revealsPerSpin = newRevealsPerSpin;
		maxNumSpins = newMaxNumSpins;
		
	}
	
	/**
	* @return chosen pattern of coins to reveal
	*/
	public CharSequence getSlotsToReveal() {
		
		CharSequence thisSequence = "";
		for (int i=0; i < coinsPerWheel; i++)
		{
			if (i < revealsPerSpin)
			{
				thisSequence = thisSequence + "?";
			}
			else
			{
				thisSequence = thisSequence + "-";
			}
		}
		return thisSequence;
	}
	
	/**
	* @param revealedPattern a charSequence for the player to consider for flipping coins
	* @return the input statement with zero or more coins flipped
	*/
	public CharSequence getNewCoinStates(CharSequence revealedPattern)
	{
		
		char[] thisArray = revealedPattern.toString().toCharArray();
		if (coinsPerWheel == 4 && revealsPerSpin ==2)
		{
			int first = -1;
			int second = -1;
			for (int i = 0; i < coinsPerWheel; i++)
			{
				if (thisArray[i] != '-')
				{
					if (first == -1)
					{
						first = i;
					}
					else if (second == -1)
					{
						second = i;
					}
				}
			
			}
		
			thisArray[first] = flip(thisArray[first]);
				if (thisArray[second] != thisArray[first])
				{
					thisArray[second] = flip(thisArray[second]);
				}
					
		}
		else 
		{
			for (int i = 0; i < coinsPerWheel; i++)
			{
			if (thisArray[i] != '-')
				{
					thisArray[i] = 'H';
				}
			} 
		}
		String newPattern = new String(thisArray);
		return newPattern;
	}
	
	/**
	* Returns the oppostie coin state of the one that is passed as a param
	* @param c input coin state, should be 'H' or 'T'
	*/
	private char flip (char c){
		if (c == 'H')
		{
			return 'T';
		}
		else if (c == 'T')
		{
			return 'H';
		}
		else
			return 'E';
	}
}