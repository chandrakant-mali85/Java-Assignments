
/*A patient stays in the hospital for 5 days. The daily room charge is 2000rs, doctor fees 5000rs,
and medicine cost 3000rs. Write a java program to calculate the total bill.*/

public class Hospital{

public static void main(String args[]){

int DAYS=5;
long roomCharge=2000;
long doctorFees=5000;
long medicalCost=3000;

long charge=roomCharge*DAYS;

double total_bill=charge+doctorFees+medicalCost;

System.out.println("Total_bill:"+total_bill);
}

}