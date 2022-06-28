package aula02;

public class Aula2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();

        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada();

        c1.status();
        c1.rabiscar();

        caneta c2 = new caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}