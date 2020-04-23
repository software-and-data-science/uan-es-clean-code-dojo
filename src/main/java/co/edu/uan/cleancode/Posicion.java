package co.edu.uan.cleancode;

public enum Posicion {
    ARRIBA(0),
    ABAJO(1),
    IZQUIERDA(2),
    DERECHA(3);

    private int posicion;
    Posicion(int posicion) {
        this.posicion = posicion;
    }
    public int getPosicion() {
        return posicion;
    }
}
