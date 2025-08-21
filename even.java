import java.util.*;
class even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no to search fro even or odd");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("the entered number is even");
        }
        else{
            System.out.println("the entered number is odd");
        }

    }
}
