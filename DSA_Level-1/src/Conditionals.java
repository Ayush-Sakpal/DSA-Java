import java.util.Scanner;

public class Conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if(marks > 90 && marks <= 100) {
            displayMessage("Excellent!");
        }
        else if(marks > 80 && marks <=90){
            displayMessage("Good!");
        }
        else if(marks > 70 && marks <= 80){
            displayMessage("Fair");
        }
        else if(marks > 60 && marks <= 70){
            displayMessage("Meet Expectations");
        }
        else if(marks <= 60){
            displayMessage("Below par");
        }
        else{
            displayMessage("Entered marks are invalid!");
        }
    }

    public static void displayMessage(String s){
        System.out.println(s);
    }
}
