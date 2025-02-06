import java.util.Scanner;

public class p9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for(int i = 0; i< 2*n; i++){
            if(i<n){
                for(int j = n-i-1; j>0; j--){
                    System.out.print(" ");
                }
                for(int k = 1; k<= (2*i)+1; k++){
                    System.out.print("*");
                }
                for(int l = 1; l <= n-i-1; l++){
                    System.out.print(" ");
                }
                System.out.println("");
            }
            else{
                for(int j = 1; j>n-i-1; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<= (2*i)+1; k++){
                    System.out.print("*");
                }
                for(int l = n-i-1; l <=1; l--){
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
