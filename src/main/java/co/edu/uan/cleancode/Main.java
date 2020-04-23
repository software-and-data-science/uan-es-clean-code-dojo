package co.edu.uan.cleancode;

import java.util.Scanner;


public class Main {

    public static Jugador jugador = new Jugador();

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Muggle");
        usuario.saludarUsuario();

        Scanner leer = new Scanner(System.in);

        PrintUtil.imprimir("\n- ¿Las funciones deben ser pequeñas? S/N");
        String respuestaUsuario = leer.next().toLowerCase();
        if (respuestaUsuario.startsWith("s")) {
            PrintUtil.imprimir("Acertaste! Haz ganado 1 punto. Deben ser aún más pequeñas de lo que piensas.");
            jugador.incrementarPuntaje();
        } else {
            PrintUtil.imprimir("Fallaste. Una función hace una sola cosa.\n" +
                    "Una función responde algo o devuelve algo.\n" +
                    "Y lo hace bien.\n");
        }

        PrintUtil.imprimir("\n- ¿Las líneas de código pueden superar más de 120 caracteres? S/N");
        if (leer.next().toLowerCase().startsWith("n")) {
            PrintUtil.imprimir("Acertaste! Haz ganado 1 punto. No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
            jugador.incrementarPuntaje();
        } else {
            PrintUtil.imprimir("Lo sentimos, vamos con la siguiente! No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
        }

        PrintUtil.imprimir("\n- ¿Se aconseja más de 2 argumentos? S/N");
        if (leer.next().toLowerCase().startsWith("s")) {
            PrintUtil.imprimir("Acertaste! Haz ganado 1 punto en esta pregunta con cáscara. Tienes razón pero ten cuidado, se aconsejan hasta máximo 3 argumentos.");
            jugador.incrementarPuntaje();
        } else {
            PrintUtil.imprimir("Sigue intentando... Se aconseja hasta máximo 3 argumentos!");
        }

        if (jugador.getPuntaje() > 1) {
            PrintUtil.imprimir(String.format("\nFelicidades! Obtuviste %d puntos.\n" +
                    "Harry Potter tiene un regalo para ti.\n" +
                    "Escoge entre arriba(1), abajo(2), izquierda(3) o derecha(4).", jugador.getPuntaje()));
            String direccion = leer.next();
            if (direccion.startsWith("1")) {
                jugador.moverPosicionHaciaArriba();
            } else if (direccion.startsWith("2")) {
                jugador.moverPosicionHaciaAbajo();
            } else if (direccion.startsWith("3")) {
                jugador.moverPosicionHaciaLaIzquierda();
            } else if (direccion.startsWith("4")) {
                jugador.moverPosicionHaciaLaDerecha();
            }
            jugador.imprimirPremio();
        }
    }
}
