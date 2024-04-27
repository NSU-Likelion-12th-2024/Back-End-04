package homework;
//Stream, map, filter, sorted 이용
//map():요소들을 조건에 맞게 출력
//filter():조건에 안 맞는 요소 제외
//sorted():스트림 요소를 정렬

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class User{
    String name;
    int power;
    int level;

    User(String name, int level, int power){
        this.name=name;
        this.power=power;
        this.level=level;
    }
}
public class UserLevel {
    public static void main(String[] args){
        List<User> users=new ArrayList<>(Arrays.asList(
                new User("James",10,3000),
                new User("Alice",20,4000),
                new User("Thomas",15,3500)));

        //1.유저 네임 전체 출력
        System.out.println("[User Name]");
        users.stream().map (n->n.name)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        //2.Power 총합 출력
        System.out.println("[User Power 합계]");
        int sum = users.stream().map(p->p.power)
                .reduce(0,Integer::sum);
        System.out.println(sum);
        System.out.println();

        //3.level 15이상인 유저 네임을 대문자로 바꾸고 정렬해서 출력
        System.out.println("[User Level 15 이상]");
        users.stream().filter(user->user.level>=15)
                .map(user->user.name.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
