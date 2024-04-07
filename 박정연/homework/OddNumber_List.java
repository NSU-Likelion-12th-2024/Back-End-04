package homework;
//값을 입력하고 홀수값만 출력
//list 사용

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumber_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> Number =new ArrayList<Integer>(); //ArrayList 생성

        System.out.println("10개의 수를 입력하세요"); //값 입력
        for (int i = 0; i < 10; i++) {
            Number.add(input.nextInt());
        }

        System.out.print("\n홀수 : ");
        for(int k=0;k<10;k++){ //홀수값 출력
            if(1==Number.get(k)%2){
                System.out.print(Number.get(k));
                System.out.print(" ");
            }
        }
    }
}
