package funcionario;

import animal.Animal;

public class Funcionario {
    private int id;
    private String nome;
    private String especialidade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    void cuidarAnimal(Animal animal){
        System.out.println("Cuidando do animal: " + animal);
    }
}
