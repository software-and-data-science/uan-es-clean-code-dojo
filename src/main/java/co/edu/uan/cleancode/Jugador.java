package co.edu.uan.cleancode;

import co.edu.uan.cleancode.core.ParametroResultado;
import co.edu.uan.cleancode.core.Posicion;

public class Jugador {

    // puntaje podría ser privado, los atributos privados van arriba de los públicos
    int puntaje;

    // posición podría ser privado, los atributos privados van arriba de los públicos
    Posicion posicionPremio;

    // El nombre del constructor y la clase deben ser más descriptivos
    public Jugador() {
        puntaje = 0;
        posicionPremio = Posicion.DERECHA;
    }

    public void moverArriba() {
        this.posicionPremio = Posicion.ARRIBA;
    }

    public void moverAbajo() {
        this.posicionPremio = Posicion.ABAJO;
    }

    public void moverIzquierda() {
        this.posicionPremio = Posicion.IZQUIERDA;
    }

    public void moverDerecha() {
        this.posicionPremio = Posicion.DERECHA;
    }

    ParametroResultado definirPisicionPremio(){
        ParametroResultado parametroResultado = new ParametroResultado();
        switch (posicionPremio) {
            case ARRIBA:
                parametroResultado.left = "|        " + parametroResultado.startsBlueColor;
                parametroResultado.rigth = parametroResultado.endsColor + "        |\r\n";
                parametroResultado.top = 0;
                parametroResultado.bottom = 5;
                break;
            case ABAJO:
                parametroResultado.left = "|        " + parametroResultado.startsBlueColor;
                parametroResultado.rigth = parametroResultado.endsColor + "        |\r\n";
                parametroResultado.top = 5;
                parametroResultado.bottom = 0;
                break;
            case IZQUIERDA:
                parametroResultado.left = "|" + parametroResultado.startsBlueColor;
                parametroResultado.rigth = parametroResultado.endsColor + "                |\r\n";
                parametroResultado.top = 2;
                parametroResultado.bottom = 2;
                break;
            case DERECHA:
                parametroResultado.left = "|                " + parametroResultado.startsBlueColor;
                parametroResultado.rigth = parametroResultado.endsColor + "|\r\n";
                parametroResultado.top = 2;
                parametroResultado.bottom = 2;
                break;
        }
        return parametroResultado;
    }
    // Los métodos deben ser nombrados con verbos
    // por ejemplo, imprimirPremio
    public void imprimirResultados() {
        ParametroResultado parametroResultado = this.definirPisicionPremio();

        String textoPremio = "";
        textoPremio += parametroResultado.inicioFinal;
        for (int i = 0; i < parametroResultado.top; i++) {
            textoPremio += parametroResultado.separador;
        }
        textoPremio += parametroResultado.left + ",                  ," + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "'\"\\_            ,/\"," + parametroResultado.rigth;
        textoPremio += parametroResultado.left + " \\.'\\_        ,/ ,/ " + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "   \\.'\\_    ,/ ,/   " + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "     \\.'\\__/ ,/     " + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "       \\{00}/       " + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "        \\  /        " + parametroResultado.rigth;
        textoPremio += parametroResultado.left + "      +==\"\"==+      " + parametroResultado.rigth;
        for (int i = 0; i < parametroResultado.bottom; i++) {
            textoPremio += parametroResultado.separador;
        }
        textoPremio += parametroResultado.inicioFinal;
        textoPremio += "✊     FELICIDADES \uD83C\uDD71\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD76\uD83C\uDD74\uD83C\uDD81    \uD83D\uDE0D\r\n";
        textoPremio += parametroResultado.startsGreenColor + "✅      \uD83D\uDCBB \uD83C\uDD72\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD70\uD83C\uDD7D \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD73\uD83C\uDD74\uD83C\uDD81 \uD83D\uDCBB     ✅\r\n" + endsColor;
        UtilidadesSesion.imprimir(textoPremio);
    }

    // Los métodos deben ser nombrados con verbos
    public void agregarPuntaje() {
        this.puntaje++;
    }

    public int obtenerPuntaje() {
        return this.puntaje;
    }

}
