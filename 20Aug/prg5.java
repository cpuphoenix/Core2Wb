
import java.io.*;

class Test{

	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Score in Physics: ");
		float phy = Float.parseFloat(br.readLine());
		System.out.print("Score in Chem: ");
                float chem = Float.parseFloat(br.readLine());
		System.out.print("Score in Math: ");
                float math = Float.parseFloat(br.readLine());
		System.out.print("Score in Bio: ");
                float bio = Float.parseFloat(br.readLine());
		System.out.print("Score in Comp: ");
                float comp = Float.parseFloat(br.readLine());

		float score = phy+chem+math+bio+comp;
		score = score/5;

		if(score>=90.0f)
			System.out.println("A Grade");
		else if(score>=80.0f)
			System.out.println("B Grade");
		else if(score>=70.0f)	
			System.out.println("C Grade");
		else if(score>=60.0f)	
			System.out.println("D Grade");
		else if(score>=40.0f)	
			System.out.println("E Grade");
		else if(score<40.0f)	
			System.out.println("F Grade");

	}
}



