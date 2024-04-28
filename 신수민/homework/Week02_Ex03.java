package homework;

public class Week02_Ex03 {
    public static void main(String[] args) {
        String name = "신수민";
        String id = "000104-1234567";
        String phone = "010-8336-2500";

        System.out.println("이름: " + getHiddenData(name,1));
        System.out.println("주민등록번호: " + getHiddenData(id,8));
        System.out.println("전화번호: "+ getHiddenData(phone,9));
    }

    //substring(int n) n번 까지의 문자열을 반환
    //length 문자열의 길이를 반환
    //repeat(int n) 문자열을 n번 반복
    public static String getHiddenData(String data, int hiddenNum){
        String hidden = "*".repeat(data.length()-hiddenNum);
        return data.substring(0, hiddenNum) + hidden;
    }
}
