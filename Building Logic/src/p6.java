import java.util.Scanner;

public class p6 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for(int i = n; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
