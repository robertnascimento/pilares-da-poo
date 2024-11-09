public class Professor extends Pessoa {
    private String matricula;
    private String formacao;

    public String getMatricula(){
        return matricula;
    }
    public String setMatricula(String matricula){
        return this.matricula = matricula;
    }

    public String getFormacao(){
        return formacao;
    }
    public String setFormacao(String formacao){
        return this.formacao = formacao;
    }

    Professor(String nome, int idade, String genero, String matricula, String formacao){
        super(nome, idade, genero);
        this.matricula = matricula;
        this.formacao = formacao;
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Formação: " + getFormacao());
    }
}
