class Phone2{
    void message(){System.out.println("일반 메시지");}
}

class SmartPhone2 extends Phone2{
    void message(){System.out.println("오버라이딩 된 메시지");}
}
public class OverRiding {
    public static void main(String[] args){
        Phone2 phone2 = new Phone2();
        SmartPhone2 smartPhone2 = new SmartPhone2();
        phone2.message();
        smartPhone2.message();
    }
}
