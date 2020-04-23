package co.edu.uan.cleancode;

public class Jugador {
    private int puntaje;
    private Posicion posicionPremio;

    public Jugador() {
        puntaje = 0;
        posicionPremio = Posicion.DERECHA;
    }

    public void moverPosicionHaciaArriba() {
        this.posicionPremio = Posicion.ARRIBA;
    }

    public void moverPosicionHaciaAbajo() {
        this.posicionPremio = Posicion.ABAJO;
    }

    public void moverPosicionHaciaLaIzquierda() { this.posicionPremio = Posicion.IZQUIERDA;}

    public void moverPosicionHaciaLaDerecha() {
        this.posicionPremio = Posicion.DERECHA;
    }

    public void imprimirPremio() {
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
        String textoPremio = "";
        textoPremio += inicioFinal;
        for (int i = 0; i < top; i++) {
            textoPremio += separador;
        }
        textoPremio += left + ",                  ," + rigth;
        textoPremio += left + "'\"\\_            ,/\"," + rigth;
        textoPremio += left + " \\.'\\_        ,/ ,/ " + rigth;
        textoPremio += left + "   \\.'\\_    ,/ ,/   " + rigth;
        textoPremio += left + "     \\.'\\__/ ,/     " + rigth;
        textoPremio += left + "       \\{00}/       " + rigth;
        textoPremio += left + "        \\  /        " + rigth;
        textoPremio += left + "      +==\"\"==+      " + rigth;
        for (int i = 0; i < bottom; i++) {
            textoPremio += separador;
        }
        textoPremio += inicioFinal;
        textoPremio += "✊     FELICIDADES \uD83C\uDD71\uD83C\uDD70\uD83C\uDD7D\uD83C\uDD71\uD83C\uDD7E\uD83C\uDD76\uD83C\uDD74\uD83C\uDD81    \uD83D\uDE0D\r\n";
        textoPremio += startsGreenColor + "✅      \uD83D\uDCBB \uD83C\uDD72\uD83C\uDD7B\uD83C\uDD74\uD83C\uDD70\uD83C\uDD7D \uD83C\uDD72\uD83C\uDD7E\uD83C\uDD73\uD83C\uDD74\uD83C\uDD81 \uD83D\uDCBB     ✅\r\n" + endsColor;
        PrintUtil.imprimir(textoPremio);
    }

    public void incrementarPuntaje() {
        this.puntaje++;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

}
