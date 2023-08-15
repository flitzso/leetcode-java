import java.util.Locale;
import java.util.Scanner;

public class DobroTerca {
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      scanner.useLocale(Locale.US);

      System.out.print("Digite um número: ");
      double n1 = scanner.nextDouble();

      double media1 = n1 * 2;
      double media2 = n1 / 3;

      System.out.println("O dobro de " + n1 + " é " + media1 + ".");
      System.out.println("A terça parte de " + n1 + " é " + media2 + "."); 
 }
}