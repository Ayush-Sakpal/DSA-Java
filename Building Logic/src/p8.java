import java.util.Scanner;

public class p8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for(int i = n; i >= 0; i--){
            for(int j = 0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i)+1; k++){
                System.out.print("*");
            }
            for(int l = n-i-1; l>0; l--){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
