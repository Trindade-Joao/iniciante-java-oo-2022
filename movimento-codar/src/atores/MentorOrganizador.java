package atores;

import atores.Pessoa;

import ennums.*;
import eventos.Duvida;
import interfaces.*;
import composicao.MinistradorDeEventos;
import eventos.Evento;
import eventos.Desafio;
public class MentorOrganizador extends Pessoa implements Mentoria, Organizacao, CriadorDeEventos {

    private MinistradorDeEventos eventoMinistrado;
    private Evento evento;
    private Desafio desafio;

    public MentorOrganizador(String nome) {
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
    public void auxiliarAprendizes(Duvida duvida) {
       duvida.sanarDuvida();
    }

    @Override
    public Desafio criarDesafio(String nomeDoDesafio, int prazoParaExecucao) {
        desafio = new Desafio(nomeDoDesafio, prazoParaExecucao);
        return this.desafio;
    }

    @Override
    public void ministrarEvento(int diaDeHoje, Evento evento) {
        this.eventoMinistrado.ministrarEvento(diaDeHoje, evento);
    }
}
