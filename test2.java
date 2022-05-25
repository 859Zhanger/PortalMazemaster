 import java.util.Scanner;

/**
 * Write a description of class test2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text;
        text = scanner.nextLine();
        System.out.println("-You entered a gate and saw a small keypad right beside you-");
        System.out.println("-Beside the key pad there is a screen showing a pattern-");
        text = scanner.nextLine();
        System.out.println("-The screen showed a message it said-");
        text = scanner.nextLine();
        while (text.equals ("go"))
        {
            System.out.println("-'type in the reverse order'");
            int e = (int)(Math.random() * 10);
            int f = (int)(Math.random() * 10);
            int g = (int)(Math.random() * 10);
            int h = (int)(Math.random() * 10);
            int i = (int)(Math.random() * 10);
            System.out.println("-'The number shown is ( )");
            int digit = scanner.nextInt();
            int reverse;
            
        }
    }
}


