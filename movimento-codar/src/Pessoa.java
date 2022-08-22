public abstract class Pessoa {
    private String nome;
    private Conhecimento nivelConhecimentoTecnico;

    public Pessoa(String nome, Conhecimento nivelConhecimentoTecnico){
        this.nome = nome;
        this.nivelConhecimentoTecnico = nivelConhecimentoTecnico;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Conhecimento getNivelConhecimentoTecnico(){
        return this.nivelConhecimentoTecnico;
    }

    protected void setNivelConhecimentoTecnico(Conhecimento nivelConhecimentoTecnico){
        this.nivelConhecimentoTecnico = nivelConhecimentoTecnico;
    }
}
