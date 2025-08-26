import java.util.*;
class array3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr3[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements");
            arr3[i]=sc.nextInt();
        }
        System.out.println("printing the elements of the array");
        for(int j=0;j<n;j++){
            System.out.println(arr3[j]);
        }  
    }
}