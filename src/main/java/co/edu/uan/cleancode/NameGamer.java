package co.edu.uan.cleancode;

// Los enum podrían estar en otro archivo


// Esta clase tiene un nombre poco descriptivo,
// se trata de una clase que representa el estado de un juego
// Podría ser un nombre como Jugador
// Los nombres de las clases deben ser sustantivos
public class NameGamer {

    // puntaje podría ser privado, los atributos privados van arriba de los públicos
    private int puntaje;

    // posición podría ser privado, los atributos privados van arriba de los públicos
    private Posicion positionAward;

    // El nombre del constructor y la clase deben ser más descriptivos
    public NameGamer() {
        puntaje = 0;
        positionAward = Posicion.DERECHA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverArriba
    public void moveUp() {
        this.positionAward = Posicion.ARRIBA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverAbajo
    // no deben tener el nombre función, genera ruido innecesario
    public void moveDown() {
        this.positionAward = Posicion.ABAJO;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverIzquierda
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void     moveLeft() {
        this.positionAward = Posicion.IZQUIERDA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverDerecha
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void moveRight() {
        this.positionAward = Posicion.DERECHA;
    }

    // Los métodos deben ser nombrados con verbos
    // por ejemplo, imprimirPremio
    public void  printAward() {
        String left = "";
        String rigth = "";
        int top = 0;
        int bottom = 0;
        String  startEnd = "======================================\r\n";
        String separador = "|                                    |\r\n";
        char scapeChar = 27;
        String startsBlueColor = scapeChar + "[94m";
        String endsColor = scapeChar + "[0m";
        String startsGreenColor = scapeChar + "[32m";
        switch (positionAward) {
            case ARRIBA:
                left = "|        " + startsBlueColor;
                rigth = endsColor + "        |\r\n";
                top = 0;
                bottom = 5;
                break;
            case ABAJO:
                left = "|        " + startsBlueColor;
                rigth = endsColor + "        |\r\n";
                top = 5;
                bottom = 0;
                break;
            case IZQUIERDA:
                left = "|" + startsBlueColor;
                rigth = endsColor + "                |\r\n";
                top = 2;
                bottom = 2;
                break;
            case DERECHA:
                left = "|                " + startsBlueColor;
                rigth = endsColor + "|\r\n";
                top = 2;
                bottom = 2;
                break;
        }
        // Los nombres de las variables deben evitar el uso de su tipo de dato, para el caso de String
        // se debe eliminar las palabras cadena, String, un nombre para esto sería textoPremio
        String  awardText = "";
        awardText += startEnd;
        for (int i = 0; i < top; i++) {
            awardText += separador;
        }
        awardText += left + ",                  ," + rigth;
        awardText += left + "'\"\\_            ,/\"," + rigth;
        awardText += left + " \\.'\\_        ,/ ,/ " + rigth;
        awardText += left + "   \\.'\\_    ,/ ,/   " + rigth;
        awardText += left + "     \\.'\\__/ ,/     " + rigth;
        awardText += left + "       \\{00}/       " + rigth;
        awardText += left + "        \\  /        " + rigth;
        awardText += left + "      +==\"\"==+      " + rigth;
        for (int i = 0; i < bottom; i++) {
            awardText += separador;
        }
        awardText += startEnd;
        awardText += "✊     FELICIDADES \uD83C\uDD71\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD76\uD83C\uDD74\uD83C\uDD81    \uD83D\uDE0D\r\n";
        awardText += startsGreenColor + "✅      \uD83D\uDCBB \uD83C\uDD72\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD70\uD83C\uDD7D \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD73\uD83C\uDD74\uD83C\uDD81 \uD83D\uDCBB     ✅\r\n" + endsColor;
        PrintUtilsFacade.print(awardText);
    }

    // Los métodos deben ser nombrados con verbos
    public void  increaseScore() {
        this.puntaje++;
    }

    public int getScore() {
        return this.puntaje;
    }

}
