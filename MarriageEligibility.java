
import java.util.Scanner;
public class MarriageEligibility {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your gender:");
    String gender=sc.nextLine();
    System.out.println("Enter your age");
    int age=sc.nextInt();
boolean result=false;
if(gender.equals("male")){
    if(age>=21){
      result=true;
    }else{
               result=false;
    }
}else if(gender.equals("female")){
        if(age>=18){
      result=true;
    }else{
               result=false;
    }
}
if(result==true){
    System.out.println("Your are eligible for marriage");
    }else{
          System.out.println("Your are  not eligible for marriage");

    }
}
}
