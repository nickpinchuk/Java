public class ArrayDataException extends RuntimeException{
    public ArrayDataException(int i, int j){
        super("Incorrect array's data : [" +i+"] [" +j+"]");
    }
}
