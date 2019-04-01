/**
 * 
 * @author David Szczecina
 *
 */
public class Martha {
	
	public static void main(String[] args) {
	
		Player martha = new Player();
		
		martha.playTillBroke();
		
		System.out.println(martha.numTimesPlayed);
	}
}
