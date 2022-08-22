import ennums.ConhecimentoTecnico;
import ennums.TipoDeDuvida;
import ennums.TipoDeEvento;

public class Mentor extends Pessoa implements Mentoria, CriadorDeEventos {
    private Evento evento;
    private MinistradorDeEventos eventoMinistrado;
    private Desafio desafio;

    public Mentor(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(ConhecimentoTecnico.PROFISSIONAL);
        this.eventoMinistrado = new MinistradorDeEventos();

    }

    @Override
    public Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento) {
        evento = new Evento(this, super.getNome(), tipoDeEvento, diaDoEvento);
        return this.evento;
    }

    @Override
    public void ministrarEvento(int diaDeHoje, Evento evento) {
        this.eventoMinistrado.ministrarEvento(diaDeHoje, evento);
    }

    @Override
    public void auxiliarAprendizes(Duvida duvida) {
        if (duvida.getTipoDeDuvida() == TipoDeDuvida.TECNICA) {
            duvida.sanarDuvida();
        } else {
            System.out.println("Duvida sobre o processo, procurar alguém da organização.");
        }
    }

    @Override
    public Desafio criarDesafio(String nomeDoDesafio, int prazoParaExecucao) {
        desafio = new Desafio(nomeDoDesafio, prazoParaExecucao);
        return this.desafio;
    }


}
