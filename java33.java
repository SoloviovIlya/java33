import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class java33{
   public static void main(String[] args) {
    try{
        File filelog = new File("logg.txt");
        FileWriter fileWriter = new FileWriter(filelog);
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        fileWriter.write("\nThe result is given as follows:\n");
        fileWriter.write(num1 + " " + op + " " + num2 + " = " + ans + "\n");
        fileWriter.close();
        }
     catch (Exception e){}   
    }
}