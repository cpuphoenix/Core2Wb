

import java.io.*;
class Test{

	public static void main(String[] args) throws IOException{
		System.out.print("Enter number of columns : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			int num=0;
			for(int j=0;j<n-1-i;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				if(num==0)
					num = 1;
				else
					num = 0;
			}



			System.out.println("");
		}

	}

}
