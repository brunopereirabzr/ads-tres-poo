package funcionario;

import animal.Animal;

public class Funcionario {
    private int id;
    private String nome;
    private String especialidade;

    void cuidarAnimal(Animal animal){
        System.out.println("Cuidando do animal: " + animal);
    }
}
