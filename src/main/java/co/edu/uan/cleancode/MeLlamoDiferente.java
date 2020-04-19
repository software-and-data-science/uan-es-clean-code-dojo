package co.edu.uan.cleancode;

// Los enum podrían estar en otro archivo
enum Posicion {
    ARRIBA(0),
    ABAJO(1),
    IZQUIERDA(2),
    DERECHA(3);

    // Use nombres de atributos descriptivos, ej: posicion
    private int pos;

    Posicion(int posi) {
        this.pos = posi;
    }

    // use verbos, por ejemplo, getPosicion
    public int gPos() {
        return pos;
    }
}

// Esta clase tiene un nombre poco descriptivo,
// se trata de una clase que representa el estado de un juego
// Podría ser un nombre como Jugador
// Los nombres de las clases deben ser sustantivos
public class MeLlamoDiferente {

    // puntaje podría ser privado, los atributos privados van arriba de los públicos
    int puntaje;

    // posición podría ser privado, los atributos privados van arriba de los públicos
    Posicion posicionPremio;

    // El nombre del constructor y la clase deben ser más descriptivos
    public MeLlamoDiferente() {
        puntaje = 0;
        posicionPremio = Posicion.DERECHA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverArriba
    public void muevaArriba() {
        this.posicionPremio = Posicion.ARRIBA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverAbajo
    // no deben tener el nombre función, genera ruido innecesario
    public void muevaAbajoFuncion() {
        this.posicionPremio = Posicion.ABAJO;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverIzquierda
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void muevaIz() {
        this.posicionPremio = Posicion.IZQUIERDA;
    }

    // Los nombres de los métodos deben ser verbos, ej: moverDerecha
    // los nombres deben ser pronunciables, sin acortar palabras que luego puedan confundir
    public void mDer() {
        this.posicionPremio = Posicion.DERECHA;
    }

    // Los métodos deben ser nombrados con verbos
    // por ejemplo, imprimirPremio
    public void imprimimame() {
        String left = "";
        String rigth = "";
        int top = 0;
        int bottom = 0;
        String inicioFinal = "======================================\r\n";
        String separador = "|                                    |\r\n";
        char scapeChar = 27;
        String startsBlueColor = scapeChar + "[94m";
        String endsColor = scapeChar + "[0m";
        String startsGreenColor = scapeChar + "[32m";
        switch (posicionPremio) {
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
        String cadena_de_texto = "";
        cadena_de_texto += inicioFinal;
        for (int i = 0; i < top; i++) {
            cadena_de_texto += separador;
        }
        cadena_de_texto += left + ",                  ," + rigth;
        cadena_de_texto += left + "'\"\\_            ,/\"," + rigth;
        cadena_de_texto += left + " \\.'\\_        ,/ ,/ " + rigth;
        cadena_de_texto += left + "   \\.'\\_    ,/ ,/   " + rigth;
        cadena_de_texto += left + "     \\.'\\__/ ,/     " + rigth;
        cadena_de_texto += left + "       \\{00}/       " + rigth;
        cadena_de_texto += left + "        \\  /        " + rigth;
        cadena_de_texto += left + "      +==\"\"==+      " + rigth;
        for (int i = 0; i < bottom; i++) {
            cadena_de_texto += separador;
        }
        cadena_de_texto += inicioFinal;
        cadena_de_texto += "✊     FELICIDADES \uD83C\uDD71\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD76\uD83C\uDD74\uD83C\uDD81    \uD83D\uDE0D\r\n";
        cadena_de_texto += startsGreenColor + "✅      \uD83D\uDCBB \uD83C\uDD72\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD70\uD83C\uDD7D \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD73\uD83C\uDD74\uD83C\uDD81 \uD83D\uDCBB     ✅\r\n" + endsColor;
        CleanCodeClass.imprime(cadena_de_texto);
    }

    // Los métodos deben ser nombrados con verbos
    public void masUno() {
        this.puntaje++;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

}
