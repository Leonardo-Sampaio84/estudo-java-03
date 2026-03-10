import java.util.Scanner;
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while(continuar == 'S' || continuar == 's') {
        System.out.println("Digite um número para tabuada");
        int num =  scanner.nextInt();

            for(int i = 1; i <= 10; i++){
              System.out.println(num + " x " + i + " = " + (num * i));
        }
            System.out.println("Deseja continuar? (S/N)");
            continuar = scanner.next().charAt(0);

            while(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n'){
                System.out.println("Digite uma opção válida! S/N");
                continuar = scanner.next().charAt(0);
            }

        }
        System.out.println("Obrigado, vamos encerrar!");
        scanner.close();


    }
}

