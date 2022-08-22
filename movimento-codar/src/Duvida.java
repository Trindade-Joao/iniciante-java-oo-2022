import ennums.TipoDeDuvida;

public class Duvida {

    private TipoDeDuvida tipoDeDuvida;
    private String contextoDaDuvida;
    private boolean duvidaSanada = false;

    public Duvida (TipoDeDuvida tipoDeDuvida, String contextoDaDuvida){
        this.tipoDeDuvida = tipoDeDuvida;
        this.contextoDaDuvida = contextoDaDuvida;
    }

    public String getContextoDaDuvida() {
        return contextoDaDuvida;
    }

    public TipoDeDuvida getTipoDeDuvida() {
        return tipoDeDuvida;
    }

    public boolean isDuvidaSanada() {
        return duvidaSanada;
    }

    public void sanarDuvida (){
        if(this.isDuvidaSanada()){
            System.out.println("Essa dúvida já foi sanada.");
        }
        System.out.println("Respondendo a dúvida...");
        this.duvidaSanada = true;
    }

}
