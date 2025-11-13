class markgrade{
    public static void main(String[] args) {
        int mark=78;
        if(mark>50){
            System.out.println("exam passed");
            if(mark>90){
                System.out.println("grade O");

            }
            else if(mark>80){
                System.out.println("grade a");
            }
            else if(mark>70){
                System.out.println("garde b");

            }
            else if(mark>60){
                System.out.println("grade c");
            }
        }
        else{
            System.out.println("you failed");
        }
        
    }
}