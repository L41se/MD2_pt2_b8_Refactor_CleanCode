package Refactoring;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperand, char result){
        switch(result) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                } else
                    throw new RuntimeException("Cant divided by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
