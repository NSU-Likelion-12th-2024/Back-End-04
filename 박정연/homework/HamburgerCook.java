package homework;
//햄버거 종류 : 햄버거 치즈버거 새우버거

class Hamburger{
    String[] Hamburger;
    String Name = "햄버거";

    Hamburger(){} //생성자
    String getName(String name){
        this.Name=name;
        return name;
    }
    void cook(){ //재료 정보 표시_메소드 cook()
        System.out.printf("%s를 만듭니다.\n",getName(Name));
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}
class CheeseBurger extends Hamburger{ //치즈버거
    String name ="치즈버거";
    @Override
    void cook(){
        System.out.printf("%s를 만듭니다.\n",getName(name));
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
        System.out.println("+ 치즈");
    }
}
class ShrimpBurger extends Hamburger{ //새우버거
    String name = "새우버거";
    @Override
    void cook(){
        System.out.printf("%s를 만듭니다.\n",getName(name));
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
        System.out.println("+ 새우");
    }
}

public class HamburgerCook {
    public static void main(String[] args){
        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0]=new Hamburger();
        hamburgers[1]=new CheeseBurger();
        hamburgers[2]=new ShrimpBurger();


        System.out.println("주문하신 메뉴를 만듭니다!");
        System.out.println("=====================");

        for(Hamburger hamburger:hamburgers){
            hamburger.cook();
            System.out.println("--------------------");
        }
        System.out.println("주문이 완료되었습니다.");
    }
}
