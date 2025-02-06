public class Gato extends Animal{

    String nome;
    public Gato(String nome){
        this.nome = nome;
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau, miau...");
    }
}
