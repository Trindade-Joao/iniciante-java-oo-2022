public class MinistraEvento {

    public void ministrarEvento(int diaDeHoje, Evento evento) throws IllegalArgumentException {
        if(evento.getCriadorDoEvento() != this){
            throw new IllegalArgumentException("Mentor incorreto para ministrar o Evento");
        }
        if(evento.getDiaDoEvento() != diaDeHoje){
            throw new IllegalArgumentException("O Evento foi marcado para uma data diferente");
        }
        System.out.println("O Evento " + evento.getTipoDeEvento() + " está acontecendo.");
    }

}
