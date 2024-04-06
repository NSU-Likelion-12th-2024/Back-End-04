package homework;
//개인정보 중 일부를 비공개로 전환하는 프로그램
//개인정보를 비공개로 전환하는 메소드_getHiddenDate()

class Data {
    String Name;
    private String Id;
    protected String Phone;

    Data() {} //생성자
    public static String getHiddenData(String input, int index) { //메서드 getHiddenData()
        String str=input.substring(0,index);
        String str2="*".repeat(input.length()-index);
        String result =str.concat(str2);
        return result;
    }

    public void inputId(String id) {
        this.Id = id;
    }
}

    public class HiddenData {
        public static void main(String[] args){

        Data data = new Data();

        String name= "박자바";
        String id = "010720-1234567";
        String phone = "010-1234-5678";

        data.Name=name;
        data.inputId(id);
        data.Phone=phone;

        //문자->*_getHiddenData()
        System.out.println("이름 : "+data.getHiddenData(name,1));
        System.out.println("주민등록번호 : "+data.getHiddenData(id,8));
        System.out.println("전화번호 : "+data.getHiddenData(phone,9));
    }
}