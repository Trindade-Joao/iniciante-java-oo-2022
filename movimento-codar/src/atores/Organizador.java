package atores;

import atores.Pessoa;
import ennums.ConhecimentoTecnico;
import ennums.TipoDeDuvida;
import ennums.TipoDeEvento;
import eventos.Duvida;
import eventos.Evento;
import interfaces.CriadorDeEventos;
import interfaces.Organizacao;

public class Organizador extends Pessoa implements Organizacao, CriadorDeEventos {
        private Evento evento;


    public Organizador(String nome, ConhecimentoTecnico nivelConhecimentoTecnicoTecnico) {
        super(nome, nivelConhecimentoTecnicoTecnico);

    }

    @Override
    public Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento) {
        evento = new Evento(this, super.getNome(), tipoDeEvento, diaDoEvento);
        return this.evento;
    }

    @Override
    public void auxiliarAprendizes(Duvida duvida) {
        if(duvida.getTipoDeDuvida() == TipoDeDuvida.PROCESSO){
            duvida.sanarDuvida();
        }else{
            System.out.println("eventos.Duvida Técnica, procurar alguém da interfaces.Mentoria.");
        }
    }
}
