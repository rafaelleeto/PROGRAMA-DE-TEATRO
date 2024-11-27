public class Ingresso {
    String formaDePagamento;
    int cadeira;
    int andar;


    public Ingresso(int compra, int andar, String formaDePagamento) {
        this.cadeira=compra;
        this.andar=andar;
        this.formaDePagamento=formaDePagamento;

    }
}
