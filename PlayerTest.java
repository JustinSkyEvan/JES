import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	@Test
	public void TestGetSlotsToReveal () {
		int NUMBER_OF_COINS = 4;
		int REVEALS_PER_TURN = 2;
		int MAX_NUM_TURNS = 10;
		
		StrategicPlayer myPlayer = new Player();
		myPlayer.beginGame(NUMBER_OF_COINS,REVEALS_PER_TURN,MAX_NUM_TURNS);
		
		
		assertEquals(myPlayer.getSlotsToReveal().length(),NUMBER_OF_COINS);
	}
	
}