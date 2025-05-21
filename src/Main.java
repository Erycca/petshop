import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Usuario joana = new Usuario(1, "Joana Silva", "joana@email.com", "11999998888", "senha123");
        Pet toto = new Pet(1, "Totó", 3, "Cachorro", "Labrador", joana);
        joana.adicionarPet(toto);

        Agendamento ag1 = new Agendamento(1, LocalDate.of(2025, 5, 23), LocalTime.of(10, 0), joana);

        System.out.println("Agendamento realizado por: " + ag1.usuario.nome);
        System.out.println("Pet: " + joana.pets.get(0).nome);
        System.out.println("Horário: " + ag1.horaInicio + " às " + ag1.horaFim);
    }
}
