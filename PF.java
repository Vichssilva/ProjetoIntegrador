public class PF extends Cadastro {
    public double DespesasSaude;

    public PF(String nome, double renda, double DespesasSaude) {
        super(nome, renda); // pode usar super contendo string e double?!
        this.DespesasSaude = DespesasSaude;
    }

    public void setNomeFisica(String nome){
        super.setNome(nome);
    } 

    public String getNomeFisica(){
        return nome;
    }

    public void setRendaFisica(double renda){
        super.setRenda(renda);
    } 

    public String getRendaFisica(){
        return renda;
    }

    public void setDespesasSaude(double DespesasSaude){

        this.DespesasSaude = DespesasSaude;
    }


}