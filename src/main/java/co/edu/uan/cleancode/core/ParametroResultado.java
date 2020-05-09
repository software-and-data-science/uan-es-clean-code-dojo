package co.edu.uan.cleancode.core;

public class ParametroResultado {
    public String left;
    public String rigth = "";
    public int top = 0;
    public int bottom = 0;
    public String inicioFinal;
    public String separador;
    public char scapeChar;
    public String startsBlueColor;
    public String endsColor;
    public String startsGreenColor;
    public ParametroResultado(){
        left = "";
        rigth = "";
        top = 0;
        bottom = 0;
        inicioFinal = "======================================\r\n";
        separador = "|                                    |\r\n";
        scapeChar = 27;
        startsBlueColor = scapeChar + "[94m";
        endsColor = scapeChar + "[0m";
        startsGreenColor = scapeChar + "[32m";
    }
}
