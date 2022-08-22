public class Desafio {

    private int prazoParaExecucao;
    private String nomeDoDesafio;
    private boolean desafioSolucionadoPeloAprendiz;



    public Desafio (String nomeDoDesafio, int prazoParaExecucao){
        this.nomeDoDesafio = nomeDoDesafio;
        this.prazoParaExecucao = prazoParaExecucao;
        this.desafioSolucionadoPeloAprendiz = false;
    }

    public int getPrazoParaExecucao() {
        return prazoParaExecucao;
    }

    public String getNomeDoDesafio() {
        return nomeDoDesafio;
    }

    public boolean isDesafioSolucionadoPeloAprendiz() {
        return desafioSolucionadoPeloAprendiz;
    }

    public void resolverDesafio(Desafio desafio, int quantosDiasParaResolucao){
        if(this.prazoParaExecucao >= quantosDiasParaResolucao){
           this.desafioSolucionadoPeloAprendiz = true;
            System.out.println("O desafio foi solucionado dentro do prazo.");
        } else {
            this.desafioSolucionadoPeloAprendiz = false;
            System.out.println("O desafio não foi solucionado dentro do prazo.");
        }
    }

}
