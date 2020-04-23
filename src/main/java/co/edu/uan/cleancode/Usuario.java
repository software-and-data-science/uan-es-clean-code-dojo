package co.edu.uan.cleancode;


public class Usuario {

    private String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public static Usuario usuarioConNombre(String nombreUsuario){
        return new Usuario(nombreUsuario);
    }

    public void saludarUsuario() {
        System.out.println("Hola " + this.nombreUsuario + "!");
    }

}
