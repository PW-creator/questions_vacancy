import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string para inverter: ");
        String original = scanner.nextLine();
        
        String invertida = inverterString(original);
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
    
    // Método para inverter uma string
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        // Loop para trocar os caracteres da posição inicial com a posição final
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }
}
