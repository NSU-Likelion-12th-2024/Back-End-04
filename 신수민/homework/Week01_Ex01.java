package week01Day2;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("숫자 : " + num);

        for (int i = num; i <num +1 ; i++) {
            for (int j = 1; j <10; j++) {
                System.out.println(i+" * "+j + " = " +i*j );

//수정

            }

        }
    }
}
