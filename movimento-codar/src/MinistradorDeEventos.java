public class MinistradorDeEventos {

    public void ministrarEvento(int diaDeHoje, Evento evento){
        try {
            if (evento.getDiaDoEvento() != diaDeHoje) {
                throw new IllegalArgumentException("O Evento foi marcado para uma data diferente");
            }
            System.out.println("O Evento " + evento.getTipoDeEvento() + " está acontecendo.");
        } catch (IllegalArgumentException execao) {
            System.out.println(execao);
        }
    }

}
