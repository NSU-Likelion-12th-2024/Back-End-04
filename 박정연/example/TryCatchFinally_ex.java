package example;

public class TryCatchFinally_ex {
    public static void main(String[] args){
        try{
            int x=10;
            System.out.printf("10 / %d = %d\n",x,10/x);

            String str="try catch";
            int length = str.length();
            System.out.println("length = "+length);

            int[] arr = new int[5];
            arr[5] =11111;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("NullPointerException: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }finally {
            System.out.println("finally: 예외 발생여부와 관계없이 최종적으로 실행되는 메세지입니다.");
        }
    }
}
