import java.util.*;
class evenoddarr{
    public static void main(String[] args){
        int n[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 elements");
        for(int i=0;i<10;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("the even elements in the array is:");
        for(int i=0;i<10;i++){
            if(n[i]%2==0){
                System.out.println(n[i]+" ");
            }
        }
        System.out.println("the odd elemets in the array");
        for(int i=0;i<10;i++){
            if(n[i]%2!=0){
                System.out.println(n[i]+" ");
            }
        }
    }
}