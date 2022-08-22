public abstract interface CriadorDeEvento {

     public Evento criarEvento(TipoDeEvento tipoDeEvento, int diaDoEvento);
     void ministrarEvento(int diaDeHoje, Evento evento);


}
