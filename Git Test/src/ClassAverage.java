import java.util.*;
import java.io.*;

public class ClassAverage {
	public static void main(String[] args) throws Exception {
		//class average calculator
		
		//initialize scanners, variables
		int len, add;
		double avg;
		add = 0;
		
		//Scanner sc = new Scanner(System.in); 
		Scanner sc = new Scanner(new FileReader("avgtest.txt"));
		//PrintWriter pw = new PrintWriter(new FileWriter ("testOut.txt"));
		
		//getting amount of students and setting up array
		System.out.println("How many students are in the class");
		len = sc.nextInt();	
		int[] nums = new int[len];
		
		
		//input values into array
		for (int i = 0; i < len; i++){
			System.out.println("What is stutednt " + len + "'s mark");
		nums[i] = sc.nextInt();
		}
	
		for (int i = 0; i < len; i++){
		add = add + nums[i];	
		}
		
		//print result
		avg = add/len;
		System.out.print("The class average is " + avg);
		//pw.print("The class average is " + avg);
		sc.close(); 
	}
}
