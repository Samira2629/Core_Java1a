package Javapart1a;

public class VoidMethod {
    String myName="Samira";
    int myAge=39;
    double myHeight=5.1;
    char myFirstChar='S';
    void giveTheValues(){
        System.out.println("My name is:"+myName);
        System.out.println("My age is:"+myAge);

    }

    public static void main(String[] args) {
        VoidMethod voidMethod=new VoidMethod();
        voidMethod.giveTheValues();

        voidMethod.giveTheValues();
        voidMethod.giveTheValues();
        voidMethod.giveTheValues();
    }



}
