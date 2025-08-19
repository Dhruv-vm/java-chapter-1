import java.util.*;
class greatest{
    public static void main(String[] args){
        System.out.println("this program is to find the greatest of the two enetered no");
        System.out.println("enter number1:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter number2:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("number1 is greater than number 2");
        }
        else{
            System.out.println("number 2 is greater than number1");
        }
    }
}