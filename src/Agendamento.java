import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agendamento {
    int idAgendamento;
    LocalDate data;
    LocalTime horaInicio;
    LocalTime horaFim;
    Usuario usuario;
    String status;
    LocalDateTime dataCancelamento;

    public Agendamento(int id, LocalDate data, LocalTime horaInicio, Usuario usuario) {
        this.idAgendamento = id;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaInicio.plusMinutes(90);
        this.usuario = usuario;
        this.status = "Ativo";
    }

    public void cancelar() {
        this.status = "Cancelado";
        this.dataCancelamento = LocalDateTime.now();
    }
}
