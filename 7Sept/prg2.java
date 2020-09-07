



import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int v = Integer.parseInt(br.readLine());
		
		//n1 = n1 + n2;
		//n2 = n1 - n2;
		//n1 = n1 - n2;

		int n = m*v*v;
		float e = 0.5f*n;

		System.out.println("Kinetic Energy of that Object : "+e);
		
	}
}
