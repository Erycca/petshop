import java.time.LocalDate;

public class ServicoAdicional {
    int idServico;
    String nome;
    String descricao;
    String tipo;
    LocalDate dataDisponibilizacao;

    public ServicoAdicional(int idServico, String nome, String descricao, String tipo) {
        this.idServico = idServico;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataDisponibilizacao = LocalDate.now();
    }
}

