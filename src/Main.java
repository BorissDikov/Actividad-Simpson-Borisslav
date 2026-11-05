import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;

    private static char[][] tablero;
    public static void main(String[] args) {
        // 1ª)Inicializo mi tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        for (int i = 0; i <MAX_FILA_TABLERO ; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 'L';
            }
            
        }


        Random aleatorio = new Random();
        int FilAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        int ColumAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        tablero[FilAleatorio][ColumAleatorio] = 'B';




        int FilAleatorioH = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        int ColumAleatorioH = aleatorio.nextInt(MAX_FILA_TABLERO);

        for (int i = 0; i < 10; i++) {

            do {
                FilAleatorioH = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
                ColumAleatorioH = aleatorio.nextInt(MAX_FILA_TABLERO);
            }while (tablero[FilAleatorioH][ColumAleatorioH] !='L');


            tablero[FilAleatorioH][ColumAleatorioH] = 'H';

        }

        int FilaAleatM = aleatorio.nextInt(MAX_FILA_TABLERO);
        int ColaumAleatM = aleatorio.nextInt(MAX_FILA_TABLERO);

        for (int i = 0; i < 10 ; i++) {

            do {
                FilaAleatM = aleatorio.nextInt(MAX_FILA_TABLERO);
                ColaumAleatM = aleatorio.nextInt(MAX_FILA_TABLERO);

            }while (tablero[FilaAleatM][ColaumAleatM] !='L');

            tablero[FilaAleatM][ColaumAleatM] = 'M';

        }

        tablero[MAX_FILA_TABLERO - 1][MAX_COLUMNA_TABLERO  - 1] = 'F';
        ImrpimirTablero();





    }
    private static void ImrpimirTablero(){
        for (int i = 0; i <MAX_FILA_TABLERO ; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();

        }
    }
}