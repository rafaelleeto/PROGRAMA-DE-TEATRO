import java.util.Objects;
import java.util.Scanner;

public class Pagamento {
    static int opcao = 0;
    static int auxiliar = 0;
    static int[] Dinheiro = new int[100];
    static int total = 0;
    static Ingresso[] LogDinheiro = new Ingresso[100];
    static int dinheiro = 0;

    public static void Pagamento() {

        do {
            System.out.println("Selecione sua forma de pagamento");
            System.out.println("Valor unitário de 20 reais");
            System.out.println("1- PIX");
            System.out.println("2- Cartão de débito");
            System.out.println("3- Cartão de crédito");
            System.out.println("4- Dinheiro Físico");

            Try();

            if (opcao == 1) {
                Pix();
                return;

            } else if (opcao == 2) {
                CartaoDeDebito();
                return;

            } else if (opcao == 3) {
                CartaoDeCredito();
                return;

            } else if (opcao == 4) {
                DinheiroFisico();
                return;

            }

        } while (opcao != 0);
    }

    public static void Pix() {
        Scanner scanner = new Scanner(System.in);
        String QR;
        System.out.println("Escaneie o QRCODE");
        System.out.println("digite ABC para continuar");
        QR = scanner.nextLine();

        if (Objects.equals(QR, "ABC")) {
            System.out.println("Pagamento efetuado com sucesso");
            Dinheiro[auxiliar] = 20;
            auxiliar++;

        } else {
            System.out.println("Forma de pagamento inválida, tente novamente");
        }

    }

    public static void DinheiroFisico() {
        int troco;

        for (int i = 0; i < auxiliar; i++) {
            total = total + Dinheiro[i];
        }

        int DinheiroFisico;
        Scanner scanner = new Scanner(System.in);
        System.out.println("o ingresso custa 20 reais");
        System.out.println("Por favor me dê o dinheiro.");
        DinheiroFisico = scanner.nextInt();

        if (DinheiroFisico >= 20) {
            Dinheiro[auxiliar] = 20;
            auxiliar++;
            for (int i = 0; i < auxiliar; i++) {
                total = total + Dinheiro[i];
            }

            troco = DinheiroFisico - 20;
            total = total - troco;
            total = total + 20;
            System.out.println("Foi devolvido um troco de " + troco);


        } else {

            System.out.println("Quantidade de dinheiro insuficiente");
        }


    }


    public static void CartaoDeCredito() {
        String senha;
        System.out.println("Digite sua senha");
        System.out.println("PROFESSOR A SENHA É 2805");
        Scanner scanner = new Scanner(System.in);
        senha = scanner.nextLine();
        if (Objects.equals(senha, "2805")) {
            System.out.println("Pagamento efetuado");
            Dinheiro[auxiliar] = 20;
            auxiliar++;


        } else {
            System.out.println("Cartao recusado, senha inválida");

        }

    }

    public static void CartaoDeDebito() {
        String senha;
        System.out.println("Digite sua senha");
        System.out.println("PROFESSOR A SENHA É 2805");
        Scanner scanner = new Scanner(System.in);
        senha = scanner.nextLine();
        if (Objects.equals(senha, "2805")) {
            System.out.println("Pagamento efetuado");
            Dinheiro[auxiliar] = 20;
            auxiliar++;


        } else {
            System.out.println("Cartao recusado, senha inválida");
        }

    }

    public static void Try() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                break;
            } else {
                System.out.println("Erro, por favor coloque selecione uma forma valida de pagamento");
                scanner.next();
            }
        }

    }

}
