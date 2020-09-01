
import java.io.*;
class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("After swapping: "+n1+" , "+n2);		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swapping: "+n1+" , "+n2);

	}

}
