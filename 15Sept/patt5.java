import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//No. of Columns
		int num1=1;
		for(int i=0;i<n;i++){
			int num = num1;
			for(int j=0;j<n-i;j++){
				
				System.out.print(num+" ");
				num++;
			}
			num1 = num1 + 2;
			System.out.println("");
		}

	}

}
