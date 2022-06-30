package aula02;

public class Aula2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();

        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        caneta c2 = new caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampada();
        c2.status();
        c2.rabiscar();

        caneta c3 = new caneta();
        c3.modelo = "BIC CRISTAL";
        c3.cor = "azul";
        c3.ponta = 0.5f;
        c3.carga = 80;
        c3.tampar();
        c3.status();
        c3.rabiscar();
    }
}