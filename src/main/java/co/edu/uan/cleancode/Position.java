package co.edu.uan.cleancode;

// Los enum podrían estar en otro archivo
enum Position {
    UP(0),
    DOWN(1),
    LEFT(2),
    RIGHT(3);

    // Use nombres de atributos descriptivos, ej: posicion
    private int pos;

    Position(int posi) {
        this.pos = posi;
    }

    // use verbos, por ejemplo, getPosicion
    public int gPos() {
        return pos;
    }
}