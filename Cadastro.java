public class Cadastro {
    private String nome;
    private double renda;

    public Cadastro(String nome, double renda){
        this.nome = nome;
        this.renda = renda;
   }

    public void setNome(String nome){
        this.nome = nome;
    } 

    public String getNome(){
        return nome;
    }

    public void setRenda(double renda){
        this.renda = renda;
    } 

    public String getRenda(){
        return renda;
    }

}