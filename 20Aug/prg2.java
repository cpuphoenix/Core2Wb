
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		float n = Float.parseFloat(br.readLine());
		float r = Float.parseFloat(br.readLine());
		float i =  p*n*r/100;
		System.out.println("Simple Interest is : "+ i);
	}

}
