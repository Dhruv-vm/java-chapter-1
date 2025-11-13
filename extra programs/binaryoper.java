class binaryoper{
    public static void main(String[] args) {
        int a=12;//1100 in ninary
        int b=10;//1010 in binary
        int result=a&b;//do and gate for the given binary
        System.out.println("a&b"+result);
        //for a|b
        int res=a|b;
        System.out.println("a|b:"+res);
        //xor operaryion
        int res12=a^b;
        System.out.println("a^b:"+res12);
    }
}