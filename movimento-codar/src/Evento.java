public class Evento {
    private int diaDoEvento;
    private CriadorDeEvento criadorDoEvento;

    private String nomeCriadorDoEvento;
    private TipoDeEvento tipoDeEvento;
    private Evento evento;



    public Evento (CriadorDeEvento criadorDoEvento, String nomeCriadorDoEvento, TipoDeEvento tipoDeEvento, int diaDoEvento){
        this.criadorDoEvento = criadorDoEvento;
        this.tipoDeEvento = tipoDeEvento;
        this.diaDoEvento = diaDoEvento;
        this.nomeCriadorDoEvento = nomeCriadorDoEvento;

    }

    public int getDiaDoEvento (){
        return this.diaDoEvento;
   }

   public TipoDeEvento getTipoDeEvento(){
        return this.tipoDeEvento;
   }

    public CriadorDeEvento getCriadorDoEvento() {
        return criadorDoEvento;
    }

    public  String getNomeCriadorDoEvento(){
        return this.nomeCriadorDoEvento;
   }

}
