import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class J1TheCellSell {
	public static void main(String[] args) throws Exception{
		
		//Initialing variables & scanners
		int daytimeMins, eveningMins, weekendMins;
		double costA, costB;
		
		Scanner sc = new Scanner(new FileReader("TestIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("TestOut.txt"));
		
		//user input
		pw.println("Number of daytime minutes?");
		daytimeMins = sc.nextInt();
		
		pw.println("Number of evening minutes?");
		eveningMins = sc.nextInt();
		
		pw.println("Number of weekend minutes?");
		weekendMins = sc.nextInt();
		
		//calculations
		if (daytimeMins > 100) {
			costA = (((daytimeMins - 100) * 25) + ((eveningMins) * 15) + ((weekendMins) * 20));
			} else { costA =  (((eveningMins) * 15) + ((weekendMins) * 20));
		}
		
		if (daytimeMins > 250) {
			costB = (((daytimeMins - 250) * 45) + ((eveningMins) * 35) + ((weekendMins) * 25));
			} else { costB =  (((eveningMins) * 35) + ((weekendMins) * 25));
				}
		
		//output
		pw.println("Plan A costs " + costA);
		pw.println("Plan B costs " + costB);
		
		//which is cheaper
		if (costA > costB) {
			pw.print("Plan B is cheapest.");
			} else if (costA < costB) {
				pw.print("Plan A is cheapest.");
					} else {
						pw.print("Plan A and B are the same price.");
					}
			
		pw.flush();
		pw.close();
		sc.close();
	}
}