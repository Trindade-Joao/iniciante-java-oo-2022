import atores.Aprendiz;
import atores.Mentor;
import atores.MentorOrganizador;
import atores.Organizador;
import ennums.ConhecimentoTecnico;
import ennums.TipoDeDuvida;
import ennums.TipoDeEvento;
import eventos.Desafio;
import eventos.Duvida;
import eventos.Evento;

/*
*  Essa classe foi criada para que as outras classes possam ser testadas
*
* */

public class Main {
    public static void main(String[] args) {

        /* Todo Aprendiz, Mentor, e MentorOrganizador iniciam com o conhecimento técnico
         * já setado, sendo necessário setar apenas o conhecimento técnico do Organizador
         * */
        Aprendiz joao = new Aprendiz("João Trindade");
        Aprendiz mario = new Aprendiz("Mario Martini");
        Mentor vinicius = new Mentor("Vinícius Ueda");
        MentorOrganizador gabriel = new MentorOrganizador("Gabriel Cestaro");
        Organizador amanda = new Organizador("Amanda",ConhecimentoTecnico.NENHUM);

        Duvida duvidaProcesso = joao.terDuvida(TipoDeDuvida.PROCESSO, "Como alterar a senha da plataforma?");

        /* Somente um MentorOrganizador ou um Organizador pode sanar dúvida de PROCESSO */
        amanda.auxiliarAprendizes(duvidaProcesso);
        System.out.println(duvidaProcesso.isDuvidaSanada());

        Duvida duvidaTecnica = joao.terDuvida(TipoDeDuvida.TECNICA, "Como selecionar nomes para as classes?");

        /* Somente um Mentor ou MentorOrganizador pode sanar uma dúvida TECNICA */
        vinicius.auxiliarAprendizes(duvidaTecnica);
        System.out.println(duvidaTecnica.isDuvidaSanada());

        /* Apenas um Mentor, Mentor Organizador ou Organizador pode criar um Evento e
        *  para isso deve inserir uma data entre 1 e 31
        * */
        Evento evento = gabriel.criarEvento(TipoDeEvento.EXPLICACAO_DESAFIO, 23);

        /* Apenas um Mentor ou MentorOrganizador pode ministrarEvento e a data deve ser
         * igual a data do agendamento do evento
         * */
        gabriel.ministrarEvento(23, evento);

        /* Apenas um Mentor ou MentorOrganizador pode criarDesafio e deve inserir um prazo em dias */
        Desafio desafio = vinicius.criarDesafio("Java OO", 2);

        /* Para que o Desafio seja concluído o Aprendiz deve executar dentro do prazo */
        joao.resolverDesafio(desafio, 2);

        /* Aprendizes podem compartilharConhecimento */
        mario.compartilharConhecimento(joao, "Ideias de nomes para classes");


    }

}
