import java.util.Scanner;

class Fibonacci2 {
    
    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceFibonacci(int num) {
        int a = 0;
        int b = 1;
        
        // Iteração para calcular os números da sequência de Fibonacci até ultrapassar o número informado
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        // Se o número informado for igual a b, então ele pertence à sequência
        return b == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número informado pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}

