public class Cachorro extends Animal{

    String nome;
    public Cachorro(String nome){
        this.nome = nome;
    }
    @Override
    public void fazerSom() {
        System.out.println("Au, au...");
    }
}
