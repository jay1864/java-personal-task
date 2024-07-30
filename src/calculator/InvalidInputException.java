package calculator;

// 연산자 입력 오류
public class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    }
}
