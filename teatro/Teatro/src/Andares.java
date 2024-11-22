public class Andares {

    static int[][] PrimeiroAndar = new int[50][30];
    static int[][] SegundoAndar = new int[20][30];
    static int[][] TerceiroAndar = new int[10][15];

    public static void Andares() {

        MostrarAndar(1);  // MOSTRA os andares
        MostrarAndar(2);
        MostrarAndar(3);
    }


    public static void MostrarAndar(int numeroAndar) { // FUNÇÃO PARA MOSTRAR OS ANDARES!
        int andar[][];

        if (numeroAndar == 1) {
            andar = Andares.PrimeiroAndar;
        } else if (numeroAndar == 2) {
            andar = Andares.SegundoAndar;
        } else if (numeroAndar == 3) {
            andar = Andares.TerceiroAndar;
        } else {
            return;

        }

        for (int i = 0; i < andar.length; i++) {
            for (int j = 0; j < andar[i].length; j++) {

                System.out.print(andar[i][j]);
                System.out.print("\t");
                if (andar[i][j] < 1000) {
                    System.out.print("\t");
                }


            }
            System.out.print("\t");
            System.out.println("");

        }

    }

    public static void PrimeiroAndar() { // INICIALIZA O PRIMEIRO ANDAR
        int contador = 0;
        for (int i = 0; i < PrimeiroAndar.length; i++) {
            for (int j = 0; j < PrimeiroAndar[i].length; j++) {

                contador++;
                PrimeiroAndar[i][j] = contador;

            }

        }

    }

    public static void SegundoAndar() { // INICIALIZA O SEGUNDO ANDAR
        int contador = 0;
        for (int i = 0; i < SegundoAndar.length; i++) {
            for (int j = 0; j < SegundoAndar[i].length; j++) {

                contador++;
                SegundoAndar[i][j] = contador;

            }

        }

    }

    public static void TerceiroAndar() { // INICIALIZA O TERCEIRO ANDAR
        int contador = 0;

        for (int i = 0; i < TerceiroAndar.length; i++) {
            for (int j = 0; j < TerceiroAndar[i].length; j++) {

                contador++;

                TerceiroAndar[i][j] = contador;

            }

        }

    }


}
