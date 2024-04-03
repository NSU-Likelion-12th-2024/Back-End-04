package example;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ex {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>(); //ArrayList 생성

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("리스트의 크기 : "+fruits.size());

        String fruit = fruits.get(1); //get 메서드를 사용해 특정 인덱스 요소 가져오기
        System.out.println("인덱스 1의 과일 : "+fruit);

        boolean containsBananas = fruit.contains("Banana"); //contain 메서드를 사용해 특정 요소가 리스트에 있는지 확인
        System.out.println("Banana가 리스트에 포함되어 있는가?"+containsBananas);

        fruits.remove("Orange"); //remove 메서드를 사용하여 요소 제거
        System.out.println("Orange 요소 제거 후 : "+fruits);

        fruits.clear(); //clear 메서드를 사용하여 리스트 모두 제거
        System.out.println("모든 요소 제거 후 : "+fruits);
    }
}
