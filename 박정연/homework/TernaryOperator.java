package homework;
//do-while문 문제풀이

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int answer;
        String result;
        do {
        System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
        System.out.println("1. 자바");
        System.out.println("2. 파이썬");
        System.out.println("3. C언어");
        System.out.println("4. 멋쟁이 사자처럼");

        answer = input.nextInt();
        result =  (answer == 4) ? "정답!!" : "오답";
        System.out.println(result);
        System.out.println();
        }while(answer!=4);
    }
}
