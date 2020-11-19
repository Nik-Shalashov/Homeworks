package java2hw2;

public class MyArraySizeException extends IndexOutOfBoundsException{
    public MyArraySizeException(String s) {
        super(s);
        System.out.println("Читай внимательнее! Размер массива не 4х4!");
    }
}
