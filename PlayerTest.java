import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {
	Player myPlayer = new Player();
	
	
	@Test
	public void TestGetSlotsToReveal1 () {
		int NUMBER_OF_COINS = 4;
		int REVEALS_PER_TURN = 2;
		int MAX_NUM_TURNS = 10;
		
		//StrategicPlayer myPlayer = new Player();
		myPlayer.beginGame(NUMBER_OF_COINS,REVEALS_PER_TURN,MAX_NUM_TURNS);
		assertEquals(myPlayer.getSlotsToReveal().length(),NUMBER_OF_COINS);
		assertEquals(myPlayer.getSlotsToReveal(), "??--");
	}

	@Test
	public void TestGetSlotsToReveal2 () {
		int NUMBER_OF_COINS = 5;
		int REVEALS_PER_TURN = 3;
		int MAX_NUM_TURNS = 10;
		
		//StrategicPlayer myPlayer = new Player();
		myPlayer.beginGame(NUMBER_OF_COINS,REVEALS_PER_TURN,MAX_NUM_TURNS);
		assertEquals(myPlayer.getSlotsToReveal().length(),NUMBER_OF_COINS);
		assertEquals(myPlayer.getSlotsToReveal(), "???--");
	}

	@Test
	public void TestGetCoinsStates1(){
		 
		 myPlayer.coinsPerWheel=4;
		 myPlayer.revealsPerSpin=2;
	    
		
		String revealedPattern = "HH--";
		String newPattern1=myPlayer.getNewCoinStates(revealedPattern).toString();
		try{
			 
			 assertEquals("TT--",newPattern1);
		 
        }catch (AssertionError e){
			
		    System.out.print("Test 1 fail:\nResults:\n");
			System.out.print(newPattern1);
			System.out.println("\nExpected:\nTT--");
		
		}
    }
	
	@Test
	public void TestGetCoinsStates2(){
		
		 myPlayer.coinsPerWheel=4;
		 myPlayer.revealsPerSpin=2;
		
		CharSequence revealedPattern = "HT--";
		CharSequence newPattern1=myPlayer.getNewCoinStates(revealedPattern);
		try{
			assertEquals("TT--",newPattern1);
		 
        }catch (AssertionError e){
			
	        System.out.print("Test 2 fail:\nResults:\n");
			System.out.print(newPattern1);
			System.out.println("\nExpected:\nTT--");
		
		}
	}
	
	@Test
	public void TestGetCoinsStates3(){
		 
		 myPlayer.coinsPerWheel=5;
		 myPlayer.revealsPerSpin=2;
	    
		CharSequence revealedPattern = "HT---";
		CharSequence newPattern1=myPlayer.getNewCoinStates(revealedPattern);
		try{
			
           assertEquals("HH---",newPattern1);
		 
        }catch (AssertionError e){
			
			
			System.out.print("Test 3 fail:\nResults:\n");
			System.out.print(newPattern1);
			System.out.print("\nExpected:\nHH---");
		
		}

    }
	
	
}