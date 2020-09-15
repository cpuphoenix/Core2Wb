

import java.io.*;
class Test{

	public static void main(String[] args) throws IOException{
		for(int i=0;i<5;i++){
			if (i%2!=0)
				System.out.print("  ");
			int n = 5-i;
			for(int j=0;j<=i;j++){
				System.out.print(n*n+" ");
				n++;
			}

			System.out.println("");
		}


	}
}
