public class PJ extends Cadastro {
    public double nfuncionarios;

    public PJ(String nome, double renda, double nfuncionarios) {
        super(nome, renda); // pode usar super contendo string e double?!
        this.nfuncionarios = nfuncionarios;
    }

    public void setNomeJuridica(String nome){
        super.setNome(nome);
    } 

    public String getNomeJuridica(){
        return nome;
    }

    public void setRendaJuridica(double renda){
        super.setRenda(renda);
    } 

    public String getRendaJuridica(){
        return renda;
    }

    public void setnfuncionarios(double nfuncionarios){

        this.nfuncionarios = nfuncionarios;
    }
    
}