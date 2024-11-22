import java.text.SimpleDateFormat;
import java.util.Date;

public class Erros {

    static Date dataHoraAtual = new Date();
    static String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    static String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    static String[] log_erros = new String[100];
    static int auxiliar;

    public static void AndarInvalido() {
        log_erros[auxiliar] = ("ERR0035 " + data + " no horário " + hora);
        auxiliar++;
    }

    public static void CadeiraInvalida() {
        log_erros[auxiliar] = ("ERR0005 " + data + " no horário " + hora);
        auxiliar++;
    }

    public static void CadeiraJaComprada() {
        log_erros[auxiliar] = ("ERR0015 " + data + " no horário " + hora);
        auxiliar++;

    }

    public static void CadeiraLivre() {
        log_erros[auxiliar] = ("ERR0025 " + data + " no horário " + hora);
        auxiliar++;
    }

    public static void Inicializacao() {
        Erros.log_erros[Erros.auxiliar] = ("SYS0001 " + data + " no horário " + hora);
        Erros.auxiliar++;
    }

    public static void Encerramento() {
        Erros.log_erros[Erros.auxiliar] = ("SYS0010 " + data + " no horário " + hora);
        Erros.auxiliar++;

    }


    public static void MostrarErros() {
        for (int i = 0; i < auxiliar; i++) {
            System.out.println(log_erros[i]);
        }
    }


}
