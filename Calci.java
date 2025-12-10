import java.util.Scanner;

public class Calci {
    public static void main(String [] args){
        // Calculator using java
        double num1, num2;
        String operator;
        double result;
        Scanner return_type = new Scanner(System.in);
        System.out.print("Enter the num1 value: ");
        num1 = return_type.nextDouble();
        System.out.print("Enter the num2 value: ");
        num2 = return_type.nextDouble();
        System.out.print("Enter the operator: ");
        operator = return_type.next().intern();
        if (operator == "+"){
            result = num1 + num2;
            System.out.println("The value is: "+result);
        } else if (operator == "-"){
            result  = num1 -  num2;
            System.out.println("The value is: "+result);
        } else if (operator == "*"){
            result = num1 * num2;
            System.out.println("THe value is: "+result);
        } else if (operator == "/"){
            result = num1 / num2;
            System.out.println("The value is: "+result);
        } else if (operator == "%"){
            result = num1 % num2;
            System.out.println("The value is : "+result);
        } else {
            System.out.println("SYNTAX  ERROR");
        }
    }
}
