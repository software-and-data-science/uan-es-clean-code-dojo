package co.edu.uan.cleancode;

import java.util.Scanner;


// En ninguna parte del código
public class Main {

    // Este nombre de variable no es significativo, el nombre de este podría ser jugador
    public static MeLlamoDiferente soyPrivado = new MeLlamoDiferente();

    public static void main(String[] args) {
        // Utiliza nombres de variables con notación lower camell case
        CleanCodeClass ClaseLimpiaCodigo = new CleanCodeClass("Muggle");
        ClaseLimpiaCodigo.saludo();

        Scanner leer = new Scanner(System.in);

        CleanCodeClass.imprime("\n- ¿Las funciones deben ser pequeñas? S/N");
        // Se pueden extraer los nombres a variables, por ejemplo, String respuesta = leer.next().toLowerCase();
        // evitar la creación de trenes,
        if (leer.next().toLowerCase().startsWith("s")) {
            CleanCodeClass.imprime("Acertaste! Haz ganado 1 punto. Deben ser aún más pequeñas de lo que piensas.");
            soyPrivado.masUno();
        } else {
            CleanCodeClass.imprime("Fallaste. Una función hace una sola cosa.\n" +
                    "Una función responde algo o devuelve algo.\n" +
                    "Y lo hace bien.\n");
        }

        CleanCodeClass.imprime("\n- ¿Las líneas de código pueden superar más de 120 caracteres? S/N");
        if (leer.next().toLowerCase().startsWith("n")) {
            CleanCodeClass.imprime("Acertaste! Haz ganado 1 punto. No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
            soyPrivado.masUno();
        } else {
            CleanCodeClass.imprime("Lo sentimos, vamos con la siguiente! No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
        }

        CleanCodeClass.imprime("\n- ¿Se aconseja más de 2 argumentos? S/N");
        if (leer.next().toLowerCase().startsWith("s")) {
            CleanCodeClass.imprime("Acertaste! Haz ganado 1 punto en esta pregunta con cáscara. Tienes razón pero ten cuidado, se aconsejan hasta máximo 3 argumentos.");
            soyPrivado.masUno();
        } else {
            CleanCodeClass.imprime("Sigue intentando... Se aconseja hasta máximo 3 argumentos!");
        }

        if (soyPrivado.getPuntaje() > 1) {
            CleanCodeClass.imprime(String.format("\nFelicidades! Obtuviste %d puntos.\n" +
                    "Harry Potter tiene un regalo para ti.\n" +
                    "Escoge entre arriba(1), abajo(2), izquierda(3) o derecha(4).", soyPrivado.getPuntaje()));
            String direccion = leer.next();
            if (direccion.startsWith("1")) {
                soyPrivado.muevaArriba();
            } else if (direccion.startsWith("2")) {
                soyPrivado.moverAbajo();
            } else if (direccion.startsWith("3")) {
                soyPrivado.muevaIz();
            } else if (direccion.startsWith("4")) {
                soyPrivado.mDer();
            }
            soyPrivado.imprimimame();
        }
    }
}
