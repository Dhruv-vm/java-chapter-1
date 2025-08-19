import java.util.*;
class array2{
    public static void main(String[] args){
        int n[]=new int[10];
        //the value of the array are hardcoded
        n[0]=0;
        n[1]=1;
        n[2]=4;
        n[3]=9;
        n[4]=16;
        n[5]=25;
        n[6]=36;
        n[7]=49;
        n[8]=64;
        n[9]=81;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose a no between 1-10");
        int a=sc.nextInt();
        int b=a-1;
        System.out.println("the value in the entered position is ");
        System.out.println(n[b]);
        

    }
}