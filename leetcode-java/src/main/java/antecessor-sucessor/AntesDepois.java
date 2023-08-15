import java.util.Locale;
import java.util.Scanner;

public class AntesDepois {
  
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       scanner.useLocale(Locale.US);

       System.out.print("Digite um Numero: ");
       double n1 = scanner.nextDouble();

       double media1 = n1 - 1;
       double media2 = n1 + 1;
    
      System.out.println("O antecessor de " + n1 + " é " + media1 + ".");
      System.out.println("O sucessor de " + n1 + " é " + media2 + ".");    
 }
}
