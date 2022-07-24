package principal;

import java.util.Scanner;

public class Sudoku {

    public static void espacios() {
        for (int espacios = 0; espacios < 100; espacios++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        // Bloque de Declaraciones
        // Managers
        principal.Presentacion managerPresentacion;
        principal.Introduccion managerIntroduccion;
        Verificador managerVeri;
        // Variables
        Scanner lector;
        boolean finalizar;
        int dificultad;
        int mapaElegido;
        boolean verificadorPredeterminado;
        boolean posicion;
        boolean numero;
        boolean fila;
        boolean columna;
        boolean bloque;
        boolean rendirse;
        int accion;
        String[][] mapa;
        String[][] mapaPredeterminado;
        String[][] auxiliar;
        String[][] mapaLleno;
        // Variables para la presentación
        boolean parteUno;
        boolean parteDos;
        boolean parteTres;
        boolean parteCuatro;
        boolean parteCinco;
        boolean introduccion;
        // Bloque de Instrucciones
        managerPresentacion = new principal.Presentacion();
        managerIntroduccion = new principal.Introduccion();
        managerVeri = new Verificador();
        lector = new Scanner(System.in);
        mapaPredeterminado = new String[10][10];
        auxiliar = new String[10][10];
        mapaLleno = new String[10][10];
        dificultad = 0;
        verificadorPredeterminado = false;
        finalizar = false;
        do {
            accion = managerIntroduccion.accionJugarSalir(lector);
        } while (accion == 10);
        if (accion == 1) {
            espacios();
            do {
                introduccion = managerPresentacion.reglas(lector);
                espacios();
            } while (introduccion == true);
            do {
                parteUno = managerPresentacion.primeraParte(lector);
                espacios();
            } while (parteUno == true);
            do {
                parteDos = managerPresentacion.segundaParte(lector);
                espacios();
            } while (parteDos == true);
            do {
                parteTres = managerPresentacion.terceraParte(lector);
                espacios();
            } while (parteTres == true);
            do {
                parteCuatro = managerPresentacion.cuartaParte(lector);
                espacios();
            } while (parteCuatro == true);
            do {
                dificultad = managerIntroduccion.dificultad(lector);
            } while (dificultad == 10);
            do {
                mapaElegido = managerIntroduccion.mapa(lector);
            } while (mapaElegido == 10);
            // Se agregan los valores al mapa lleno
            mapaLleno = managerIntroduccion.mapaLleno();
            // Mapas con los números predeterminados
            mapaPredeterminado = managerIntroduccion.mapaPredeterminado();
            auxiliar = managerIntroduccion.mapaPredeterminadoAuxiliar();
            espacios();
            do {
                mapa = managerVeri.impresorMapaUsuario(mapaPredeterminado);
                posicion = managerVeri.verificarPosicion(lector);
                rendirse = managerVeri.verificarUsuarioRendido();
                if (posicion == false) {
                    verificadorPredeterminado = managerVeri.verificarPredeterminado(auxiliar, managerVeri.fila, managerVeri.columna);
                    if (verificadorPredeterminado == false) {
                        numero = managerVeri.verificarNumero(lector);
                        if (numero == false) {
                            fila = managerVeri.verificarFila(mapa);
                            if (fila == false) {
                                columna = managerVeri.verificarColumna(mapa);
                                if (columna == false) {
                                    bloque = managerVeri.verificarBloque(mapa);
                                    if (bloque == false) {
                                        mapa[managerVeri.fila][managerVeri.columna] = "\u001B[0m" + managerVeri.numero;
                                    }
                                }
                            }
                        }
                    }
                }
                for (int compFila = 0; compFila < mapaLleno.length; compFila++) {
                    for (int compColumna = 0; compColumna < mapaLleno[0].length; compColumna++) {
                        if (mapa[compFila][compColumna].equals(mapaLleno[compFila][compColumna])) {
                            finalizar = true;
                        } else {
                            finalizar = false;
                            break;
                        }
                    }
                }
                if (finalizar == true) {
                    do {
                        parteCinco = managerPresentacion.quintaParte(lector);
                    } while (parteCinco == true);
                }
                if (rendirse == true) {
                    espacios();
                    finalizar = true;
                }
            } while (finalizar == false);
        }
        System.out.println(" ");
        System.out.println("\u001B[31m¡Has salido del juego correctamente!\u001B[0m");
    }
}

