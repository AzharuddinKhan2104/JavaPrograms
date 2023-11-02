package basics;

public class BasicMathematicCalculator {

    public static void main(String[] args) {
        addition(2,3,6,8);
        multiplication(5);
        divison(100,4);
        subtraction(300,500);
    }

    static void subtraction(int... numbers){
        int result=0;
        if(numbers[0]>numbers[1]){
            result = numbers[0]-numbers[1];
            System.out.println("Subraction of two numebrs: "+result);
        }else{
            result =numbers[1]-numbers[0];
            System.out.println("Subtraction of two numbers: "+result);
        }
    }
    static void addition(int ... numbers){
        int result = 0;
        for(int i=0;i<numbers.length;i++){
            result = result + numbers[i];
        }
        System.out.println(result);
    }

    static void multiplication(int... numbers){
        int result = 1;

        for(int i=0;i<numbers.length;i++){
            if(numbers.length==1){
                System.out.println("Two Multiply , please provide two numbers");
                break;
            }else {
                result =result*numbers[i];
            }
        }
        System.out.println(result);
    }

    static void divison(double ... numbers){
        double result = 0;
        if(numbers.length>1){
            result = numbers[0]/numbers[1];
        }
        System.out.println(result);
    }
}
