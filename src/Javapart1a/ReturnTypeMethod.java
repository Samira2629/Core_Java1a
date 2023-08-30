package Javapart1a;

public class ReturnTypeMethod {

    int  addNumbers(){
        int firstNumber=200;
        int secondNumber=400;
        return firstNumber*secondNumber;
    }

    public static void main(String[] args) {
        ReturnTypeMethod returnTypeMethod=new ReturnTypeMethod();
        System.out.println(returnTypeMethod.addNumbers() );

    }
}
