package Universidades_MEC;

public class MEC {
    int qPub;
    Publica[] universidadesPublicas;
    int qPri;
    Privada[] universidadesPrivadas;
    int c = 0;
    int j = 0;

    public void cadastrarUniversidadePublica() {
        System.out.println("\n==========================================================");
        System.out.printf("%39s", "UNIVERSIDADES PÚBLICAS");
        System.out.println("\n==========================================================");
        qPub = Teclado.leInt("Quantidade de Universidade Pública deseja incluir: ");
        universidadesPublicas = new Publica[qPub];
        while (c < universidadesPublicas.length) {
            System.out.println("-------------------------------");
            universidadesPublicas[c] = new Publica(Teclado.leString("Informe o nome da Universidade: "),
                    Teclado.leInt("Informe a quantidade de alunos: "),
                    Teclado.leInt("Informe a quantidade de professores: "),
                    Teclado.leString("Informe a UF: "),
                    Teclado.leString("Informe a Cidade: "));
            c++;
        }
        if (c == universidadesPublicas.length) {
            System.out.println("============== CADASTRO CONCLUÍDO ===================");

        }
    }

    public void cadastrarUniversidadePrivada() {
        System.out.println("\n==========================================================");
        System.out.printf("%39s", "UNIVERSIDADES PRIVADAS");
        System.out.println("\n==========================================================");
        qPri = Teclado.leInt("Quantidade de Universidade Privada deseja incluir: ");
        universidadesPrivadas = new Privada[qPri];

        while (j < universidadesPrivadas.length) {
            System.out.println("-------------------------------");
            /////tam = Teclado.leInt ("Quantas Universidades deseja incluir: ");
            universidadesPrivadas[j] = new Privada(Teclado.leString("Informe o nome da Universidade: "),
                    Teclado.leInt("Informe a quantidade de alunos: "),
                    Teclado.leInt("Informe a quantidade de professores: "),
                    Teclado.leDouble("Informe o valor da mensalidade: "));
            j++;
        }
        if (j == universidadesPrivadas.length) {
            System.out.println("============== CADASTRO CONCLUÍDO ===================");
        }
    }

    public void universidadesDoSul() {
        for (int i = 0; i < universidadesPublicas.length; i++) {
            if (universidadesPublicas[i].getEstado().equalsIgnoreCase("RS") || universidadesPublicas[i].getEstado().equalsIgnoreCase("rs")) {

                universidadesPublicas[i].imprimeInfo();
                System.out.println("-------------------------------");
            }
            if (universidadesPublicas[i].getEstado().equalsIgnoreCase("SC") || universidadesPublicas[i].getEstado().equalsIgnoreCase("sc")) {

                universidadesPublicas[i].imprimeInfo();
                System.out.println("-------------------------------");
            }
            if (universidadesPublicas[i].getEstado().equalsIgnoreCase("PR") || universidadesPublicas[i].getEstado().equalsIgnoreCase("pr")) {

                universidadesPublicas[i].imprimeInfo();
                System.out.println("-------------------------------");
            }
        }
    }

    public void imprimeUniversidades() {
        System.out.println("------------------------------------------------");
        System.out.printf("%29s", "LISTA DE UNIVERSIDADES\n");

        for (int i = 0; i < universidadesPublicas.length; i++) {
            System.out.println("========== Públicas =============");
            universidadesPublicas[i].imprimeInfo();
        }
        for (int j = 0; j < universidadesPrivadas.length; j++) {
            System.out.println("========== Privadas =============");
            universidadesPrivadas[j].imprimeInfo();
        }
    }


    public void maisCara() {
        double maior = 0.0;
        for (int i = 0; i < universidadesPrivadas.length; i++) {
            if (universidadesPrivadas[i].getValorMensalidade() > maior) {
                maior = universidadesPrivadas[i].getValorMensalidade();
            }
            for (int j = 0; j < universidadesPrivadas.length; j++) {
                if (universidadesPrivadas[j].getValorMensalidade() > maior) {
                    maior = universidadesPrivadas[j].getValorMensalidade();
                }
            }
        }
        for (int i = 0; i < universidadesPrivadas.length; i++) {
            if (universidadesPrivadas[i].getValorMensalidade() == maior) {
                System.out.println("------------------------------------------------");
                System.out.println(" Universidade mais cara: ");
                System.out.println("------------------------------------------------");
                universidadesPrivadas[i].imprimeInfo();
            }
        }
    }

    public void Universidades() {
        System.out.printf("%33s", " CADASTRO \n");
        System.out.printf("%29s", "DE\n");
        System.out.printf("%35s", "UNIVERSIDADES \n");
        this.cadastrarUniversidadePublica();

        this.cadastrarUniversidadePrivada();
    }

    public void dadosUni() {
        if (universidadesPrivadas[0] != null || universidadesPublicas[0] != null) {
            System.out.println("\n=======================  DADOS   =======================");
            System.out.printf("%29s", "DAS\n");
            System.out.println("==================== UNIVERSIDADES =======================\n");
            System.out.println("1 - Imprimir Dados Universidades");
            System.out.println("2 - Mostrar a Universidade Privada mais cara");
            System.out.println("3 - Mostrar Universidades do Sul");
            System.out.println("===========================================================");
            int dado = Teclado.leInt("Escolha uma das opções informadas: ");
            switch (dado) {
                case 1:

                    if (universidadesPrivadas[0] != null || universidadesPublicas[0] != null) {
                        this.imprimeUniversidades();
                    } else {
                        System.out.println("------------------------------------------------");
                        System.out.println("Nenhuma Universidade Cadastrada!");
                        System.out.println("------------------------------------------------");
                    }
                    break;
                case 2:
                    if (universidadesPrivadas[0] != null) {
                        this.maisCara();
                    } else {
                        System.out.println("------------------------------------------------");
                        System.out.println("Nenhuma Universidade Cadastrada!");
                        System.out.println("------------------------------------------------");
                    }
                    break;
                case 3:
                    if (universidadesPublicas[0] != null) {
                        this.universidadesDoSul();

                    } else {
                        System.out.println("------------------------------------------------");
                        System.out.println("Nenhuma Universidade Cadastrada!");
                        System.out.println("------------------------------------------------");
                    }

                    break;
                default:
                    System.out.println("------------------------------------------------");
                    System.out.println("\t ATENÇÃO!\n\tOPÇÃO INVÁLIDA!!!");
                    System.out.println("------------------------------------------------");

            }
        } else {
            if (universidadesPrivadas[0] == null && universidadesPublicas[0] == null) {
                System.out.println("------------------------------------------------");
                System.out.println("\tNenhuma Universidade Cadastrada!");
                System.out.println("------------------------------------------------");
            }

        }
    }
}

