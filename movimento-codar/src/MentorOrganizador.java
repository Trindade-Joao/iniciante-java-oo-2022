public class MentorOrganizador extends Pessoa implements Mentoria, Organizacao, CriadorDeEventos{

    private MinistradorDeEventos eventoMinistrado;
    private Evento evento;

    public MentorOrganizador(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(Conhecimento.PROFISSIONAL);
        this.eventoMinistrado = new MinistradorDeEventos();
    }

    @Override
    public Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento) {
        evento = new Evento(this, super.getNome(), tipoDeEvento, diaDoEvento);
        return this.evento;
    }


    @Override
    public void auxiliarAprendizes(Duvida duvida) {
       duvida.sanarDuvida();
    }

    @Override
    public void ministrarEvento(int diaDeHoje, Evento evento) {
        this.eventoMinistrado.ministrarEvento(diaDeHoje, evento);
    }
}
