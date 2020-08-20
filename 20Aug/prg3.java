

import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());

		if(year%100==0){
			if(year%400==0)
				System.out.println("Yes, it is leap year");
			else
				System.out.println("Not a leap year");
		}
		else if(year%4==0)
				System.out.println("Yes, it is leap year");
		     else	
				System.out.println("Not a leap year");

	}

}

