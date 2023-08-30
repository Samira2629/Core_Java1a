package Javapart1a;

public class InstanceVariable {
    String myText="hello!";
    int myNumber=200;
    double myDoubleNumber=200.20;
    float myFloatNumber=200.5f;
    boolean myBoolean=true;
    char myCharacter='S';


    public static void main(String[] args) {
        InstanceVariable instancevariable=new InstanceVariable();
        System.out.println(instancevariable.myText);
        System.out.println(instancevariable.myNumber);
        System.out.println(instancevariable.myDoubleNumber);
        System.out.println(instancevariable.myFloatNumber);
        System.out.println(instancevariable.myCharacter);
        System.out.println(instancevariable.myBoolean);


    }
}
