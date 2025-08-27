import java.util.*;
class countarr1{
    public static void main(String[] args) {
        int Count=0;
        int n[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 elements");
        for(int i=0;i<5;i++){
            n[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++){
            if(n[j]>50){
                Count=Count+1;
            }
        }
        System.out.println("the no of elements above 50 is"+Count);
        
    }
}