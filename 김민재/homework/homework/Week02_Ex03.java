import java.util.ArrayList;
import java.util.List;

public class Week02_Ex03 {
    public static void main(String[] args){

        List<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);

        List<Integer> odd = new ArrayList<>();

        for (int i : num){
            if (i%2 != 0){
                odd.add(i);
            }
        }
        System.out.println("입력한 리스트의 홀수 값 : ");
        System.out.println(odd);
    }
}
