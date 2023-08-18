import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("enter number:");
        double base = read.nextDouble();
        System.out.println("enter power:");
        int power = read.nextInt();
        double result = 1;

        while(power>0)
        {
            result=result*base;
            power--;
        }
        String formattedResult = String.format("%.5f", result);
        System.out.println("The answer= "+formattedResult);

    }
}