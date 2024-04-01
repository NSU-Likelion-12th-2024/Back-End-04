package homework;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int x= input.nextInt();

        System.out.printf("===== %d단 =====",x);
        for(int a=1;a<=9;a++)
        {
            System.out.printf("%d * %d = %2d",x,a,x*a);
            System.out.println();
        }
    }
}
