package principal;

import java.util.Scanner;

public class Introduccion {
    boolean verificador;
    int dificultad;
    int mapa;
    Mapas managerMapas;

    public Introduccion() {
        this.verificador = false;
        this.dificultad = 0;
        this.mapa = 0;
        this.managerMapas = new Mapas();
    }

    public static void espacios(){
        for (int espacios = 0; espacios < 100; espacios++) {
            System.out.println(" ");
        }
    }

    public int accionJugarSalir(Scanner lector){
        int opcionElegida;
        String opcion;
        opcionElegida = 0;
        opcion = "";
        System.out.println(" ");
        System.out.println("\u001B[31mBienvenido al juego SUDOKU\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37m¿Qué desea realizar?\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[31m.\u001B[37m Jugar\u001B[0m");
        System.out.println("\u001B[31m.\u001B[37m Salir\u001B[0m");
        System.out.println(" ");
        try {
            opcion = lector.nextLine();
        } catch (Exception error){
            espacios();
            System.out.println("¡Error, solo se acpetan caracteres!");
            opcionElegida = 10;
        }
        opcion = opcion.replace(" ", "");
        if (opcionElegida != 10) {
            switch (opcion.toLowerCase()) {
                case "jugar":
                    espacios();
                    opcionElegida = 1;
                    break;
                case "salir":
                    espacios();
                    opcionElegida = 2;
                    break;
                default:
                    espacios();
                    System.out.println("\u001B[31m¡Error, debe ingresar una opción válida!\u001B[0m");
                    opcionElegida = 10;
            }
        }
        return opcionElegida;
    }

    public int dificultad(Scanner lector) {
        String dificultadSinEspacios;
        String dificultadSeleccionada;
        dificultadSeleccionada = "";
        System.out.println("\u001B[37m       Dificultades       \u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[32mFácil\u001B[0m");
        System.out.println("\u001B[0mMedia\u001B[0m");
        System.out.println("\u001B[31mDifícil\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37m¿Con qué dificultad desea jugar?\u001B[0m");
        try {
            dificultadSeleccionada = lector.nextLine();
        } catch (Exception error) {
            espacios();
            System.out.println("\u001B[31m¡Error, solo se permiten palabras!\u001B[0m");
            this.dificultad = 10;
        }
        dificultadSinEspacios = dificultadSeleccionada.replace(" ", "");
        switch (dificultadSinEspacios.toLowerCase()) {
            case "fácil":
                this.dificultad = 1;
                espacios();
                break;
            case "media":
                this.dificultad = 2;
                espacios();
                break;
            case "difícil":
                this.dificultad = 3;
                espacios();
                break;
            default:
                espacios();
                System.out.println("\u001B[31m¡Error, debe ingresar una dificultad válida!\u001B[0m");
                this.dificultad = 10;
        }
        return this.dificultad;
    }

    public int mapa(Scanner lector) {
        String mapaLetra;
        System.out.println("\u001B[37m     Mapas     \u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[33mMapa 1\u001B[0m");
        System.out.println("\u001B[33mMapa 2\u001B[0m");
        System.out.println("\u001B[33mMapa 3\u001B[0m");
        System.out.println("\u001B[33mMapa 4\u001B[0m");
        System.out.println("\u001B[33mMapa 5\u001B[0m");
        System.out.println(" ");
        System.out.println("\u001B[37m¿Qué número de mapa desea jugar?\u001B[0m");
        try {
            mapaLetra = lector.nextLine();
            this.mapa = Integer.parseInt(mapaLetra);
        } catch (Exception error) {
            espacios();
            System.out.println("\u001B[31m¡Error, solo se permiten números enteros!\u001B[0m");
            this.mapa = 10;
        }
        if (this.mapa != 10) {
            switch (this.mapa) {
                case 1:
                    this.mapa = 1;
                    break;
                case 2:
                    this.mapa = 2;
                    break;
                case 3:
                    this.mapa = 3;
                    break;
                case 4:
                    this.mapa = 4;
                    break;
                case 5:
                    this.mapa = 5;
                    break;
                default:
                    espacios();
                    System.out.println("\u001B[31m¡Error, debe ingresar un mapa entre el 1 y el 5!\u001B[0m");
                    this.mapa = 10;
            }
        }
        return this.mapa;
    }

    public String[][] mapaLleno() {
        String[][] mapaCompleto;
        mapaCompleto = new String[10][10];
        if (this.dificultad == 1) {
            switch (this.mapa) {
                case 1:
                    mapaCompleto = this.managerMapas.getMapaUnoFacil();
                    break;
                case 2:
                    mapaCompleto = this.managerMapas.getMapaDosFacil();
                    break;
                case 3:
                    mapaCompleto = this.managerMapas.getMapaTresFacil();
                    break;
                case 4:
                    mapaCompleto = this.managerMapas.getMapaCuatroFacil();
                    break;
                case 5:
                    mapaCompleto = this.managerMapas.getMapaCincoFacil();
                    break;
            }
        }
        if (this.dificultad == 2) {
            switch (this.mapa) {
                case 1:
                    mapaCompleto = this.managerMapas.getMapaUnoMedia();
                    break;
                case 2:
                    mapaCompleto = this.managerMapas.getMapaDosMedia();
                    break;
                case 3:
                    mapaCompleto = this.managerMapas.getMapaTresMedia();
                    break;
                case 4:
                    mapaCompleto = this.managerMapas.getMapaCuatroMedia();
                    break;
                case 5:
                    mapaCompleto = this.managerMapas.getMapaCincoMedia();
                    break;
            }
        }
        if (this.dificultad == 3) {
            switch (this.mapa) {
                case 1:
                    mapaCompleto = this.managerMapas.getMapaUnoDificil();
                    break;
                case 2:
                    mapaCompleto = this.managerMapas.getMapaDosDificil();
                    break;
                case 3:
                    mapaCompleto = this.managerMapas.getMapaTresDificil();
                    break;
                case 4:
                    mapaCompleto = this.managerMapas.getMapaCuatroDificil();
                    break;
                case 5:
                    mapaCompleto = this.managerMapas.getMapaCincoDificil();
                    break;
            }
        }
        return mapaCompleto;
    }

    public String[][] mapaPredeterminado() {
        String[][] mapaPredeterminadoElegido;
        mapaPredeterminadoElegido = new String[10][10];
        if (this.dificultad == 1) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaUnoFacilPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaDosFacilPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaTresFacilPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCuatroFacilPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCincoFacilPredeterminado();
                    break;
            }
        }
        if (this.dificultad == 2) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaUnoMediaPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaDosMediaPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaTresMediaPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCuatroMediaPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCincoMediaPredeterminado();
                    break;
            }
        }
        if (this.dificultad == 3) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaUnoDificilPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaDosDificilPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaTresDificilPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCuatroDificilPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegido = this.managerMapas.getMapaCincoDificilPredeterminado();
                    break;
            }
        }
        return mapaPredeterminadoElegido;
    }

    public String[][] mapaPredeterminadoAuxiliar() {
        Mapas auxiliarMapas;
        String[][] mapaPredeterminadoElegidoAuxiliar;
        auxiliarMapas = new Mapas();
        mapaPredeterminadoElegidoAuxiliar = new String[10][10];
        if (this.dificultad == 1) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaUnoFacilPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaDosFacilPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaTresFacilPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCuatroFacilPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCincoFacilPredeterminado();
                    break;
            }
        }
        if (this.dificultad == 2) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaUnoMediaPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaDosMediaPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaTresMediaPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCuatroMediaPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCincoMediaPredeterminado();
                    break;
            }
        }
        if (this.dificultad == 3) {
            switch (this.mapa) {
                case 1:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaUnoDificilPredeterminado();
                    break;
                case 2:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaDosDificilPredeterminado();
                    break;
                case 3:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaTresDificilPredeterminado();
                    break;
                case 4:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCuatroDificilPredeterminado();
                    break;
                case 5:
                    mapaPredeterminadoElegidoAuxiliar = auxiliarMapas.getMapaCincoDificilPredeterminado();
                    break;
            }
        }
        return mapaPredeterminadoElegidoAuxiliar;
    }
}