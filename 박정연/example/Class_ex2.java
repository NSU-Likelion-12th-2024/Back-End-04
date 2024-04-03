package example;

class Person{
    private String name;
    private int age;

    //생성자
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Person{name='"+name+"', age="+age+"}";
    }
}
public class Class_ex2 {
    public static void main(String[] args){
        Person person = new Person("jeongyeon",24);
        System.out.println(person);//toString() 메서드가 자동으로 호출
    }
}
