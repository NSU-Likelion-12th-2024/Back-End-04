package example;
//ExtendException_ex 참조
public class MyException extends Exception{
    private final int ERR_CODE;
    public MyException(String msg, int errCode){
        super(msg);
        this.ERR_CODE=errCode;
    }
    public int getERRCODE(){
        return this.ERR_CODE;
    }
}
