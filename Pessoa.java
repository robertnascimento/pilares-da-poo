class Pessoa{
    private String nome;
    private int idade;
    private String genero;

    public String getNome(){
        return nome;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public int setIdade(int idade){
        return this.idade = idade;
    }

    public String getGenero(){
        return genero;
    }
    public String setGenero(String genero){
        return this.genero = genero;
    }

    Pessoa(){
    }

    Pessoa(String nome){
        this.nome = nome;
    }

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    Pessoa(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Gênero: " + getGenero());
    }

}