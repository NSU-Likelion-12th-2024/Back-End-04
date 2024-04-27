package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_ex2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream(); //
        stream.forEach(System.out::println);
        stream.forEach(System.out::println); //스트림이 최송 연산후 닫힘
    }
}
