package co.edu.uan.cleancode;

// Esta clase tiene un nombre poco descriptivo,
// se trata de una clase que representa el estado de un juego
// Podría ser un nombre como Jugador
// Los nombres de las clases deben ser sustantivos
public class Player {

	private final String name;
	
    // puntaje podría ser privado, los atributos privados van arriba de los públicos
    private int score;

    // posición podría ser privado, los atributos privados van arriba de los públicos
    private Position awarePosition;

    // El nombre del constructor y la clase deben ser más descriptivos
    public Player(String name) {
    	this.name = name;
        score = 0;
        awarePosition = Position.RIGHT;
    }
    
    public String getName() {
		return name;
	}

    // Los nombres de los métodos deben ser verbos, ej: moverArriba
    public void moveUp() {
        this.awarePosition = Position.UP;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverAbajo
    // no deben tener el nombre función, genera ruido innecesario
    public void moveDown() {
        this.awarePosition = Position.DOWN;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverIzquierda
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void moveLeft() {
        this.awarePosition = Position.LEFT;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverDerecha
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void moveRight() {
        this.awarePosition = Position.RIGHT;
    }

    // Los métodos deben ser nombrados con verbos
    // por ejemplo, imprimirPremio
    public void printAware() {
        String left = "";
        String rigth = "";
        int top = 0;
        int bottom = 0;
        String initEndLine = "======================================\r\n";
        String separator = "|                                    |\r\n";
        char scapeChar = 27;
        String startsBlueColor = scapeChar + "[94m";
        String endsColor = scapeChar + "[0m";
        String startsGreenColor = scapeChar + "[32m";
        switch (awarePosition) {
            case UP:
                left = "|        " + startsBlueColor;
                rigth = endsColor + "        |\r\n";
                top = 0;
                bottom = 5;
                break;
            case DOWN:
                left = "|        " + startsBlueColor;
                rigth = endsColor + "        |\r\n";
                top = 5;
                bottom = 0;
                break;
            case LEFT:
                left = "|" + startsBlueColor;
                rigth = endsColor + "                |\r\n";
                top = 2;
                bottom = 2;
                break;
            case RIGHT:
                left = "|                " + startsBlueColor;
                rigth = endsColor + "|\r\n";
                top = 2;
                bottom = 2;
                break;
        }
        // Los nombres de las variables deben evitar el uso de su tipo de dato, para el caso de String
        // se debe eliminar las palabras cadena, String, un nombre para esto sería textoPremio
        String awareText = "";
        awareText += initEndLine;
        for (int i = 0; i < top; i++) {
            awareText += separator;
        }
        awareText += left + ",                  ," + rigth;
        awareText += left + "'\"\\_            ,/\"," + rigth;
        awareText += left + " \\.'\\_        ,/ ,/ " + rigth;
        awareText += left + "   \\.'\\_    ,/ ,/   " + rigth;
        awareText += left + "     \\.'\\__/ ,/     " + rigth;
        awareText += left + "       \\{00}/       " + rigth;
        awareText += left + "        \\  /        " + rigth;
        awareText += left + "      +==\"\"==+      " + rigth;
        for (int i = 0; i < bottom; i++) {
            awareText += separator;
        }
        awareText += initEndLine;
        awareText += "✊     FELICIDADES \uD83C\uDD71\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD76\uD83C\uDD74\uD83C\uDD81    \uD83D\uDE0D\r\n";
        awareText += startsGreenColor + "✅      \uD83D\uDCBB \uD83C\uDD72\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD70\uD83C\uDD7D \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD73\uD83C\uDD74\uD83C\uDD81 \uD83D\uDCBB     ✅\r\n" + endsColor;
        PrintUtilities.printText(awareText);
    }

    // Los métodos deben ser nombrados con verbos
    public void incrementScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

}
