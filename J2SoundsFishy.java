import java.io.*;
import java.util.*;
public class J2SoundsFishy{
	public static void main(String[] args) throws Exception {
		
		//initialize variables & scanners
		int num1, num2, num3, num4;
		Scanner getnum = new Scanner(new FileReader("TestIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("TestOut.txt"));
		
		//get input
		num1 = getnum.nextInt();
		num2 = getnum.nextInt();
		num3 = getnum.nextInt();
		num4 = getnum.nextInt();
		
		//choose what to output
		
		//if decreasing
		if ((num1 > num2) && (num2 > num3) && (num3 > num4)){
			pw.print("Fish Diving");
			
			//if increasing
			}else if ((num1 < num2) && (num2 < num3) && (num3 < num4)) {
				pw.print("Fish Rising");
				
				//if same
				}else if ((num1 == num2) && (num2 == num3) && (num3 == num4)){
					pw.print("Fish At Constant Depth");
					
					//if random
					} else {
						pw.print("No Fish");
					}
		//close scanners
		pw.flush();
		getnum.close();
		pw.close();
	}
}
