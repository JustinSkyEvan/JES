public class Runner {
	public static void main (String[] args)
	{
		int NUMBER_OF_COINS = 4;
		int REVEALS_PER_TURN = 2;
		int MAX_NUM_TURNS = 10;
		String REVEAL_RESULT = "-H-T-";
		
		StrategicPlayer myPlayer = new Player();
		myPlayer.beginGame(NUMBER_OF_COINS,REVEALS_PER_TURN,MAX_NUM_TURNS);
		System.out.println("player reveals these slots: " + myPlayer.getSlotsToReveal() + "\n");
		System.out.println("new coin states from player: " + myPlayer.getNewCoinStates(REVEAL_RESULT) + "\n");
		
	}

}