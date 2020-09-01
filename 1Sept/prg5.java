

import java.io.*;
class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		if(n1>n2)
			System.out.println("Max is : "+n1);
		else if(n2>n1)
			System.out.println("Max is : "+n2);
		else
			System.out.println("Both are EQUAL");
				
	}

}
