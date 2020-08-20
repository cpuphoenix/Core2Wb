

class Test{

	public static void main(String[] args){
		int num = 96;
		int temp=num;
		while(temp>0){
			int rem = temp%10;
			if(num%rem==0){
				temp = temp/10;
				continue;
			}
			else
				break;	
		}

		if(temp==0)
			System.out.println("Yes");

	}
}
