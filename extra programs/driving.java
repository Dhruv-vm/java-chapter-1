//eligible to drive or not
import java.util.*;
class driving{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("do you have lisence enter true or false");
        boolean lisence=sc.nextBoolean();
        if(age>18 && lisence== true){
            System.out.println("eligible to drive");

        }
        else{
            System.out.println("not eligible to drivex");
        }
    }
}