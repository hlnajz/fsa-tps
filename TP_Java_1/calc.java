/* 
import java.util.Scanner;
public class calc {
    public static void main(String args[]){
        System.out.println("Enter First number");
        Scanner number1 = new Scanner(System.in);
        int num1 = number1.nextInt();
        System.out.println("Enter Second number");
        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();
     

        
        
        char myChar;
        System.out.println("Enter a sign +,-,*,/");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        myChar = s.charAt(0);

        int res;

        if (myChar == '+') {
            
        } 
        switch (myChar) {
            case '+':
            res = num1 + num2;
            System.out.println(res);
                break;
            
            case '-':
            res = num1 - num2;
            System.out.println(res);
                break;
        
            case '/':
                res = num1 / num2;
                System.out.println(res);
                    break;
            case '*':
                res = num1 * num2;
                System.out.println(res);
                    break;         
            default:
                break;
        }




        

    }
}

*/


import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First number:");
        int num1 = input.nextInt();
        
        System.out.println("Enter (+, -, *, /):");
        char op = input.next().charAt(0);
        
        System.out.println("Enter Second number:");
        int num2 = input.nextInt();
        
        

       
        int result = 0;
        boolean validOperation = true;

        
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error Division by zero :(");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error Invalid operator :(");
                validOperation = false;
        }

        
        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        
        input.close();
    }
}
