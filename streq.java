//get 2 from user and turn into upper then compare
import java.util.*;
class streq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        //converting to upper and updating the var
        a=a.toUpperCase();
        b=b.toUpperCase();

        //check if equal
        if(a.equals(b)){
            System.out.println("both the strings are equal");
        
        }
        else{
            System.out.println("both the strings are not equal");
        }
    }
}