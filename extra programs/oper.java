class oper{
    public static void main(String[] args) {
        int res=10+(5*5);// ++ incremnt has highest preference then */% then +,-
        System.out.println(res);
        int a=6;
        int res2=++a*5+1;
        System.out.println(res2);// a gets incremented then multiplied then added
        // bitwise not ~ operator 5=-6
        int b=5;
        int res3=(~b+2)*5;
        System.out.println(res3);//bitwise followed by other operators
        int c=4;
        int d=2;
        int e=7;
        int res4=++c*(d--+~e)-(-d);
        System.out.println(res4);
        //++c=5, d--=2, ~c=-8, rest is normal 
    }
}