// using the charat function to print first letter and the last letter of the enterd string
import java.util.*;
class strcharat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sting:");
        String p1=sc.nextLine();
        int index1=p1.length();
        System.out.println("the first letter of the str is:"+p1.charAt(0));
        System.out.println("the last letter of the str is:"+p1.charAt(index1-1));

    }
}