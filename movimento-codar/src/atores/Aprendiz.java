package atores;

import ennums.ConhecimentoTecnico;
import ennums.TipoDeDuvida;
import eventos.Desafio;
import eventos.Duvida;

public class Aprendiz extends Pessoa {
    private boolean metaDiariaEstudos = false;

    public Aprendiz(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(ConhecimentoTecnico.INICIANTE);
    }

    public Duvida terDuvida (TipoDeDuvida tipoDeDuvida, String contextoDaDuvida){
        return new Duvida(tipoDeDuvida, contextoDaDuvida);
    }

    public void estudar(int horasDiariasDeEstudo){
        this.metaDiariaEstudos = horasDiariasDeEstudo >= 4;
    }

    public boolean isMetaDiariaEstudos() {
        return metaDiariaEstudos;
    }

    public void resolverDesafio(Desafio desafio, int quantosDiasParaResolucao){
        desafio.resolverDesafio(desafio, quantosDiasParaResolucao);
    }

    public void compartilharConhecimento(Aprendiz aprendiz, String conteudo){
        try {
            if (aprendiz == this) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException excecao){
            System.out.println("Você deve compartilhar o conhecimento com outra pessoa.");
        }
        System.out.println("Conhecimento sobre: " + conteudo + " compartilhado.");
    }
}
