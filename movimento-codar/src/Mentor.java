public class Mentor extends Pessoa implements CriadorDeEvento {
    private Evento evento;

    public Mentor(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(Conhecimento.PROFISSIONAL);
    }

    @Override
     public Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento){
        evento = new Evento(this, super.getNome(), tipoDeEvento, diaDoEvento);
        return this.evento;
     }

    @Override
    public void ministrarEvento(int diaDeHoje, Evento evento) throws IllegalArgumentException {
        if(evento.getCriadorDoEvento() != this){
            throw new IllegalArgumentException("Mentor incorreto para ministrar o Evento");
        }
        if(evento.getDiaDoEvento() != diaDeHoje){
            throw new IllegalArgumentException("O Evento foi marcado para uma data diferente");
        }
        System.out.println("O Evento " + evento.getTipoDeEvento() + " está acontecendo.");
    }


}
