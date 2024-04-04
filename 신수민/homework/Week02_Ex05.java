package homework;

import java.util.ArrayList;
import java.util.List;

public class Week02_Ex05 {
    public static void main(String[] args) {
        List<Integer> numArray= new ArrayList<>();

        numArray.add(5);
        numArray.add(6);
        numArray.add(7);
        numArray.add(8);
        numArray.add(9);

        List<Integer> oddArray = new ArrayList<>();

        for(int check : numArray){
            if (check %2 != 0){
                oddArray.add(check);
            }
        }
        System.out.println("입력한 리스트의 홀수 값:");
        System.out.println(oddArray);
    }
}
