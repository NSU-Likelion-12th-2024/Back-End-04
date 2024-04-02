package example;
//=========================오버로딩
class OverLoading{
    void cat(){
        System.out.println("나는 냐옹이다옹");
    }
    void cat(String bark){
        System.out.println("고양이는 "+bark+"라고 짖는다옹");
    }
    void cat(int num){
        System.out.println("고양이는 "+num+"마리 있다옹");
    }
}

//=========================오버라이딩
class Phone{
    void message(){System.out.println("일반 메세지입니다.");}
}
class SmartPhone extends Phone{
    @Override
    void message(){System.out.println("오버라이딩 된 메세지입니다.");}
}


public class Extend_ex {
    public static void main(String[] args){
        //=========================오버로딩 결과
        OverLoading Cat = new OverLoading();
        Cat.cat();
        Cat.cat("나옹!!");
        Cat.cat(3);

        System.out.println();

        //=========================오버라이딩 결과
        Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone();
        phone.message();
        smartPhone.message();
    }
}
