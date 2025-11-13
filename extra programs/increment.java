//important prefix and postfixx operators
class increment{
    public static void main(String[] args) {
        int x=10;
        System.out.println("original"+x);
        System.out.println("post increment"+(x++));//prints 10 then x becomes 11
        System.out.println("aftre post increment"+x);
        System.out.println("pre increment"+(++x));// x becomes 12 then prints 12
        System.out.println("post decremnt:"+(x--));//prints 12 then x becomes 11
        System.out.println("pre decrement"+(--x));//x becomes 10 
    }
}