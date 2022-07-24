package principal;

import java.util.Scanner;

public class Presentacion {
    String enter;
    boolean verificador;

    public Presentacion(){
        this.enter = "";
        this.verificador = false;
    }

    public boolean reglas(Scanner lector){
        System.out.println("\u001B[31mINTRODUCCIÓN\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31m.\u001B[37m Se juega en una cuadrícula de 9 x 9 espacios\u001B[0m");
        System.out.println("\u001B[31m.\u001B[37m Dentro de las filas y columnas hay 9 \"bloques\" (compuestos de 3 x 3 espacios)\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31mREGLAS\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31m.\u001B[37m Cada fila, columna y bloque (9 espacios cada uno) debe completarse\u001B[0m");
        System.out.println(" \u001B[37m con los números del 1 al 9, sin repetir ningún número dentro de la\u001B[0m");
        System.out.println(" \u001B[37m fila, columna o bloque.\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31mINDICACIONES\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31m.\u001B[37m Para salir del juego, debes escribir \"salir\" cuando el juego te pida la posición\u001B[0m");
        System.out.println("\u001B[31m.\u001B[37m Una vez rellenada completamente la tabla de Sudoku, se acabará el juego\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean primeraParte(Scanner lector){
        this.verificador = false;
        System.out.println("          \u001B[41m               \u001B[0m                                                                                                                    ");
        System.out.println("        \u001B[41m                    \u001B[0m                                                                                                                 ");
        System.out.println("        \u001B[40m      \u001B[43m    \u001B[40m  \u001B[43m  \u001B[0m                                                                                         ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m  \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                                 ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m    \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                               ");
        System.out.println("      \u001B[40m    \u001B[43m        \u001B[40m        \u001B[0m                                           ¡JUGADOR! Más bien has aparecido,                   ");
        System.out.println("          \u001B[43m              \u001B[0m                                     necesitamos de tu ayuda para resolver un Sudoku                                 ");
        System.out.println("        \u001B[41m    \u001B[44m  \u001B[41m      \u001B[0m                                                                                                     ");
        System.out.println("      \u001B[41m      \u001B[44m  \u001B[31m    \u001B[44m  \u001B[41m      \u001B[0m                                                                           ");
        System.out.println("    \u001B[41m        \u001B[44m        \u001B[41m        \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[41m  \u001B[44m  \u001B[47m  \u001B[44m    \u001B[47m  \u001B[44m  \u001B[41m  \u001B[43m    \u001B[0m                                 ");
        System.out.println("    \u001B[43m      \u001B[44m            \u001B[43m      \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[44m                \u001B[43m    \u001B[0m                                                                                             ");
        System.out.println("        \u001B[44m      \u001B[0m    \u001B[44m      \u001B[0m                                                                                                  ");
        System.out.println("      \u001B[40m      \u001B[0m        \u001B[40m      \u001B[0m                                                                                                ");
        System.out.println("    \u001B[40m        \u001B[0m          \u001B[40m        \u001B[0m                                                                                            ");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean segundaParte(Scanner lector){
        this.verificador = false;
        System.out.println("          \u001B[41m               \u001B[0m                                                                                                                    ");
        System.out.println("        \u001B[41m                    \u001B[0m                                                                                                                 ");
        System.out.println("        \u001B[40m      \u001B[43m    \u001B[40m  \u001B[43m  \u001B[0m                                                                                         ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m  \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                                 ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m    \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                               ");
        System.out.println("      \u001B[40m    \u001B[43m        \u001B[40m        \u001B[0m                                                 Ha sido muy complicado para mi,                         ");
        System.out.println("          \u001B[43m              \u001B[0m                                        he estado mucho tiempo intentándolo pero no encuentro la                                ");
        System.out.println("        \u001B[41m    \u001B[44m  \u001B[41m      \u001B[0m                                                   combinación correcta de los números...        ");
        System.out.println("      \u001B[41m      \u001B[44m  \u001B[31m    \u001B[44m  \u001B[41m      \u001B[0m                                                                           ");
        System.out.println("    \u001B[41m        \u001B[44m        \u001B[41m        \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[41m  \u001B[44m  \u001B[47m  \u001B[44m    \u001B[47m  \u001B[44m  \u001B[41m  \u001B[43m    \u001B[0m                                 ");
        System.out.println("    \u001B[43m      \u001B[44m            \u001B[43m      \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[44m                \u001B[43m    \u001B[0m                                                                                             ");
        System.out.println("        \u001B[44m      \u001B[0m    \u001B[44m      \u001B[0m                                                                                                  ");
        System.out.println("      \u001B[40m      \u001B[0m        \u001B[40m      \u001B[0m                                                                                                ");
        System.out.println("    \u001B[40m        \u001B[0m          \u001B[40m        \u001B[0m                                                                                            ");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean terceraParte(Scanner lector){
        this.verificador = false;
        System.out.println("          \u001B[41m               \u001B[0m                                                                                                                    ");
        System.out.println("        \u001B[41m                    \u001B[0m                                                                                                                 ");
        System.out.println("        \u001B[40m      \u001B[43m    \u001B[40m  \u001B[43m  \u001B[0m                                                                                         ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m  \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                                 ");
        System.out.println("      \u001B[40m  \u001B[43m  \u001B[40m    \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m                                                               ");
        System.out.println("      \u001B[40m    \u001B[43m        \u001B[40m        \u001B[0m                                     Así que te dejaré este desafío a tí, volveré cuando                   ");
        System.out.println("          \u001B[43m              \u001B[0m                                                  encuentres la solución...                                 ");
        System.out.println("        \u001B[41m    \u001B[44m  \u001B[41m      \u001B[0m                                                                                                     ");
        System.out.println("      \u001B[41m      \u001B[44m  \u001B[31m    \u001B[44m  \u001B[41m      \u001B[0m                                                                           ");
        System.out.println("    \u001B[41m        \u001B[44m        \u001B[41m        \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[41m  \u001B[44m  \u001B[47m  \u001B[44m    \u001B[47m  \u001B[44m  \u001B[41m  \u001B[43m    \u001B[0m                                 ");
        System.out.println("    \u001B[43m      \u001B[44m            \u001B[43m      \u001B[0m                                                                                             ");
        System.out.println("    \u001B[43m    \u001B[44m                \u001B[43m    \u001B[0m                                                                                             ");
        System.out.println("        \u001B[44m      \u001B[0m    \u001B[44m      \u001B[0m                                                                                                  ");
        System.out.println("      \u001B[40m      \u001B[0m        \u001B[40m      \u001B[0m                                                                                                ");
        System.out.println("    \u001B[40m        \u001B[0m          \u001B[40m        \u001B[0m                                                                                            ");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean cuartaParte(Scanner lector){
        this.verificador = false;
        System.out.println("            \u001B[41m          \u001B[0m    \u001B[43m      \u001B[0m");
        System.out.println("          \u001B[41m                  \u001B[43m    \u001B[0m");
        System.out.println("          \u001B[40m      \u001B[43m    \u001B[40m  \u001B[43m  \u001B[0m  \u001B[41m      \u001B[0m");
        System.out.println("        \u001B[40m  \u001B[43m  \u001B[40m  \u001B[43m      \u001B[40m  \u001B[43m      \u001B[41m    \u001B[0m");
        System.out.println("        \u001B[40m  \u001B[43m  \u001B[40m    \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m");
        System.out.println("        \u001B[40m    \u001B[43m        \u001B[40m        \u001B[41m  \u001B[0m                          ¡Éxitos!");
        System.out.println("            \u001B[43m              \u001B[41m    \u001B[0m");
        System.out.println("  \u001B[43m    \u001B[41m        \u001B[44m  \u001B[41m      \u001B[44m  \u001B[41m    \u001B[0m");
        System.out.println("  \u001B[43m    \u001B[41m          \u001B[44m  \u001B[41m      \u001B[44m  \u001B[41m  \u001B[0m");
        System.out.println("  \u001B[43m      \u001B[41m        \u001B[44m        \u001B[47m  \u001B[0m      \u001B[40m  \u001B[0m");
        System.out.println("    \u001B[43m  \u001B[0m    \u001B[44m  \u001B[41m  \u001B[44m    \u001B[47m  \u001B[44m          \u001B[40m    \u001B[0m");
        System.out.println("      \u001B[40m      \u001B[44m                  \u001B[40m    \u001B[0m");
        System.out.println("    \u001B[40m      \u001B[44m                    \u001B[40m    \u001B[0m");
        System.out.println("    \u001B[40m    \u001B[44m              \u001B[0m");
        System.out.println("    \u001B[40m    \u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean quintaParte(Scanner lector){
        this.verificador = false;
        System.out.println("            \u001B[41m          \u001B[0m    \u001B[43m      \u001B[0m");
        System.out.println("          \u001B[41m                  \u001B[43m    \u001B[0m");
        System.out.println("          \u001B[40m      \u001B[43m    \u001B[40m  \u001B[43m  \u001B[0m  \u001B[41m      \u001B[0m");
        System.out.println("        \u001B[40m  \u001B[43m  \u001B[40m  \u001B[43m      \u001B[40m  \u001B[43m      \u001B[41m    \u001B[0m");
        System.out.println("        \u001B[40m  \u001B[43m  \u001B[40m    \u001B[43m      \u001B[40m  \u001B[43m      \u001B[0m");
        System.out.println("        \u001B[40m    \u001B[43m        \u001B[40m        \u001B[41m  \u001B[0m                          ¡Lo has logrado, en ningún momento he dudado de ti!");
        System.out.println("            \u001B[43m              \u001B[41m    \u001B[0m                                            ¡FELICIDADES!");
        System.out.println("  \u001B[43m    \u001B[41m        \u001B[44m  \u001B[41m      \u001B[44m  \u001B[41m    \u001B[0m");
        System.out.println("  \u001B[43m    \u001B[41m          \u001B[44m  \u001B[41m      \u001B[44m  \u001B[41m  \u001B[0m");
        System.out.println("  \u001B[43m      \u001B[41m        \u001B[44m        \u001B[47m  \u001B[0m      \u001B[40m  \u001B[0m");
        System.out.println("    \u001B[43m  \u001B[0m    \u001B[44m  \u001B[41m  \u001B[44m    \u001B[47m  \u001B[44m          \u001B[40m    \u001B[0m");
        System.out.println("      \u001B[40m      \u001B[44m                  \u001B[40m    \u001B[0m");
        System.out.println("    \u001B[40m      \u001B[44m                    \u001B[40m    \u001B[0m");
        System.out.println("    \u001B[40m    \u001B[44m              \u001B[0m");
        System.out.println("    \u001B[40m    \u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37mPresione ENTER para continuar\u001B[0m");
        try {
            this.enter = lector.nextLine();
        } catch (Exception error){
            this.verificador = true;
        }
        return this.verificador;
    }
}
