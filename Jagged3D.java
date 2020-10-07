
import java.util.Scanner;

class Test{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Planes : ");
		int planes = sc.nextInt();
		int[][][] arr = new int[planes][][];
		int rows = 0;
		int columns = 0;

		//initialized 3D array		
		for(int i=0;i<planes;i++){
			System.out.print("Rows of plane "+i+" : ");
			rows = sc.nextInt();
			//columns =  sc.nextInt();
			//arr[i] = new int[rows][columns];
			arr[i] = new int[rows][];
			for(int j=0;j<rows;j++){
				System.out.print("Columns for rows"+j+": ");
				columns = sc.nextInt();
				arr[i][j] = new int[columns];
			}
		}

		
		//checking dimensions
		System.out.println("***DIMENSIONS***");
		for(int i=0;i<planes;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.println("Planes "+i+": Row: "+j+":"+ arr[i][j].length);
			System.out.println();  
		}

		//inputting elements
		System.out.println("***INPUTSSS***");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				for(int k=0;k<arr[i][j].length;k++){
					System.out.print("DATA: ");
					arr[i][j][k] = sc.nextInt();;}
		}

		//outputing elements
		System.out.println("***DATAAA***");
		for(int i=0;i<arr.length;i++){
			System.out.println("DATA in PLANE "+i);
                        for(int j=0;j<arr[i].length;j++){
                                for(int k=0;k<arr[i][j].length;k++)
                                        System.out.print(arr[i][j][k]+" ");
				System.out.println("");
			}
                }
		

	}

}


