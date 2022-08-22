public class TesteDasClasses {

    public static void main(String[] args) {
        Aprendiz aprendiz = new Aprendiz("João");
        Mentor mentor1 = new Mentor("Ueda");
        Evento evento = mentor1.criarEvento(TipoDeEvento.TIRA_DUVIDAS, 21);
        Mentor mentor2 = new Mentor("Cestaro");
        Evento evento2 = mentor2.criarEvento(TipoDeEvento.PALESTRAS, 22);


        mentor1.ministrarEvento(21, evento);
        System.out.println(aprendiz.getNome() + " é: " + aprendiz.getNivelConhecimentoTecnico());
        System.out.println(mentor1.getNome() + " é: " + mentor1.getNivelConhecimentoTecnico());
        System.out.println(evento.getDiaDoEvento());
        System.out.println(evento.getTipoDeEvento());
        System.out.println(evento.getNomeCriadorDoEvento());



    }

}
