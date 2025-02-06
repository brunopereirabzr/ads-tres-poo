import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();

        Animal animal = new Gato("Jubileu");
        listaAnimais.add(animal);

        animal = new Cachorro("Spake");
        listaAnimais.add(animal);

        animal = new Gato("Bills");
        listaAnimais.add(animal);

        animal = new Cachorro("Scooby doo");
        listaAnimais.add(animal);

        for (Animal lista: listaAnimais){
            lista.fazerSom();
        }
    }
}