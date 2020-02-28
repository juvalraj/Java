package jr11;

import java.util.Scanner;

public class fibo {
	int FirstNum;
	int SecondNum;
	int ThirdNum;
	int Limit;
	fibo(int n) {
		Limit=n;
		FirstNum=1;
		SecondNum=0;
	}
	void generateFibonacii(){
		for(int i=0;i<Limit;i++){
			ThirdNum=FirstNum+SecondNum;
			System.out.println(ThirdNum+" ");
			FirstNum=SecondNum;
			SecondNum=ThirdNum;
			
		}
	}



		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Limit");
			int Limit=sc.nextInt();
			fibo f = new fibo(Limit);
			f.generateFibonacii();
			}
}
	
