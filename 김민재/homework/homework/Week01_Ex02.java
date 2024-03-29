import java.util.Scanner;

public class Week01_Ex02 {
    public static void main(String[] args){
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Q.다음 중 프로그래밍 언어가 아닌 것은?");
            System.out.println("1. 자바");
            System.out.println("2. 파이썬");
            System.out.println("3. c언어");
            System.out.println("4. 멋쟁이사자처럼");

            int num = s.nextInt();
            if(num == 4){
                System.out.println("정답");
                break;
            }
            else{
                System.out.println("오답");
            }
        }
    }
}