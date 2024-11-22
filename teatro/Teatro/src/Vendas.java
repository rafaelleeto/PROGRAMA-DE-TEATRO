import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vendas {
    static Date dataHoraAtual = new Date();
    static String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    static String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);


    static String[] hora_todos = new String[100];

    static int auxiliar = 0;

    public static void venda_andares(int andar) {

        int contador = 0;
        int andarusuario[][];
        int compra;
        Scanner scanner = new Scanner(System.in);
        compra = scanner.nextInt(); // Entrada de dados da cadeira que o usuario deseja


        if (andar == 1) { // Vetor do andar recebe o numero do andar
            andarusuario = Andares.PrimeiroAndar;
        } else if (andar == 2) {
            andarusuario = Andares.SegundoAndar;
        } else if (andar == 3) {
            andarusuario = Andares.TerceiroAndar;
        } else {
            System.out.println("Andar inválido"); // se não for nenhum deles da erro
            hora_todos[auxiliar] = ("ERR0035 na data " + data + " no horário " + hora); // Chama função de registrar o erro
            auxiliar++;
            return;
        }

        for (int i = 0; i < andarusuario.length; i++) {     //  percorre a matriz até o tamanho da matriz do andar
            for (int j = 0; j < andarusuario[i].length; j++) {
                contador++;
                if (contador == compra) { // verifica se a posição do vetor é igual a cadeira que o usuario deseja

                    if (andarusuario[i][j] == compra) { // Verifica o valor na posição [I] [J] se é igual ao da cadeira do usuario
                        andarusuario[i][j] = 0;   // posição recebe ZERO, ou seja uma cadeira já vazia
                        Vendas.hora_todos[auxiliar] = "a cadeira numero " + compra + " do andar " + andar + " foi vendida no dia " + data + "no horario " + hora;
                        auxiliar++;
                        return;

                    } else if (compra != andarusuario[i][j]) { // Verifica se a cadeira está disponível na matriz
                        System.out.println("Cadeira ja foi comprada.");
                        Erros.CadeiraJaComprada(); // Chama função de registrar o erro
                        return;

                    }

                }

            }

        }
        Erros.CadeiraInvalida(); // Chama função de registrar o erro
        System.out.println("CADEIRA INVÁLIDA"); // Se não for nenhuma das alternativas acima, dará erro.

    }

    public static void Vendas() {

        int opcao = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem vindo ao MENU de vendas"); // MENU DE ANDARES
            System.out.println("1- Selecione o primeiro   para comprar");
            System.out.println("2- Selecione o segundo   para comprar");
            System.out.println("3- Selecione o terceiro   para comprar");
            System.out.println("0- Voltar");

            opcao = scanner.nextInt(); // ENTRADA DO ANDAR


            if (opcao >= 1 && opcao <= 3) {
                Andares.MostrarAndar(opcao);
                venda_andares(opcao);
            } else if (opcao != 0) {
                System.out.println("Andar inválido");
                Erros.AndarInvalido();
            }

        } while (opcao != 0);


    }
}
