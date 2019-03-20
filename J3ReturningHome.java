import java.util.*;
public class J3ReturningHome {
	public static void main(String[] args) 
	{
		//initializing scanner and variables and array
		Scanner sc = new Scanner(System.in); 
		
		char direction[] = new char [5];
		String street[] = new String [5];
		int counter = 0;
		String left = "L";
		int t = 0;
		boolean val = true;
		String school = "SCHOOL";
		
		//getting and storing input
		while (val == true)
		{
			String temp = sc.nextLine();
			direction[t] = temp.charAt(0);
			
			temp = sc.nextLine();
			street[t] = temp;
			
			if (temp.equals(school)) {
				val = false;
			}
			counter++;	
			t++;
		}
		
		//print the output	
		for(int i = 1; i <= counter; i++) 
			{
			if ((counter - i) == 0) {
				if ((direction[counter-i] + "").equals(left))
				{
				//System.out.println("Turn RIGHT onto " + (street[counter-i]) + " street");
				System.out.println("Turn RIGHT into your HOME.");
				}
				
				else
				{
				//System.out.println("Turn LEFT onto " + (street[counter-i]) + " street");
				System.out.println("Turn LEFT into your HOME.");
				}
				
			}
			else if ((direction[counter-i] + "").equals(left))
				{
				System.out.println("Turn RIGHT onto " + (street[counter-1-i]) + " street.");
				}
			else
				{
				System.out.println("Turn LEFT onto " + (street[counter-1-i]) + " street.");
				}
			
		sc.close();
			}
	}
}
