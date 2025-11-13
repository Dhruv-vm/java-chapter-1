public class multilevel{
    public static void main(String[] args) {
        puppy p=new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("animals can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog can bark");
    }
}
class puppy extends Dog{
    void weep(){
        System.out.println("puppy can weep");
    }
}