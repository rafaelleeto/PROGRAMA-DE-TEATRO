import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static int opcao = 0;

    public static void Menu() {


        do {
            //Inicializa o Menu//
            System.out.println("Menu do teatro");
            System.out.println("1- Menu de vendas de ingressos");
            System.out.println("2- Desistencia da compra");
            System.out.println("3- Mostrar os andares do teatro");
            System.out.println("4- Lista de logs");
            System.out.println("5- Mostrar os ganhos do teatro");
            System.out.println("0- Sair do Programa");

            Try();          // CHAMA FUNÇÃO DE VERIFICAR SE É UM INTEIRO UM UMA STRING

            if (opcao == 1) {
                Vendas.Vendas(); // Se 1- ENTRA NA OPÇÃO DE COMPRAR CADEIRA
            } else if (opcao == 2) {
                Desistencia.Desistencia(); // se 2- Opção de pedir reembolso da cadeira
            } else if (opcao == 3) {
                Andares.Andares(); // se 3- Mostra todos os andares
            } else if (opcao == 4) {
                Log.Log(); // se 4- Mostra todas as cadeiras compradas/ reembolsadas.
            } else if (opcao == 5) {
                Log.Total();
            }

        } while (opcao != 0); // se 0- O Programa fecha


        Erros.Encerramento();
        Log.Log();

    }


    public static void Try() {

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();
        while (true) {

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                break;
            } else {
                System.out.println("VOCE DIGITOU UM NUMERO INVALIDO NO MENU, DIGITE OUTRO");
                scanner.next();
            }
        }

    }
}