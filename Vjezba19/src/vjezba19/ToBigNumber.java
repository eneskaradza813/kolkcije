package vjezba19;

public class ToBigNumber extends Exception{

    @Override
    public String toString(){
        return "The number is too big";
    }
    
    public String getMessage(){
        return "The number is too big";
    }
}
