//getting a str as input and printing if its palindrome or not
import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p1=sc.nextLine();
        //getting length for the loop
        int len=p1.length();
        //converting into lower case
        p1=p1.toLowerCase();
        //rev using for loop
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev+=p1.charAt(i);
        }
        //checking palidrome
        if(p1.equals(rev)){
            System.out.println("the entered word is a palindrome");
        }
        else{
            System.out.println("the entered word is not a palindrome");
        }
    }
}