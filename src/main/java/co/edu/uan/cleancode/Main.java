package co.edu.uan.cleancode;

import java.util.Scanner;

public class Main {
    public static Jugador soyPrivado = new Jugador();

    public static void main(String[] args) {
        // Utiliza nombres de variables con notación lower camell case
        UtilidadesSesion ClaseLimpiaCodigo = new UtilidadesSesion("Muggle");
        ClaseLimpiaCodigo.saludo();

        Scanner leer = new Scanner(System.in);

        UtilidadesSesion.imprimir("\n- ¿Las funciones deben ser pequeñas? S/N");
        if (leer.next().toLowerCase().startsWith("s")) {
            UtilidadesSesion.imprimir("Acertaste! Haz ganado 1 punto. Deben ser aún más pequeñas de lo que piensas.");
            soyPrivado.agregarPuntaje();
        } else {
            UtilidadesSesion.imprimir("Fallaste. Una función hace una sola cosa.\n" +
                    "Una función responde algo o devuelve algo.\n" +
                    "Y lo hace bien.\n");
        }

        UtilidadesSesion.imprimir("\n- ¿Las líneas de código pueden superar más de 120 caracteres? S/N");
        if (leer.next().toLowerCase().startsWith("n")) {
            UtilidadesSesion.imprimir("Acertaste! Haz ganado 1 punto. No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
            soyPrivado.agregarPuntaje();
        } else {
            UtilidadesSesion.imprimir("Lo sentimos, vamos con la siguiente! No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
        }

        UtilidadesSesion.imprimir("\n- ¿Se aconseja más de 2 argumentos? S/N");
        if (leer.next().toLowerCase().startsWith("s")) {
            UtilidadesSesion.imprimir("Acertaste! Haz ganado 1 punto en esta pregunta con cáscara. Tienes razón pero ten cuidado, se aconsejan hasta máximo 3 argumentos.");
            soyPrivado.agregarPuntaje();
        } else {
            UtilidadesSesion.imprimir("Sigue intentando... Se aconseja hasta máximo 3 argumentos!");
        }

        if (soyPrivado.obtenerPuntaje() > 1) {
            UtilidadesSesion.imprimir(String.format("\nFelicidades! Obtuviste %d puntos.\n" +
                    "Harry Potter tiene un regalo para ti.\n" +
                    "Escoge entre arriba(1), abajo(2), izquierda(3) o derecha(4).", soyPrivado.obtenerPuntaje()));
            String direccion = leer.next();
            if (direccion.startsWith("1")) {
                soyPrivado.moverArriba();
            } else if (direccion.startsWith("2")) {
                soyPrivado.moverAbajo();
            } else if (direccion.startsWith("3")) {
                soyPrivado.moverIzquierda();
            } else if (direccion.startsWith("4")) {
                soyPrivado.moverDerecha();
            }
            soyPrivado.imprimirResultados();
        }
    }
}
