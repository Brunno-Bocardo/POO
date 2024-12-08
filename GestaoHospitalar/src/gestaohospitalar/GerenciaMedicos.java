package gestaohospitalar;

import java.util.Scanner;

public class GerenciaMedicos {
    private Medico medicos[];
    private Scanner ent;
    
    public GerenciaMedicos(Medico meds[]){
        medicos = meds;
        ent = new Scanner(System.in);
    }
    
    public void cadastrar(){
        String nome, id, cpf, end, tel, crm, esp, ctps;
        
        // Verifica se existem posições vazias no vetor.
        int i = 0;
        while((i < medicos.length) && (medicos[i] != null)){
            i++;
        }
        if(i < medicos.length){
            System.out.println("--==[Cadastro de Medicos]==--");
            System.out.println("Nome: ");
            nome = ent.nextLine();
            System.out.println("Identidade: ");
            id = ent.nextLine();
            System.out.println("CPF: ");
            cpf = ent.nextLine();
            System.out.println("Endereco: ");
            end = ent.nextLine();
            System.out.println("Telefone: ");
            tel = ent.nextLine();
            System.out.println("CRM: ");
            crm = ent.nextLine();
            System.out.println("Especialidade: ");
            esp = ent.nextLine();
            System.out.println("CTPS: ");
            ctps = ent.nextLine();
            
            medicos[i] = new Medico(nome, id, cpf, end, tel, crm, esp, ctps);
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void alterar(){
        String nome, id, cpf, end, tel, crm, esp, ctps;
        int pos, resp;
        
        System.out.println("--==[Alteracao de Medicos]==--");
        System.out.println("Qual posicao deseja alterar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        if(medicos[pos] != null){
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + medicos[pos].getNome());
            System.out.println("\nAlterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo nome: ");
                nome = ent.nextLine();
                medicos[pos].setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("Identidade atual: " + medicos[pos].getIdentidade());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite a nova identidade: ");
                id = ent.nextLine();
                medicos[pos].setIdentidade(id);
            }
            System.out.println("----------------------------------");
            System.out.println("CPF atual: " + medicos[pos].getCpf());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo CPF: ");
                cpf = ent.nextLine();
                medicos[pos].setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("Endereco atual: " + medicos[pos].getEndereco());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Endereco: ");
                end = ent.nextLine();
                medicos[pos].setEndereco(end);
            }
            System.out.println("----------------------------------");
            System.out.println("Telefone atual: " + medicos[pos].getTelefone());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Telefone: ");
                tel = ent.nextLine();
                medicos[pos].setTelefone(tel);
            }
            System.out.println("----------------------------------");
            System.out.println("CRM atual: " + medicos[pos].getCrm());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo CRM: ");
                crm = ent.nextLine();
                medicos[pos].setCrm(crm);
            }
            System.out.println("----------------------------------");
            System.out.println("Especialidade atual: " + medicos[pos].getEspecialidade());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite a nova Especialidade: ");
                esp = ent.nextLine();
                medicos[pos].setEspecialidade(esp);
            }
            System.out.println("----------------------------------");
            System.out.println("CTPS atual: " + medicos[pos].getCtps());
            System.out.println("Alterar? (1-sim/2-nao)");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite a nova CTPS: ");
                ctps = ent.nextLine();
                medicos[pos].setCtps(ctps);
            }
            System.out.println("----------------------------------");
            
            System.out.println("Atualizacao realizada com sucesso.");
        }
        else{
            System.out.println("Medico nao encontrado");
        }
    }
    
    public void excluir(){
        int pos, resp;
        
        System.out.println("--==[Exclusao de Medicos]==--");
        System.out.println("Qual posicao deseja excluir? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(medicos[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            medicos[pos].imprimir();
            System.out.println("\nConfirma exclusao? (1-sim/2-nao))");
            resp = ent.nextInt();
            ent.skip("\n");
            
            if(resp == 1){
                medicos[pos] = null;
                System.out.println("Exclusao efetuada com sucesso.");
            }
            else{
                System.out.println("Exclusao não efetuada.");
            }
        }
        else{
            System.out.println("Medico nao existe.");
        }
    }
    
    public void consultar(){
        int pos;
        
        System.out.println("--==[Consulta de Medicos]==--");
        System.out.println("Qual posicao deseja consultar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(medicos[pos] != null){
            System.out.println("-=[Dados do Medico]=-");
            medicos[pos].imprimir();
        }
        else{
            System.out.println("Medico nao existe.");
        }
    }
    
    public void relatorio(){
        int pos = 0;
        
        System.out.println("--==[Relatorio de Medicos]==--");
        
        while(pos < medicos.length){
            if(medicos[pos] != null){
                System.out.println("Posicao no Sistema: " + pos);
                medicos[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }
            
            pos++;
        }
    }
}