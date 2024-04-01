package homework;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
        System.out.println("1. 자바");
        System.out.println("2. 파이썬");
        System.out.println("3. C언어");
        System.out.println("4. 멋쟁이 사자처럼");

        int answer = input.nextInt();

        switch(answer){
            case 1:
                System.out.println("오답!!");
        }
    }
}
