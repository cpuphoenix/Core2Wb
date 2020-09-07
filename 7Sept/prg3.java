
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		System.out.println("Quotient: "+(q/d));
		System.out.println("Remainder: "+(q%d));
	}
}
