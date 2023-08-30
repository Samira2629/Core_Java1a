package Javapart1a;

public class ParameterizedMethod {
    //void type parameteriedMethod

    static void printMyBio(String firstName, String lastName, int age){
        System.out.println("First name is: "+firstName);
        System.out.println("Last name is: "+lastName);
        System.out.println("Age is: "+30);
    }
   //return type method
      int sum(int firstNumb, int secondNumb){
        int firstNumber= firstNumb;
        int secondNumber= secondNumb;
        return firstNumber+secondNumber;



      }


    public static void main(String[] args) {

       printMyBio("Samira","Omed",38);
       printMyBio("Sharmin","Yesmin",40);


       ParameterizedMethod parameterizedMethod=new ParameterizedMethod();
        System.out.println("The result is:"+parameterizedMethod.sum(500,300));


    }
}
