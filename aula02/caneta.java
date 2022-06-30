package aula02;

public class caneta {

    public String modelo;
    public String cor;
    float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo" + " " + this.modelo);
        System.out.println("Uma caneta" + " " + this.cor);
        System.out.println("Ponta" + " " + this.ponta);
        System.out.println("carga" + " " + this.carga);
        System.out.println("está tampada" + " " + this.tampada);
    }

    public void rabiscar() {

        if (this.tampada == true) {
            System.out.println("ERROR! NÃO POSSO RABISCAR ");
        } else {
            System.out.println("Estou Rabiscando");
        }


    }


    public void tampar() {
        this.tampada = true;
    }

    protected void destampada() {
        this.tampada = false;
    }

}
