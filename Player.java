public class Player implements StrategicPlayer {
	private int coinsPerWheel;
	private int revealsPerSpin;
	private int maxNumSpins;
	
	public void beginGame(int newCoinsPerWheel, int newRevealsPerSpin, int newMaxNumSpins) {
		coinsPerWheel = newCoinsPerWheel;
		revealsPerSpin = newRevealsPerSpin;
		maxNumSpins = newMaxNumSpins;
		//System.out.println("\nstarting new game: " + coinsPerWheel + " coins," + revealsPerSpin + " reveals, " + maxNumSpins + " spins");
	}
	
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
		
		//return "reveal_these";
	}
	
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
			System.out.println("first: " + first + " second: " + second);
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
		
		//return "flip_these";
	}
	
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