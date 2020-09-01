

import java.io.*;

class Test{

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n1 = Integer.parseInt(br.readLine());
                for(int i=2;i<=n1;i++)
                        if(i%2==0)
                                System.out.println("Cube of "+i+":"+i*i*i+" and Square of "+i+":"+i*i);
        }

}

