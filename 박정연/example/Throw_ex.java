package example;

public class Throw_ex {
    public static void main(String[] args){
        try{
            myException();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void myException() throws Exception{
            throw new Exception("myException에서 예외가 발생했습니다.");
    }
}