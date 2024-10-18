import java.util.Scanner;

public class scanner_line {
    public static void main(String args[]){
        Scanner input_one = new Scanner(System.in);
        System.out.println("Entre Your username plz!");
        String username = input_one.nextLine();
        Scanner input_two = new Scanner(System.in);
        System.out.println("entre ur password plz!");
        String password = input_two.nextLine();
        System.out.println("Your username is"+ username + " and your password is" + password);

    }
}
