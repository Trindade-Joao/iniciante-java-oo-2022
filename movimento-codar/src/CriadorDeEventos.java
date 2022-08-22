import ennums.TipoDeEvento;

public interface CriadorDeEventos {

    Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento);
}
