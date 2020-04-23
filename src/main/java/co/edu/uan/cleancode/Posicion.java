package co.edu.uan.cleancode;

public enum Posicion {

    ARRIBA(0),
    ABAJO(1),
    IZQUIERDA(2),
    DERECHA(3);

    // Use nombres de atributos descriptivos, ej: posicion
    private int posicion;

    Posicion(int posicion) {
        this.posicion = posicion;
    }

    // use verbos, por ejemplo, getPosicion
    public int getPosicion() {
        return posicion;
    }
}
