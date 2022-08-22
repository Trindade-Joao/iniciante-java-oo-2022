import ennums.ConhecimentoTecnico;

public abstract class Pessoa {
    private String nome;
    private ConhecimentoTecnico nivelConhecimentoTecnicoTecnico;

    public Pessoa(String nome, ConhecimentoTecnico nivelConhecimentoTecnicoTecnico){
        this.nome = nome;
        this.nivelConhecimentoTecnicoTecnico = nivelConhecimentoTecnicoTecnico;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public ConhecimentoTecnico getNivelConhecimentoTecnico(){
        return this.nivelConhecimentoTecnicoTecnico;
    }

    protected void setNivelConhecimentoTecnico(ConhecimentoTecnico nivelConhecimentoTecnicoTecnico){
        this.nivelConhecimentoTecnicoTecnico = nivelConhecimentoTecnicoTecnico;
    }
}
