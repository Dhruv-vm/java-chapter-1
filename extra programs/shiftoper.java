// right shift and left shift
class shiftoper{
    public static void main(String[] args) {
        int a=5;//0101- in 8421 codeing system
        int result=a<<2;//0101 --> 10100=20
        System.out.println(result);
        int b=-20;
        int re1=b>>>2; // called a s the unsigned right shift
        System.out.println(re1);
        System.out.println("equak="+(a==b));
    }

}