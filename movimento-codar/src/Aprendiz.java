public class Aprendiz extends Pessoa {

    public Aprendiz(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(Conhecimento.INICIANTE);
    }

}
