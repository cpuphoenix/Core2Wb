
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Distance : ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.print("Time : ");
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("Velocity is : "+(n1/n2)+"m/s");
		
	}

}
