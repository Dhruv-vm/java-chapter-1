import java.util.*;
class revarr1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        System.out.println("enter the array elements");
        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("printing the array elements");
        for(int i=0;i<10;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println("now in reverse order");
        for(int j=9;j>=0;j--){
            System.out.print(n[j]+" ");
        }
    }
}