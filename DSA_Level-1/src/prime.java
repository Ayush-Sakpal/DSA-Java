import java.util.Scanner;
import java.lang.Math;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you wish to check: ");
        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            if(n != 1 && n != 2){
                if(isPrime(n)){
                    System.out.println("YES! " + n + " is PRIME.");
                }
                else{
                    System.out.println("NOT a prime!");
                }
            }
            else{
                System.out.println("Is a PRIME.");
            }
        }
    }

    public static boolean isPrime(int n){

        for(int i = 2; i <= Math.sqrt(n); i++ ){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
