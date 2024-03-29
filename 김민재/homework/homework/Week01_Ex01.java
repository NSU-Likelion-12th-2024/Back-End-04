import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = s.nextInt();

        System.out.println("===== " + num + "단 =====");
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %2d\n", num, i, num * i);
        }
    }
}
