public class Aprendiz extends Pessoa {
    private Duvida duvida;
    private boolean metaDiariaEstudos = false;

    public Aprendiz(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(Conhecimento.INICIANTE);
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
}
