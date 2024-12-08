package gestaohospitalar;

import java.util.Scanner;

public class GerenciaAtendimento {
    private Atendimento[] atendimentos;
    private Scanner ent;

    public GerenciaAtendimento(Atendimento[] atendimentos) {
        this.atendimentos = atendimentos;
        this.ent = new Scanner(System.in);
    }

    public void cadastrar(Medico[] medicos, Paciente[] pacientes) {
        int i = 0;
        while (i < atendimentos.length && atendimentos[i] != null) {
            i++;
        }
        if (i < atendimentos.length) {
            System.out.println("--==[Cadastro de Atendimentos]==--");

            System.out.println("Escolha o medico responsavel pelo CRM: ");
            for (int j = 0; j < medicos.length; j++) {
                if (medicos[j] != null) {
                    System.out.println(j + " - " + medicos[j].getCrm() + " - " + medicos[j].getNome());
                }
            }
            int idxMedico = ent.nextInt();
            ent.skip("\n");
            Medico medico = medicos[idxMedico];

            System.out.println("Escolha o paciente: ");
            for (int j = 0; j < pacientes.length; j++) {
                if (pacientes[j] != null) {
                    System.out.println(j + " - " + pacientes[j].getNome());
                }
            }
            int idxPaciente = ent.nextInt();
            ent.skip("\n");
            Paciente paciente = pacientes[idxPaciente];

            System.out.println("Descricao do atendimento: ");
            String descricao = ent.nextLine();

            atendimentos[i] = new Atendimento(medico, paciente, Atendimento.estados[0], descricao);
            System.out.println("Atendimento cadastrado com sucesso!");
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void alterarEstado(Medico medicoAutenticado) {
        System.out.println("--==[Alteracao de Estado de Atendimento]==--");
        System.out.println("Escolha o atendimento: ");
        for (int i = 0; i < atendimentos.length; i++) {
            if (atendimentos[i] != null) {
                System.out.print(i + " - ");
                atendimentos[i].imprimir();
                System.out.println();
            }
        }
        int idxAtendimento = ent.nextInt();
        ent.skip("\n");

        Atendimento atendimento = atendimentos[idxAtendimento];
        System.out.println("Escolha o novo estado: ");
        for (int i = 0; i < Atendimento.estados.length; i++) {
            System.out.println(i + " - " + Atendimento.estados[i]);
        }
        int idxEstado = ent.nextInt();
        ent.skip("\n");

        try {
            atendimento.setEstadoAtendimento(Atendimento.estados[idxEstado], medicoAutenticado);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }

    public void consultar() {
        System.out.println("--==[Consulta de Atendimentos]==--");
        for (int i = 0; i < atendimentos.length; i++) {
            if (atendimentos[i] != null) {
                atendimentos[i].imprimir();
                System.out.println("\n-----------------------------------\n");
            }
        }
    }

    public void excluir() {
        System.out.println("--==[Exclusao de Atendimentos]==--");
        System.out.println("Escolha o atendimento para excluir: ");
        for (int i = 0; i < atendimentos.length; i++) {
            if (atendimentos[i] != null) {
                System.out.print(i + " - ");
                atendimentos[i].imprimir();
                System.out.println();
            }
        }
        int idxAtendimento = ent.nextInt();
        ent.skip("\n");

        if (atendimentos[idxAtendimento] != null) {
            atendimentos[idxAtendimento] = null;
            System.out.println("Atendimento excluido com sucesso.");
        } else {
            System.out.println("Atendimento nao encontrado.");
        }
    }
}
