public class Impostos{

    double impostoPF;
    double impostoPJ;
    public double calcularimpostoPF(double renda, double DespesasSaude){

        if (renda<20000){

            impostoPF = renda*0.15 - DespesasSaude*0.50;

        }else{

            impostopf = renda*0.25 - DespesasSaude*0.50;
        }

        return impostoPF;

    }

    public double calcularimpostoPJ(double renda, double nfuncionarios){

        if (nfuncionarios<=10){

            impostoPJ = renda*0.16;

        }else{

            impostoPJ = renda*0.14;
        }

        return impostoPJ;
        
    }

}