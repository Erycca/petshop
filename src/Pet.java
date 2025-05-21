public class Pet {
    int idPet;
    String nome;
    int idade;
    String tipo;
    String raca;
    Usuario dono;

    public Pet(int idPet, String nome, int idade, String tipo, String raca, Usuario dono) {
        this.idPet = idPet;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.raca = raca;
        this.dono = dono;
    }
}
