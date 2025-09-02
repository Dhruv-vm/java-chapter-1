//replace the entered string of all the 'a' to 'o'
import java.util.*;
class strreplace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with 'a':");
        String p1=sc.nextLine();
        p1=p1.toLowerCase();
        System.out.println(p1.replace('a','o')); 
    }
}