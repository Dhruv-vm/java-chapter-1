class student{
    String name;
    int roll;
    String branch;
    int  age;
    String gender;
    int sem;
    
    //constructor
    student(String name,int roll,String branch,int age, int sem,String gender){
        this.name=name;
        this.roll=roll;
        this.branch=branch;
        this.age=age;
        this.sem=sem;
    }
    void displayinfo(){
        System.out.println("name"+name+"roll"+roll+"branch:"+branch+"age"+age+"gender:"+gender+"sem:"+sem);
    }

}
public class main{
    public static void main(String[] args) {
        student s1=new student("dhry",45,"CSE",20,"M",3);
        student s2=new student("arya",12,"CST",28,"F",8);
        
    }
}