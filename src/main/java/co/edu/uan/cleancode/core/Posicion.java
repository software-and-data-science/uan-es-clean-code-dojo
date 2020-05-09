package co.edu.uan.cleancode.core;

public enum Posicion {
    ARRIBA(0),
    ABAJO(1),
    IZQUIERDA(2),
    DERECHA(3);
    private int posicion;
    Posicion(int posi) {
        this.posicion = posi;
    }

    public int obtenerPosicion() {
        return posicion;
    }
}
