

// Write the program to Print sum of 1-n even numbe


import java.util.Scanner;

public class PrintEven{

	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the number:");
	int num=sc.nextInt();

	int sum=0;

	for(int i=1;i<=num;i++){

		if(i%2==0){

			System.out.println(i);
		sum=sum+i;
	}
}

System.out.println("sum is:"+sum);

}
}