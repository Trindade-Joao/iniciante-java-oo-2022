package interfaces;

import eventos.Desafio;
import eventos.Duvida;
import eventos.Evento;

public interface Mentoria {


     void ministrarEvento(int diaDeHoje, Evento evento);

     void auxiliarAprendizes(Duvida duvida);

     Desafio criarDesafio(String nomeDoDesafio, int prazoParaExecucao);


}
