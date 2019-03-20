import java.util.*;
//import java.io.*;
public class J3IconScaling {
	public static void main(String[] args) throws Exception
	{
		//input by how much you want it scaled, then what you want scaled 
		
		
		//Initialize sc & pw
		//Scanner sc = new Scanner( new FileReader("TestIn.txt"));	
		//PrintWriter pw = new PrintWriter(new FileWriter("TestOut.txt"));
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		//variable initialising, and setting up array
		int scale = sc.nextInt();
		String input = sc1.nextLine();
		int len = input.length();
		String arr[][] = new String[len][len]; 
		char let;
		String line;
		
		//creating second array
		int newlen = len * scale; 
		String arr2[][] = new String [newlen][newlen]; 
		
		//input for array
		for(int i = 0; i < len; i++){	
			if (i == 0){
				line = input;
			}else{	
					 line = sc2.nextLine();
			}
					
			//put characters into second array
			
			//select characters one by one
			for(int t = 0; t < len; t++){
				let = line.charAt(t);
				String lets = (let + "");
				arr[i][t] = lets;
				
				//put character into new array 'scale' amount of times
				for (int p = 0; p < scale; p++) {
			 		for (int o = 0; o < scale; o++) { 
			 			
			 			arr2[i*scale+p][t*scale+o] = lets;
					 	
			 		}
				}
			}	
		}
		//output new array
		for(int i = 0; i<newlen;i++){
			for (int t = 0; t<newlen;t++){
				//pw.print(arr2[i][t]);
				System.out.print(arr2[i][t]);
			}
			//pw.println();
			System.out.println();
		}
		//pw.flush();
		sc.close();
		sc1.close();
		sc2.close();
	}
}