import java.util.Scanner;

public class BloodDonationEligibility{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age and weight:");
        int age=sc.nextInt();
        int weight=sc.nextInt();

        if((age>=18) && (weight>=55 && weight<=90)){

                System.out.println("You can denote blood");
        }else{
            System.out.println("You can denote blood");
        }


    }
}