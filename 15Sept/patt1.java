
import java.io.*;
class Test{

	public static void main(String[] args) throws IOException{
		System.out.print("Enter number of columns : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char ch = 'A';
		for(int i=0;i<n;i++){
			char temp = ch;
			for(int j=0;j<n-1-i;j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++){
				System.out.print(temp+" ");
				temp++;
			}
			ch++;
			System.out.println("");
		}


	}

}
