import ennums.ConhecimentoTecnico;
import ennums.TipoDeDuvida;

public class Aprendiz extends Pessoa {
    private Duvida duvida;
    private boolean metaDiariaEstudos = false;



    public Aprendiz(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(ConhecimentoTecnico.INICIANTE);
    }

    public Duvida terDuvida (TipoDeDuvida tipoDeDuvida, String contextoDaDuvida){
        duvida = new Duvida(tipoDeDuvida, contextoDaDuvida);
        return this.duvida;
    }

    public void estudar(int horasDiariasDeEstudo){
        if (horasDiariasDeEstudo >=4){
            this.metaDiariaEstudos = true;
        }else {
            this.metaDiariaEstudos = false;
        }
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
