public class Log {
    public static void Log() {
        Log.Registro(); // CHAMA FUNÇÃO DE REGISTRO DE LOGS
        Desistencia.LogDesistencia(); // CHAMA FUNÇÃO DE DESISTENCIA DOS LOGS
        Erros.MostrarErros(); // CHAMA  A FUNÇÃO DOS ERROS

    }

    public static void Registro() { // PRINTA O REGISTRO DE LOGS
        for (int i = 0; i < Vendas.auxiliar; i++) {
            System.out.println(Vendas.hora_todos[i]);

        }

    }

    public static void Total(){
        for (int i = 0; i < Pagamento.auxiliar; i++) {
            System.out.println("Um total de "+ Pagamento.Dinheiro[i]+" Foi feito usando o "+Pagamento.LogDinheiro[i]);

        }

    }

}
