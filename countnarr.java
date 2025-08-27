// count of the entered no in an array
import java.util.*;
class countnarr{
    public static void main(String[] args){
        int Count=0;
        Scanner sc= new Scanner(System.in);
        int n[]=new int[6];
        //getting elemts of array
        for(int i=0;i<6;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("enter the elemt to see how many time it has been repeated");
        int rep=sc.nextInt();
        for (int i =0; i <6 ; i++) {
            if(n[i]==rep){
                Count=Count+1;
            }
        }
        System.out.println("the no is repeated for"+Count);
    }
    
}