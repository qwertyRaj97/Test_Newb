import java.util.Scanner;
public class Pattern2
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Please provide number of rows to print--> ");
int rows = scanner.nextInt();
System.out.println("\nThe star pattern is... ");
for (int m = 1; m <= rows; m++)
{
for (int n = rows; n > m; n--)
{
System.out.print("*");
}
System.out.println();
}
}
}
