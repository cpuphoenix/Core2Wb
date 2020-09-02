
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		int ans = 0;
		ans = n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
		System.out.println("Maximum is : "+ans);

	}
}
