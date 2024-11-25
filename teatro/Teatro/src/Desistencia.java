import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Desistencia {
    public static int auxiliar = 0;
    static String[] desistir = new String[100];
    static Date dataHoraAtual = new Date();
    static String data_desistencia = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    static String hora_desistencia = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    public static int opcao = 0;

    public static void LogDesistencia() { // PRINTA o LOG de desistencia
        for (int i = 0; i < auxiliar; i++) {
            System.out.println(desistir[i]);

        }
    }

    public static void Desistencia() {

        do {

            System.out.println("1- Primeiro andar");    // MENU da desistencia
            System.out.println("2- Segundo andar");
            System.out.println("3- Terceiro andar");
            System.out.println("0- Voltar");

            Try();             // CHAMA FUNÇÃO DE VERIFICAR SE É UM INTEIRO UM UMA STRING

            if (opcao == 1) {
                Desistir(opcao);
            } else if (opcao == 2) {
                Desistir(opcao);

            } else if (opcao == 3) {
                Desistir(opcao);

            } else {
                System.out.println("ERRO O ANDAR ESTÁ INVALIDO"); // SE NÃO FOR NENHUMA DAS OPÇÕES ACIMA ELE DÁ ERRO!
                Erros.AndarInvalido();
                return;
            }


        } while (opcao != 0);
    }

    public static void Desistir(int reembolso) {
        int andarusuario[][];
        int contador = 0;


        if (reembolso == 1) {
            andarusuario = Andares.PrimeiroAndar;
        } else if (reembolso == 2) {
            andarusuario = Andares.SegundoAndar;
        } else if (reembolso == 3) {
            andarusuario = Andares.TerceiroAndar;
        } else {
            System.out.println("Erro ANDAR INVALIDO");
            Erros.AndarInvalido();
            return;
        }

        System.out.println("Selecione a cadeira que você deseja reembolsar");

        Try();          // CHAMA FUNÇÃO DE VERIFICAR SE É UM INTEIRO UM UMA STRING

        for (int i = 0; i < andarusuario.length; i++) {
            for (int j = 0; j < andarusuario[i].length; j++) {  // LAÇO DE REPETIÇÃO PARA PERCORRER O VETOR
                contador++;
                if (contador == opcao) { // VERIFICA SE EXISTE A CADEIRA

                    if (andarusuario[i][j] == 0) { //  SE A CADEIRA ESTIVER VAZIA, DEIXA O USUARIO EFETUAR O REEMBOLSO
                        andarusuario[i][j] = opcao; // DEVOLVE A CADEIRA QUE O USUARIO REEMBOLSOU PARA A POSIÇÃO NA MATRIZ
                        desistir[auxiliar] = "a cadeira numero " + opcao + " do andar " + reembolso + " foi reembolsada no dia " + data_desistencia + "no horario " + hora_desistencia;
                        auxiliar++;
                        System.out.println("Cadeira reembolsada com sucesso");
                        return;

                    } else { // SE A CADEIRA NÃO ESTIVER LIVRE, ELE ENTRARÁ NESSA LINHA DE CÓDIGO
                        System.out.println("Voce esta tentando reembolsar de uma cadeira livre");
                        Erros.CadeiraLivre(); //
                    }

                }


            }

        }
    }

    public static void Try() {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }

    }
}
