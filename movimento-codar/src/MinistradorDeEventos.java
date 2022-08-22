public class MinistradorDeEventos {

    public void ministrarEvento(int diaDeHoje, Evento evento){
        try {
            if (evento.getDiaDoEvento() != diaDeHoje) {
                throw new IllegalArgumentException();
            }
            System.out.println("O Evento " + evento.getTipoDeEvento() + " está acontecendo.");
        } catch (IllegalArgumentException excecao) {
            System.out.println("O Evento foi marcado para uma data diferente");
        }
    }

}
