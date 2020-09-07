

import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of ROWS: ");
		int num = Integer.parseInt(br.readLine());
		int n = num*2 -1;
		for(int i=0;i<num;i++){
			int n1 = n;
			for(int j=0;j<=i;j++){
				System.out.print(n1+" ");		
				n1--;
			}
			n = n1+1;
			System.out.println("");
		}

	}
}
