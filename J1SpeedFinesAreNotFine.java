import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class J1SpeedFinesAreNotFine {
	public static void main(String[] args) throws Exception{
		
		//added coment through eclipse on school computer 
		
		//initialize variables and scanners
		int speedLimit, speed, fine;
		
		int g = 0
				
		Scanner sc = new Scanner(new FileReader("TestIn.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("TestOut.txt"));
			
		//user input
		pw.println("Enter the speed limit:");
		speedLimit = sc.nextInt(); 
		
		pw.println("Enter the recorded speed of the car:");
		speed = sc.nextInt();
		
		//calculate fine
		if (speed < speedLimit){
			fine = 0;
			}else if (speed <= speedLimit + 20){ 
				fine = 100;
				}else if (speed <= speedLimit + 30){
					fine = 270;
				}else{ fine = 500;
						}
				
			
		
		//check what to output
		if (speed <= speedLimit){
			pw.print("Congratulations, you are within the speed limit!");			
			}else {
				pw.print("You are speeding and your fine is $" + fine);
			}
		pw.flush();
		pw.close();
		sc.close();
	}
}
