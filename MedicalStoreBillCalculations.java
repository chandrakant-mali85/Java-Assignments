import java.util.Scanner;

public class MedicalStoreBillCalculations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter medicine Cost:");
    double cost=sc.nextDouble();
    System.out.println("Enter medicine Quantity: ");
    double quantity=sc.nextDouble();

    double totalBill=cost*quantity;
    float discount =0.05f;

    if(totalBill>=1500){

     double amountafterDiscount=  ( totalBill*discount)/100;
     System.out.printf("Discount Applied Price:%.2f",amountafterDiscount);
    }else{
        System.out.println("Not discount applied.");
    }
        
    }
    
}
