import java.util.*;
class array4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=sc.nextInt();
        int arr4[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements");
            arr4[i]=sc.nextInt();
        } 
        int s=0;
        System.out.println("enter a no check if in array?:");
        s=sc.nextInt();
        for(int j=0;j<n;j++){
            if(s== arr4[j]){
                System.out.println("the element is found");
            }
            
        }
        
    }
}
