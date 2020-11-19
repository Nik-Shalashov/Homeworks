package java2hw2;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String s) {
        super(s);
        System.out.println("Ну и как ты сделаешь из буквы цифру, умник?");
    }
    
}
