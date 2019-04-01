/**
 * 
 * @author David Szczecina
 *
 */
public class Martha {
	
	public static void main(String[] args) {
	
		Player martha = new Player();
		
		int s = 2;
		martha.playTillBroke();
		
		System.out.println(martha.numTimesPlayed);
	}
}
