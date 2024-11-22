import java.util.Scanner;

public class Menu {
    public static void Menu() {

        Scanner scanner = new Scanner(System.in);
        int opcao;


        do {
            //Inicializa o Menu//
            System.out.println("Menu do teatro");
            System.out.println("1- Menu de vendas de ingressos");
            System.out.println("2- Desistencia da compra");
            System.out.println("3- Mostrar os andares do teatro");
            System.out.println("4- Lista de logs");
            System.out.println("0- Sair do Programa");
            opcao = scanner.nextInt(); // Usuario faz a entrada de dados da opção

            if (opcao == 1) {
                Vendas.Vendas(); // Se 1- ENTRA NA OPÇÃO DE COMPRAR CADEIRA
            } else if (opcao == 2) {
                Desistencia.Desistencia(); // se 2- Opção de pedir reembolso da cadeira
            } else if (opcao == 3) {
                Andares.Andares(); // se 3- Mostra todos os andares
            } else if (opcao == 4) {
                Log.Log(); // se 4- Mostra todas as cadeiras compradas/ reembolsadas.
            }


        } while (opcao != 0); // se 0- O Programa fecha


        Erros.Encerramento();
        Log.Log();

    }
}
