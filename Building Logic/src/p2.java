import java.util.Scanner;

public class p2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for(int i =0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
