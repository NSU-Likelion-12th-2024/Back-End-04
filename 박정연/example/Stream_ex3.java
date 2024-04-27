package example;

import java.util.Arrays;
import java.util.List;

public class Stream_ex3 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("김코딩","이자바","김자바","김코딩");
        names.stream()
                .distinct()
                .forEach(n->System.out.println(n));

        System.out.println();

        names.stream() //스트림 생성
                .filter(n->n.startsWith("김")) //.startsWith() 자바 기능
                .forEach(System.out::println);
    }
}
