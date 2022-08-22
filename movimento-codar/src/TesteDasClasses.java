public class TesteDasClasses {

    public static void main(String[] args) {
        Aprendiz aprendiz = new Aprendiz("João");
        Mentor mentor1 = new Mentor("Ueda");
        Evento evento = mentor1.criarEvento(TipoDeEvento.TIRA_DUVIDAS, 21);
        MentorOrganizador mentor2 = new MentorOrganizador("Cestaro");
        Evento evento2 = mentor2.criarEvento(TipoDeEvento.PALESTRAS, 22);
        Duvida duvida = aprendiz.terDuvida(TipoDeDuvida.PROCESSO, "Como Trocar senha da plataforma?");


        aprendiz.estudar(3);
        System.out.println(aprendiz.isMetaDiariaEstudos());

        mentor1.auxiliarAprendizes(duvida);
        mentor2.ministrarEvento(22, evento2);

        System.out.println(aprendiz.getNome() + " é: " + aprendiz.getNivelConhecimentoTecnico());
        System.out.println(mentor1.getNome() + " é: " + mentor1.getNivelConhecimentoTecnico());
        System.out.println(evento2.getDiaDoEvento());
        System.out.println(evento.getTipoDeEvento());
        System.out.println(evento.getNomeCriadorDoEvento());
        System.out.println(duvida.isDuvidaSanada());



    }

}
