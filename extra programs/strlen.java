// get a string as input and print the string length
import java.util.*;
class strlen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        System.out.println("The length of the entered string is:"+ s1.length());
    }
}