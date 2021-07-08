package ex;

public class TesteMetodo {

    public static void main(String[] args) {

        Conta contadoBruno = new Conta();

//Colocando valores nos atributos

        contadoBruno.saldo = 500;
        contadoBruno.agencia = 74;
        contadoBruno.numero = 12;
        contadoBruno.titular = "Bruno";

       contadoBruno.deposita(600); 

        System.out.println(contadoBruno.saldo);


        boolean conseguiuRetirar = contadoBruno.saca(100); // true ou false
        System.out.println("Saldo: " + contadoBruno.saldo);
        System.out.println(conseguiuRetirar); // mostra true ou false
    }
}