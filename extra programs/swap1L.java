import java.util.*;
class swap1L{
    public static void main(String[] args){
        //to swap 1st and last element
        int temp;
        Scanner sc=new Scanner(System.in);
        int n[]=new int[6];
        for(int i=0;i<6;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("elemts before swap:");
        for(int j=0;j<6;j++){
            System.out.println(n[j]+" ");
        }
        //swap elements
        temp=n[0];
        n[0]=n[5];
        n[5]=temp;
        
        // after swap
        System.out.println("elemts after swap");
        for(int i=0;i<6;i++){
            System.out.println(n[i]+" ");
        }
    }
}