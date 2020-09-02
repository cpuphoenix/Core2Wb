
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		for(int i=n1;i<=n2;i++)
			if(i%2==0)
				System.out.print(i+" ");
		

	}


}
