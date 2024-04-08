package example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열 스트림
public class Stream_ex {
    public static void main(String[] args){
        int[] arr= new int[]{1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(a->System.out.print(a+","));

        String[] strings = new String[]{"박","정","연"};
        Stream<String> stream = Stream.of(strings); //Stream.of() 스트림으로 변환
        Stream<String> stream1= Stream.of(new String[]{"a","b","c"});
        Stream<String> stream2= Arrays.stream(strings); //Array.stream() 배열을 스트림으로 변환
    }
}
