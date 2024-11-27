public class Log {
    public static void Log() {
        Log.Registro(); // CHAMA FUNÇÃO DE REGISTRO DE LOGS
        Desistencia.LogDesistencia(); // CHAMA FUNÇÃO DE DESISTENCIA DOS LOGS
        Erros.MostrarErros(); // CHAMA  A FUNÇÃO DOS ERROS

    }

    public static void Registro() { // PRINTA O REGISTRO DE LOGS
        for (int i = 0; i < Vendas.auxiliar; i++) {
            System.out.println(Vendas.hora_todos[i]+" Utilizando o "+Pagamento.LogDinheiro[i].formaDePagamento);

        }

    }

    public static void Total(){
        int total=0;
        for (int i = 0; i < Pagamento.auxiliar; i++) {
            System.out.println("Um total de "+ Pagamento.Dinheiro[i]+" reais Foi depositado usando o "+Pagamento.LogDinheiro[i].formaDePagamento);
            total=Pagamento.Dinheiro[i]+total;
        }
        System.out.println("O caixa possui um total de "+ total +" Reais");

    }

}
