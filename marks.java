import java.util.*;
class marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int m[]=new int[3];
    int sum=0;
    for(int i=0;i<3;i++){
        System.out.println("enter your marks");
        m[i]=sc.nextInt();

    }
    for(int j=0;j<3;j++){
        sum=sum + m[j];
    }
    System.out.println(sum);
    float avg=sum/2;
    System.out.println(avg);
}
}