package animal;

public abstract class  Animal {
    private int id;
    private String nome;
    private String especie;
    private boolean extincao;
    static int qtdAnimal;

    public abstract void emitirSom();

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

    public String getEspeciae() {
        return especie;
    }

    public void setEspeciae(String especiae) {
        this.especie = especiae;
    }

    public boolean isExtincao() {
        return extincao;
    }

    public void setExtincao(boolean extincao) {
        this.extincao = extincao;
    }
}
