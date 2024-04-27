package example;

public class ExtendException_ex {
    public static void main(String[] args){
        try{
            myException();
        }catch(MyException e){
            System.out.println(e.getMessage());
            System.out.println("Error code: "+e.getERRCODE());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void myException() throws Exception{
        throw new MyException("MyException에서 예외가 발생했습니다.",500);
    }
}
