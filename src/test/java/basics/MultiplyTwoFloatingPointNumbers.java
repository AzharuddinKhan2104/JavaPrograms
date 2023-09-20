package basics;

public class MultiplyTwoFloatingPointNumbers {
    public static void main(String[] args) {
        multiplyTwoFloatingPointNumbers(10.5f,10.8f);
    }

    static void multiplyTwoFloatingPointNumbers(float number1, float number2){
        float result = number1 * number2 ;
        System.out.println("Multiplication of two floating point number is : "+result);
    }
}
