package Universidades_MEC;

import Universidades_MEC.MEC;

public class Principal {
    public static void main(String[] args) {

        MEC mec = new MEC();
        String continua;

            mec.Universidades();

        do {
            System.out.println("-----------------------------------------------------");
            continua = Teclado.leString("Gostaria de acessar às informações das Univeridades? S/N\n");
            System.out.println("-----------------------------------------------------");
            mec.dadosUni();
        } while (continua.equals("S") || continua.equals("s"));
    }
}




