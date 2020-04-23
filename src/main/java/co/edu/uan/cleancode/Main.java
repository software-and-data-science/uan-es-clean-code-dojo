package co.edu.uan.cleancode;

import java.util.Scanner;


// En ninguna parte del código
public class Main {

    // Este nombre de variable no es significativo, el nombre de este podría ser jugador
    public static NameGamer nameGamer = new NameGamer();

    public static void main(String[] args) {
        // Utiliza nombres de variables con notación lower camell case
        PrintUtilsFacade ClaseLimpiaCodigo = new PrintUtilsFacade("Muggle");
        ClaseLimpiaCodigo.greet();

        Scanner leer = new Scanner(System.in);

        PrintUtilsFacade.print("\n- ¿Las funciones deben ser pequeñas? S/N");
        // Se pueden extraer los nombres a variables, por ejemplo, String respuesta = leer.next().toLowerCase();
        // evitar la creación de trenes,
        if (leer.next().toLowerCase().startsWith("s")) {
            PrintUtilsFacade.print("Acertaste! Haz ganado 1 punto. Deben ser aún más pequeñas de lo que piensas.");
            nameGamer.increaseScore();
        } else {
            PrintUtilsFacade.print("Fallaste. Una función hace una sola cosa.\n" +
                    "Una función responde algo o devuelve algo.\n" +
                    "Y lo hace bien.\n");
        }

        PrintUtilsFacade.print("\n- ¿Las líneas de código pueden superar más de 120 caracteres? S/N");
        if (leer.next().toLowerCase().startsWith("n")) {
            PrintUtilsFacade.print("Acertaste! Haz ganado 1 punto. No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
            nameGamer.increaseScore();
        } else {
            PrintUtilsFacade.print("Lo sentimos, vamos con la siguiente! No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
        }

        PrintUtilsFacade.print("\n- ¿Se aconseja más de 2 argumentos? S/N");
        if (leer.next().toLowerCase().startsWith("s")) {
            PrintUtilsFacade.print("Acertaste! Haz ganado 1 punto en esta pregunta con cáscara. Tienes razón pero ten cuidado, se aconsejan hasta máximo 3 argumentos.");
            nameGamer.increaseScore();
        } else {
            PrintUtilsFacade.print("Sigue intentando... Se aconseja hasta máximo 3 argumentos!");
        }

        if (nameGamer.getScore() > 1) {
            PrintUtilsFacade.print(String.format("\nFelicidades! Obtuviste %d puntos.\n" +
                    "Harry Potter tiene un regalo para ti.\n" +
                    "Escoge entre arriba(1), abajo(2), izquierda(3) o derecha(4).", nameGamer.getScore()));
            String direccion = leer.next();
            if (direccion.startsWith("1")) {
                nameGamer.moveUp();
            } else if (direccion.startsWith("2")) {
                nameGamer.moveDown();
            } else if (direccion.startsWith("3")) {
                nameGamer.moveLeft();
            } else if (direccion.startsWith("4")) {
                nameGamer.moveRight();
            }
            nameGamer.printAward();
        }
    }
}
