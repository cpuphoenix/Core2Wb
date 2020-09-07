

import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cr1 = Integer.parseInt(br.readLine());
		int ci1 = Integer.parseInt(br.readLine());
		int cr2 = Integer.parseInt(br.readLine());
                int ci2 = Integer.parseInt(br.readLine());
		System.out.println("The Addition of "+cr1+"+"+ci1+"i & "+cr2+"+"+ci2+"i is : "+(cr1+cr2)+"+"+(ci1+ci2)+"i");
		
	}
}

