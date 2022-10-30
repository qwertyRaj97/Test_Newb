import java.util.Scanner;
public class Pattern3
{
public static void main(String[] h)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Please provide number of rows to print--> ");
int rows = scanner.nextInt();
System.out.println("\nThe star pattern is--> ");
for (int m = 1; m <= rows; m++)
{
for (int n = 1; n < m; n++)
{
System.out.print(" ");
}
for (int p=rows; p>=m; p--)
{
System.out.print("X");
}
System.out.println();
}
}
}
