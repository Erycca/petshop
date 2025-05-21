import java.time.*;
import java.util.*;

public class Usuario {
    int idUsuario;
    String nome;
    String email;
    String telefone;
    String senha;
    LocalDate dataCadastro;
    List<Pet> pets = new ArrayList<>();

    public Usuario(int idUsuario, String nome, String email, String telefone, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }
}

