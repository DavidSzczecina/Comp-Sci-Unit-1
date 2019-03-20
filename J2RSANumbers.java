import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class J2RSANumbers {
	public static void main(String[] args) throws Exception {
	
		// Initialize variables and scanners
		int lowerlimit, upperlimit, i, ans, temp, lowerlimitprint;
		
		Scanner sc = new Scanner(new FileReader("TestIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("TestOut.txt"));
		
		
		temp = 0;
		ans = 0;
		i = 1;
		
		
		//getting user input
		pw.println("Enter lower limit of range");
		lowerlimit = sc.nextInt();
		pw.println("Enter upper limit of range");
		upperlimit = sc.nextInt();
		lowerlimitprint = lowerlimit;
		
		if (lowerlimit == 0) {
			lowerlimit++;
		}
		
		//processing
		while (lowerlimit <= upperlimit) {
			while (i <= upperlimit) {
				if ((lowerlimit % i) == 0) {
					temp++;
					}
			i++;
			} if (temp == 4) {
				ans++;
			}
			i = 1;
			temp = 0;
			lowerlimit++;}
		
		//output
		pw.print("The number of RSA numbers between " + lowerlimitprint + " and " + upperlimit + " is " + ans);
	
		pw.flush();
		sc.close();
		pw.close();
	}
}
