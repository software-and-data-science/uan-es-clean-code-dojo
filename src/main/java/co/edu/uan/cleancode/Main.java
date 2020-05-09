package co.edu.uan.cleancode;

import java.util.Scanner;

// En ninguna parte del código
public class Main {

	// Este nombre de variable no es significativo, el nombre de este podría ser
	// jugador

	public static void main(String[] args) {
		Player player = new Player("Muggle");
		PrintUtilities.greetUser(player.getName());

		// Add try resource to close
		try (Scanner userInput = new Scanner(System.in)) {

			PrintUtilities.printText("\n- ¿Las funciones deben ser pequeñas? S/N");
			// Se pueden extraer los nombres a variables, por ejemplo, String respuesta =
			// leer.next().toLowerCase();
			// evitar la creación de trenes,
			String response = userInput.next().toLowerCase();
			if (response.startsWith("s")) {
				PrintUtilities
						.printText("Acertaste! Haz ganado 1 punto. Deben ser aún más pequeñas de lo que piensas.");
				player.incrementScore();
			} else {
				PrintUtilities.printText("Fallaste. Una función hace una sola cosa.\n"
						+ "Una función responde algo o devuelve algo.\n" + "Y lo hace bien.\n");
			}

			PrintUtilities.printText("\n- ¿Las líneas de código pueden superar más de 120 caracteres? S/N");
			response = userInput.next().toLowerCase();
			if (response.startsWith("n")) {
				PrintUtilities.printText(
						"Acertaste! Haz ganado 1 punto. No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
				player.incrementScore();
			} else {
				PrintUtilities.printText(
						"Lo sentimos, vamos con la siguiente! No se aconseja que las líneas ocupen más del tamaño de una pantalla.");
			}

			PrintUtilities.printText("\n- ¿Se aconseja más de 2 argumentos? S/N");
			response = userInput.next().toLowerCase();
			if (response.startsWith("s")) {
				PrintUtilities.printText(
						"Acertaste! Haz ganado 1 punto en esta pregunta con cáscara. Tienes razón pero ten cuidado, se aconsejan hasta máximo 3 argumentos.");
				player.incrementScore();
			} else {
				PrintUtilities.printText("Sigue intentando... Se aconseja hasta máximo 3 argumentos!");
			}

			if (player.getScore() > 1) {
				PrintUtilities
						.printText(String.format(
								"\nFelicidades! Obtuviste %d puntos.\n" + "Harry Potter tiene un regalo para ti.\n"
										+ "Escoge entre arriba(1), abajo(2), izquierda(3) o derecha(4).",
								player.getScore()));
				String direccion = userInput.next();
				if (direccion.startsWith("1")) {
					player.moveUp();
				} else if (direccion.startsWith("2")) {
					player.moveDown();
				} else if (direccion.startsWith("3")) {
					player.moveLeft();
				} else if (direccion.startsWith("4")) {
					player.moveRight();
				}
				player.printAware();
			}
		}
	}
}
