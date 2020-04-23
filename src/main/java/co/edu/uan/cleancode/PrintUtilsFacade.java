package co.edu.uan.cleancode;

// Esta clase se usa para mostrar mensajes genéricos
// Debería tener un nombre como PrintUtilsFacade
// Las clases no deberían tener impresas en su nombre la palabra Clase o Class, es redundante
// Los nombres de las clases deben ser sustantivos
// Los nombres de las clases podría mostrar qué patrón están aplicando
public class PrintUtilsFacade {

    // Un nombre poco descriptivo, en este caso se puede reemplazar por nombreUsuario, no importa que sea más largo
    // es mejor un nombre largo descriptivo, que uno corto y no descriptivo
    private String nombreUsuario;



    // Usa nombres significativos para los parámetros de entrada
    // evita los nombres redundantes como String o Cadena para algo que es un String
    // adicionalmente podía complementarse con una función constructura y dejar privada la sobrecarga del constructor
    // un ejemplo de función constructora:
    //    public static PrintUtils WithUserName (String userName) {
    //        return new PrintUtils(userName);
    //    }
    public PrintUtilsFacade(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    // Los métodos deben ser nombrados con verbos
    public void greet() {
        print("Hola " + this.nombreUsuario + "!");
    }

    // Los métodos deben ser nombrados con verbos
    // los parámetros de entrada deben ser nombrados descriptivamente
    // no use nombres de parámetros (o variables en general) que no puedan ser pronunciados
    public static void print(String msj) {
        System.out.println(msj);
    }
}
