package principal;

import java.util.Scanner;

public class Verificador {

    // Managers
    Mapas managerMapas;
    // Variables
    boolean verificador;
    int fila;
    int columna;
    int vidas;
    String coordenadas;
    String numero;

    public Verificador() {
        // Managers
        this.managerMapas = new principal.Mapas();
        // Inicialización de variables
        this.verificador = false;
        this.fila = 0;
        this.columna = 0;
        this.vidas = 7;
        this.coordenadas = "";
        this.numero = "";
    }

    public static void espacios() {
        for (int espacios = 0; espacios < 100; espacios++) {
            System.out.println(" ");
        }
    }

    public boolean verificarPosicion(Scanner lector) {
        this.verificador = false;
        int coordenadasNumero;
        coordenadasNumero = 0;
        System.out.println("\u001B[37mIngrese la posición con la que desea interactuar:\u001B[0m");
        try {
            this.coordenadas = lector.nextLine();
            this.coordenadas = this.coordenadas.replace(" ", "");
            coordenadasNumero = Integer.parseInt(this.coordenadas.substring(1, 2));
        } catch (Exception error) {
            espacios();
            System.out.println("\u001B[31m¡Error, debe ingresar una posición válida (\u001B[37mfila\u001B[31m, \u001B[37mcolumna\u001B[31m)!\u001B[0m");
            System.out.println(" ");
            this.verificador = true;
        }
        if (this.verificador == false) {
            if (this.coordenadas.length() == 2) {
                switch (this.coordenadas.substring(0, 1).toUpperCase()) {
                    case "A":
                        this.fila = 1;
                        break;
                    case "B":
                        this.fila = 2;
                        break;
                    case "C":
                        this.fila = 3;
                        break;
                    case "D":
                        this.fila = 4;
                        break;
                    case "E":
                        this.fila = 5;
                        break;
                    case "F":
                        this.fila = 6;
                        break;
                    case "G":
                        this.fila = 7;
                        break;
                    case "H":
                        this.fila = 8;
                        break;
                    case "I":
                        this.fila = 9;
                        break;
                    default:
                        espacios();
                        System.out.println("\u001B[31m¡Error, debe ingresar una fila válida (\u001B[37mA\u001B[31m-\u001B[37mI\u001B[31m)!\u001B[0m");
                        this.verificador = true;
                }
                if (coordenadasNumero <= 0 && coordenadasNumero >= 10) {
                    espacios();
                    System.out.println("\u001B[31m¡Error, debe ingresar una columna válida (\u001B[37m1\u001B[31m-\u001B[37m9\u001B[31m)!\u001B[0m");
                    this.verificador = true;
                } else {
                    this.columna = coordenadasNumero;
                }
            } else {
                espacios();
                System.out.println("\u001B[31m¡Error, debe ingresar una posición válida (\u001B[37mA1\u001B[31m)!\u001B[0m");
                this.verificador = true;
            }
        }
        return this.verificador;
    }

    public boolean verificarNumero(Scanner lector) {
        int numeroEntero;
        numeroEntero = 0;
        this.verificador = false;
        System.out.println("\u001B[37mIngrese el número que desea agregar:\u001B[0m");
        try {
            this.numero = lector.nextLine();
            numeroEntero = Integer.parseInt(this.numero);
        } catch (Exception error) {
            espacios();
            System.out.println("\u001B[31m¡Error, debe ingresar un número entero!\u001B[0m");
            System.out.println(" ");
            this.verificador = true;
        }
        if (numeroEntero >= 1 && numeroEntero <= 9) {
            espacios();
            this.verificador = false;
        } else {
            espacios();
            System.out.println("\u001B[31m¡Error, solo se permiten números entre el \u001B[37m1\u001B[31m y el \u001B[37m9\u001B[31m!\u001B[0m");
            System.out.println(" ");
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean verificarFila(String[][] mapa) {
        this.verificador = false;
        for (int columna = 0; columna < mapa[0].length; columna++) {
            if (mapa[this.fila][columna] != mapa[this.fila][this.columna]) {
                if (mapa[this.fila][columna].equals("\u001B[0m" + this.numero)) {
                    espacios();
                    System.out.println("\u001B[31m¡Error, ese número ya se repite en la fila!\u001B[0m");
                    System.out.println(" ");
                    this.verificador = true;
                }
                if (mapa[this.fila][columna].equals("\u001B[37m" + this.numero)) {
                    espacios();
                    System.out.println("\u001B[31m¡Error, ese número ya se repite en la fila!\u001B[0m");
                    System.out.println(" ");
                    this.verificador = true;
                }
            }
        }
        return this.verificador;
    }

    public boolean verificarColumna(String[][] mapa) {
        this.verificador = false;
        for (int fila = 0; fila < mapa[0].length; fila++) {
            if (mapa[fila][this.columna] != mapa[this.fila][this.columna]) {
                if (mapa[fila][this.columna].equals("\u001B[0m" + this.numero)) {
                    espacios();
                    System.out.println("\u001B[31m¡Error, ese número ya se repite en la columna!\u001B[0m");
                    System.out.println(" ");
                    this.verificador = true;
                }
                if (mapa[fila][this.columna].equals("\u001B[37m" + this.numero)) {
                    espacios();
                    System.out.println("\u001B[31m¡Error, ese número ya se repite en la columna!\u001B[0m");
                    System.out.println(" ");
                    this.verificador = true;
                }
            }
        }
        return this.verificador;
    }

    public boolean verificarBloque(String[][] mapa) {
        this.verificador = false;
        int filaMin;
        int filaMax;
        int columnaMin;
        int columnaMax;
        filaMin = 0;
        filaMax = 0;
        columnaMin = 0;
        columnaMax = 0;
        if (this.fila >= 1 && this.fila <= 3) {
            filaMin = 1;
            filaMax = 3;
        }
        if (this.fila >= 4 && this.fila <= 6) {
            filaMin = 4;
            filaMax = 6;
        }
        if (this.fila >= 7 && this.fila <= 9) {
            filaMin = 7;
            filaMax = 9;
        }
        if (this.columna >= 1 && this.columna <= 3) {
            columnaMin = 1;
            columnaMax = 3;
        }
        if (this.columna >= 4 && this.columna <= 6) {
            columnaMin = 4;
            columnaMax = 6;
        }
        if (this.columna >= 7 && this.columna <= 9) {
            columnaMin = 7;
            columnaMax = 9;
        }
        for (int fila = filaMin; fila <= filaMax; fila++) {
            for (int columna = columnaMin; columna <= columnaMax; columna++) {
                if (mapa[fila][columna] != mapa[this.fila][this.columna]) {
                    if (mapa[fila][columna].equals("\u001B[0m" + this.numero)) {
                        espacios();
                        System.out.println("\u001B[31m¡Error, ese número ya se encuentra en el bloque!\u001B[0m");
                        System.out.println(" ");
                        this.verificador = true;
                    }
                    if (mapa[fila][columna].equals("\u001B[37m" + this.numero)) {
                        espacios();
                        System.out.println("\u001B[31m¡Error, ese número ya se encuentra en el bloque!\u001B[0m");
                        System.out.println(" ");
                        this.verificador = true;
                    }
                }
            }
        }
        return this.verificador;
    }

    public String[][] impresorMapaUsuario(String[][] mapaPredeterminado) {
        for (int fila = 0; fila < mapaPredeterminado.length; fila++) {
            for (int columna = 0; columna < mapaPredeterminado[0].length; columna++) {
                System.out.print(mapaPredeterminado[fila][columna] + "\u001B[0m | ");
                if (columna == 3) {
                    System.out.print("\u001B[30m | \u001B[0m");
                }
                if (columna == 6) {
                    System.out.print("\u001B[30m | \u001B[0m");
                }
            }
            if (fila == 3) {
                System.out.println("");
                System.out.print("\u001B[30m   -------------------------------------------\u001B[0m");

            }
            if (fila == 6) {
                System.out.println("");
                System.out.print("\u001B[30m   -------------------------------------------\u001B[0m");
            }
            System.out.println(" ");
        }
        return mapaPredeterminado;
    }

    public boolean verificarPredeterminado(String[][] mapaPredeterminado, int fila, int columna) {
        this.verificador = false;
        if (!mapaPredeterminado[fila][columna].equals("\u001B[0m ")) {
            espacios();
            System.out.println("\u001B[31m¡Error, esta posición está ocupada por un número predeterminado!\u001B[0m");
            System.out.println(" ");
            this.verificador = true;
        }
        return this.verificador;
    }

    public boolean verificarUsuarioRendido() {
        this.verificador = false;
        this.coordenadas.replace(" ", "");
        if (this.coordenadas.toLowerCase().equals("salir")) {
            this.verificador = true;
        }
        return this.verificador;
    }
}