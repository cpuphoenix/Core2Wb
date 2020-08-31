

import java.io.*;

class Test{

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int range = Integer.parseInt(br.readLine());
                for(int i=2;i<range;i++){
			if(range%i==0)
                        System.out.print(i+" ");
                }


        }

}

