// import java.util.Scanner;
// public class temp {
//     public static double  main(int args[]){
//     System.out.println("Enter a ferhint degree");
//     Scanner c = new Scanner(System.in);
//     double degre = c.nextFloat();

//     double f = 9./5 * degre + 32;
//     return f;

    
    
// }
// }

import java.util.Scanner;

public class temp {

    public static double fahrenheitToCelsius(double fh) {
        return (fh - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        double fhr = input.nextDouble();

        double celsius = fahrenheitToCelsius(fhr);

       
        
       
        System.out.printf("Temperature in Celsius: %.3f%n", celsius);
        


     
        input.close();
    }
}
