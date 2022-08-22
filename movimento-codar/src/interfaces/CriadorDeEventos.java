package interfaces;

import ennums.TipoDeEvento;
import eventos.Evento;


public interface CriadorDeEventos {

    Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento);
}
