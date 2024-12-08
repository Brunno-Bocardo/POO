package gestaohospitalar;

import java.util.Scanner;

public class GestaoHospitalar {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        Paciente[] pacientes = new Paciente[100];
        Medico[] medicos = new Medico[10];
        Atendimento[] atendimentos = new Atendimento[100];

        GerenciaMedicos gerenciaMedicos = new GerenciaMedicos(medicos);
        GerenciaPacientes gerenciaPacientes = new GerenciaPacientes(pacientes);
        GerenciaAtendimento gerenciaAtendimento = new GerenciaAtendimento(atendimentos);

        int op1, op2;

        do {
            System.out.println("--==[Gestao Hospitalar]==--");
            System.out.println("1 - Medicos");
            System.out.println("2 - Pacientes");
            System.out.println("3 - Atendimentos");
            System.out.println("4 - Sair");
            System.out.println("Opcao: ");
            op1 = e.nextInt();
            e.skip("\n");

            switch (op1) {
                case 1:
                    do {
                        System.out.println("--==[Medicos]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Listar medicos");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opcao: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch (op2) {
                            case 1:
                                gerenciaMedicos.cadastrar();
                                break;
                            case 2:
                                gerenciaMedicos.alterar();
                                break;
                            case 3:
                                gerenciaMedicos.excluir();
                                break;
                            case 4:
                                gerenciaMedicos.consultar();
                                break;
                            case 5:
                                gerenciaMedicos.relatorio();
                        }
                    } while (op2 != 6);
                    break;
                case 2:
                    do {
                        System.out.println("--==[Pacientes]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Listar pacientes");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opcao: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch (op2) {
                            case 1:
                                gerenciaPacientes.cadastrar();
                                break;
                            case 2:
                                gerenciaPacientes.alterar();
                                break;
                            case 3:
                                gerenciaPacientes.excluir();
                                break;
                            case 4:
                                gerenciaPacientes.consultar();
                                break;
                            case 5:
                                gerenciaPacientes.relatorio();
                        }
                    } while (op2 != 6);
                    break;
                case 3:
                    do {
                        System.out.println("--==[Atendimentos]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar Estado");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Voltar ao menu principal");
                        System.out.println("Opcao: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch (op2) {
                            case 1:
                                gerenciaAtendimento.cadastrar(medicos, pacientes);
                                break;
                            case 2:
                                System.out.println("Informe o CRM do medico autenticado: ");
                                String crm = e.nextLine();
                                Medico medicoAutenticado = null;
                                for (Medico med : medicos) {
                                    if (med != null && med.getCrm().equals(crm)) {
                                        medicoAutenticado = med;
                                        break;
                                    }
                                }
                                if (medicoAutenticado != null) {
                                    gerenciaAtendimento.alterarEstado(medicoAutenticado);
                                } else {
                                    System.out.println("Medico nao encontrado ou nao autenticado.");
                                }
                                break;
                            case 3:
                                gerenciaAtendimento.excluir();
                                break;
                            case 4:
                                gerenciaAtendimento.consultar();
                                break;
                        }
                    } while (op2 != 5);
                    break;
            }
        } while (op1 != 4);

        System.out.println("Sistema encerrado.");
    }
}
