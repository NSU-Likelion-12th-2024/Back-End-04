package example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열 스트림
public class Stream_ex {
    public static <List> void main(String[] args){
        int[] arr= new int[]{1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(a->System.out.print(a+","));

        String[] strings = new String[]{"박","정","연"}; //배열 선언
        Stream<String> stream = Stream.of(strings); //Stream.of() 스트림으로 변환_스트림의 기능 사용
        Stream<String> stream1= Stream.of(new String[]{"a","b","c"}); //배열 생성하고 바로 스트림으로 변환, 원본데이터 손상 가능성 있음
        Stream<String> stream2= Arrays.stream(strings); //Array.stream() 배열을 스트림으로 변환_배열의 기능 사용
        //기능은 동일하지만 가져온 클래스가 다름
    }
}
