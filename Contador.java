import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Receber os parâmetros do usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamar o método que realiza a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Tratar a exceção e exibir a mensagem de erro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close(); // Fechar o Scanner após o uso
    }

    // Método que realiza a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verificar se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calcular a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realizar a contagem e imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }    
    
}
