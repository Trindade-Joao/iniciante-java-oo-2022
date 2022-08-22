import ennums.TipoDeEvento;

public class Evento {
    private final int diaDoEvento;
    private final CriadorDeEventos criadorDoEvento;

    private final String nomeCriadorDoEvento;
    private final TipoDeEvento tipoDeEvento;



    public Evento (CriadorDeEventos criadorDoEvento, String nomeCriadorDoEvento, TipoDeEvento tipoDeEvento, int diaDoEvento){
        try {
            if (diaDoEvento < 1 || diaDoEvento > 31) {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException excecao){
            System.out.println("Data inválida.");
        }
        this.criadorDoEvento = criadorDoEvento;
        this.tipoDeEvento = tipoDeEvento;
        this.diaDoEvento = diaDoEvento;
        this.nomeCriadorDoEvento = nomeCriadorDoEvento;
        System.out.println("Evento agendado com sucesso.");
    }

    public int getDiaDoEvento (){
        return this.diaDoEvento;
   }

   public TipoDeEvento getTipoDeEvento(){
        return this.tipoDeEvento;
   }

    public CriadorDeEventos getCriadorDoEvento() {
        return criadorDoEvento;
    }

    public  String getNomeCriadorDoEvento(){
        return this.nomeCriadorDoEvento;
   }

}
