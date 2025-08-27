import java.util.*;
class maxarr{
    public static void main(String[] args){
        int n[]=new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("printing the elemts of the arr:");
        for(int i=0;i<6;i++){
            System.out.println(n[i]+" ");
        }
        int max=n[0];
        // to find maximum
        for(int j = 1; j < 6; j++){
            if (n[j] > max) {
                max = n[j];
            }
        }
        System.out.println("the greatest element in the arr is"+max);
    }
}