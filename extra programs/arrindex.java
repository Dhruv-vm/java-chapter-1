// to print the element index in the array
import java.util.*;
class arrindex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[6];
        //get elemts
        System.out.println("enter the elements");
        for(int i=0;i<6;i++){
            n[i]=sc.nextInt();
        }
        //get the element
        System.out.println("enter the element to get the index");
        int ele=sc.nextInt();
        for(int i=0;i<6;i++){
            if(n[i]==ele){
                System.out.println("the index position is"+i);
            }
        }
    }
}