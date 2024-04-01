package example;

//=============== 추상메서드_인터페이스
interface Animal{
    public static final String name = "동물"; //상수
    public abstract void move();
    public abstract void bark();
}
//=============== 추상클래스
class Dog implements Animal{
    public void move(){
        System.out.println("타다다닥");
    }
    public void bark(){
        System.out.println("왈왈");
    }
}
class Horse implements Animal{
    public void move(){
        System.out.println("다그닥다그닥");
    }
    public void bark(){
        System.out.println("히히ㅣ힝");
    }
}

//================= 메인함수
public class Abstract_ex {
    public static void main(String[] args){
        Horse horse =new Horse();
        Dog dog =new Dog();

        dog.move();
        dog.bark();
        horse.move();
        horse.bark();
    }
}
