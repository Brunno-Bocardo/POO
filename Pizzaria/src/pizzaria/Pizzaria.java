package pizzaria;

import java.io.IOException;
import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        DAOPizzas daoPizzas = new DAOPizzas();
        DAODiaTrabalho daoDiaTrabalho = new DAODiaTrabalho();
        DAOPedidos daoPedidos = new DAOPedidos();

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n\n+++++ MENU PRINCIPAL +++++");
            System.out.println("1 - Iniciar dia de trabalho");
            System.out.println("2 - Listar dias de trabalho");
            System.out.println("3 - Finalizar programa");
            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (escolha) {
                case 1:
                    iniciarDiaDeTrabalho(daoPizzas, daoDiaTrabalho, daoPedidos, scanner);
                    break;
                case 2:
                    System.out.println("\n\n~~~~~ DIAS DE TRABALHO ~~~~~");
                    System.out.println(daoDiaTrabalho.listAll());
                    System.out.println("\nPressione Enter para voltar ao menu.");
                    scanner.nextLine();
                    break;
                case 3:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Encerrando programa...");
    }

    private static void iniciarDiaDeTrabalho(DAOPizzas daoPizzas, DAODiaTrabalho daoDiaTrabalho, DAOPedidos daoPedidos, Scanner scanner) {
        DiaTrabalho dia = new DiaTrabalho();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n\n===== MENU DIA DE TRABALHO =====");
            System.out.println("1 - Criar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Finalizar dia de trabalho");
            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (escolha) {
                case 1:
                    criarPedido(daoPizzas, dia, daoPedidos, scanner);
                    break;
                case 2:
                    System.out.println("\n\n===== PEDIDOS DO DIA =====");
                    System.out.println(daoPedidos.listAll()); // Listar pedidos do DAO
                    System.out.println("\nPressione Enter para voltar ao menu.");
                    scanner.nextLine();
                    break;
                case 3:
                    daoDiaTrabalho.create(dia);
                    System.out.println("Dia de trabalho finalizado!");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }

    private static void criarPedido(DAOPizzas daoPizzas, DiaTrabalho dia, DAOPedidos daoPedidos, Scanner scanner) {
        System.out.print("\n\nDigite o nome do cliente: ");
        String cliente = scanner.nextLine();
        Pedidos pedido = new Pedidos(cliente);

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n\n===== MENU CRIACAO DE PEDIDO =====");
            System.out.println("1 - Listar sabores disponiveis");
            System.out.println("2 - Escolher sabor e tamanho da pizza");
            System.out.println("3 - Confirmar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.print("Escolha uma opcao: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (escolha) {
                case 1:
                    listarSabores();
                    break;
                case 2:
                    adicionarPizzaDinamicamente(daoPizzas, pedido, scanner);
                    break;
                case 3:
                    if (pedido.getPizzasPorPedidos().isEmpty()) {
                        System.out.println("O pedido nao pode ser confirmado porque nao contem pizzas.");
                        System.out.println("Adicione pizzas ao pedido antes de confirma-lo.");
                        System.out.println("\nPressione Enter para continuar.");
                        scanner.nextLine();
                    } else {
                        daoPedidos.create(pedido); 
                        dia.addPedido(pedido);    
                        System.out.println("Pedido confirmado!");
                        rodando = false;
                    }
                    break;
                case 4:
                    System.out.println("Pedido cancelado.");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }

    private static void listarSabores() {
        System.out.println("\n\n===== SABORES DISPONÍVEIS =====");
        System.out.println("1 - Queijo");
        System.out.println("2 - Frango");
        System.out.println("3 - Portuguesa");
        System.out.println("\nPressione Enter para voltar.");
        new Scanner(System.in).nextLine();
    }

    private static void adicionarPizzaDinamicamente(DAOPizzas daoPizzas, Pedidos pedido, Scanner scanner) {
        System.out.println("\n\n===== ESCOLHA DO SABOR =====");
        System.out.println("1 - Queijo");
        System.out.println("2 - Frango");
        System.out.println("3 - Portuguesa");
        System.out.print("Escolha um sabor: ");
        int saborEscolhido = scanner.nextInt();
        scanner.nextLine(); 

        String sabor;
        switch (saborEscolhido) {
            case 1:
                sabor = "Queijo";
                break;
            case 2:
                sabor = "Frango";
                break;
            case 3:
                sabor = "Portuguesa";
                break;
            default:
                System.out.println("Sabor invalido!");
                return;
        }

        System.out.println("\n\n===== ESCOLHA DO TAMANHO =====");
        System.out.println("P - Pequena");
        System.out.println("M - Media");
        System.out.println("G - Grande");
        System.out.print("Escolha o tamanho: ");
        String tamanho = scanner.nextLine().toUpperCase();

        if (!tamanho.equals("P") && !tamanho.equals("M") && !tamanho.equals("G")) {
            System.out.println("Tamanho invalido!");
            return;
        }

        Pizzas novaPizza;
        switch (sabor) {
            case "Queijo":
                novaPizza = new SaborQueijo(tamanho);
                break;
            case "Frango":
                novaPizza = new SaborFrango(tamanho);
                break;
            case "Portuguesa":
                novaPizza = new SaborPortuguesa(tamanho);
                break;
            default:
                System.out.println("Erro ao criar pizza.");
                return;
        }

        // Adicionar pizza ao pedido e ao DAO
        daoPizzas.create(novaPizza);
        pedido.addPizza(novaPizza);
        System.out.println("Pizza de " + sabor + " tamanho " + tamanho + " adicionada ao pedido!");
        System.out.println("Pressione Enter para continuar.");
        scanner.nextLine();
    }
}
