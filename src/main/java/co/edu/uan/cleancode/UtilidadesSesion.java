package co.edu.uan.cleancode;
public class UtilidadesSesion {

    private String usuario;

    public UtilidadesSesion() {
        this.usuario = System.getenv("USER");
    }

    public UtilidadesSesion(String usuario) {
        this.usuario = usuario;
    }

    public void saludo() {
        imprimir("Hola " + this.usuario + "!");
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
