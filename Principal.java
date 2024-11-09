public class Principal {
    
    public static void main(String[] args) {
        
        Professor professor = new Professor("Bruno", 37, "Masculino", "20151109", "ADS");
        professor.imprimirInfo();

        System.out.println("-----------");
        
        Pessoa pessoa1 = new Pessoa("Fernanda","Feminino");
        pessoa1.setIdade(27);
        pessoa1.imprimirInfo();

        System.out.println("-----------");
        
        Pessoa pessoa2 = new Pessoa("Jorge", 19);
        pessoa2.setGenero("Masculino");
        pessoa2.imprimirInfo();

        System.out.println("-----------");

        Pessoa pessoa3 = new Pessoa("Jorge");
        pessoa3.setGenero("Masculino");
        pessoa3.imprimirInfo();
    }

}
