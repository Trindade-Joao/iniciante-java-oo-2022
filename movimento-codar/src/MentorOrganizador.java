public class MentorOrganizador extends Pessoa {

    public MentorOrganizador(String nome) {
        super(nome);
        super.setNivelConhecimentoTecnico(Conhecimento.PROFISSIONAL);
    }
}
