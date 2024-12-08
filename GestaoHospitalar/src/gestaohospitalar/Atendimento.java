package gestaohospitalar;

public class Atendimento {
    private Medico medico;
    private Paciente paciente;
    private String estadoAtendimento;
    private String descricao;
    
    public static final String[] estados = {
        "ENTRADA",
        "TRATAMENTO CLINICO GERAL",
        "PREPARACAO PRE CIRURGIA",
        "CIRURGIA",
        "POS CIRURGIA",
        "ALTA CLINICA"
    };
    
    public Atendimento(Medico medico, Paciente paciente, String estadoAtendimento, String descricao) {
        this.medico = medico;
        this.paciente = paciente;
        this.estadoAtendimento = estadoAtendimento;
        this.descricao = descricao;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getEstadoAtendimento() {
        return estadoAtendimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] getEstados() {
        return estados;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setEstadoAtendimento(String estadoAtendimento, Medico medicoAutenticado) {
        if (medicoAutenticado.getCrm().equals(medico.getCrm())) {
            this.estadoAtendimento = estadoAtendimento;
            System.out.println("Estado alterado com sucesso!");
        } else {
            System.out.println("Apenas o medico responsavel pelo atendimento pode mudar seu estado");
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     public void imprimir() {
        System.out.println("Medico: " + medico.getNome());
        System.out.println("\tPaciente: " + paciente.getNome());
        System.out.println("\tEstado do Atendimento: " + estadoAtendimento);
        System.out.println("\tDescricao: " + descricao);
    }
}
