

import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Side 1: ");
		int s1 = Integer.parseInt(br.readLine());	
		System.out.print("Side 2: ");
                int s2 = Integer.parseInt(br.readLine());
		System.out.print("Hypotenuse: ");
                int h = Integer.parseInt(br.readLine());
		if(h*h == (s1*s1 + s2*s2))
			System.out.println("Triangle satisfies Pythagoreon Theorem");
		else
			System.out.println("Triangle does not satisfy Pythagoreon Theorem");

	}


}
