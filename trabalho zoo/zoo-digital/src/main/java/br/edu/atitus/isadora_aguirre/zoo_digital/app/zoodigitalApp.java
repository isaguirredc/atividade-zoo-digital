package br.edu.atitus.isadora_aguirre.zoo_digital.app;

import java.util.*;
import br.edu.atitus.isadora_aguirre.zoo_digital.animais.*;
import br.edu.atitus.isadora_aguirre.zoo_digital.comportamentos.*;

public class zoodigitalApp {

    private static List<animal> animais = new ArrayList<animal>();
    private static Scanner sc = new Scanner(System.in);

    // limpar a tela (não deu certo?)
    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void pausar() {
        System.out.println("\n📝 Pressione Enter para continuar...");
        sc.nextLine();
    }

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            limparTela();
            System.out.println("____           ___   _      _ _        _ ");
            System.out.println("|_  /___  ___  |   \\(_)__ _(_) |_ __ _| |");
            System.out.println(" / // _ \\/ _ \\ | |) | / _` | |  _/ _` | |");
            System.out.println("/___\\___/\\___/ |___/|_\\__, |_|\\__\\__,_|_|");
            System.out.println("                       |___/              ");
            System.out.println(
                    "                                      \n" +
                    " 1 - 🆕 Cadastrar novo animal        \n" +
                    " 2 - 📋 Listar todos os animais      \n" +
                    " 3 - 🏃 Listar Corredores            \n" +
                    " 4 - 🏊 Listar Nadadores             \n" +
                    " 5 - 🦅 Listar Voadores              \n" +
                    " 6 - 🐺 Listar Predadores            \n" +
                    " 7 - 📊 Total de Animais             \n" +
                    " 0 - 🚪 Sair                          \n" 
                    );
            System.out.print("🎯 Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
// versão java não permitiu o switch, decidi seguir no básico
            if (opcao == 1) {
                limparTela();
                cadastrar();
                pausar();
            }
            else if (opcao == 2) {
                limparTela();
                listarTodos();
                pausar();
            }
            else if (opcao == 3) {
                limparTela();
                listarCorredores();
                pausar();
            }
            else if (opcao == 4) {
                limparTela();
                listarNadadores();
                pausar();
            }
            else if (opcao == 5) {
                limparTela();
                listarVoadores();
                pausar();
            }
            else if (opcao == 6) {
                limparTela();
                listarPredadores();
                pausar();
            }
            else if (opcao == 7) {
                limparTela();
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║           📊 ESTATÍSTICAS           ║");
                System.out.println("╠══════════════════════════════════════╣");
                String totalAnimais = String.format("║ 🐾 Total de animais: %-13d ║", animal.getContador());
                String animaisCadastrados = String.format("║ 📋 Animais cadastrados: %-8d ║", animais.size());
                System.out.println(totalAnimais);
                System.out.println(animaisCadastrados);
                System.out.println("╚══════════════════════════════════════╝");
                pausar();
            }
            else if (opcao == 0) {
                System.out.println("\n🐾 Obrigado por visitar o Zoo Digital! Até logo! 🐾");
            }
            else {
                System.out.println("\n❌ Opção inválida! Tente novamente.");
                pausar();
            }
        }
    }

    private static void cadastrar() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         🆕 CADASTRAR ANIMAL          ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        System.out.print("🐾 Tipo (camaleao, crocodilo, dragao, etc): "); 
        String tipo = sc.nextLine();
        System.out.print("📛 Nome: "); 
        String nome = sc.nextLine();
        System.out.print("🎂 Idade: "); 
        int idade = sc.nextInt(); sc.nextLine();

        animal a = null;
// switch também
        if (tipo.equalsIgnoreCase("camaleao")) a = new camaleao(nome, idade);
        else if (tipo.equalsIgnoreCase("crocodilo")) a = new crocodilo(nome, idade);
        else if (tipo.equalsIgnoreCase("dragao")) a = new dragaodeKomodo(nome, idade);
        else if (tipo.equalsIgnoreCase("enguia")) a = new enguia(nome, idade);
        else if (tipo.equalsIgnoreCase("flamingo")) a = new flamingo(nome, idade);
        else if (tipo.equalsIgnoreCase("morcego")) a = new morcego(nome, idade);
        else if (tipo.equalsIgnoreCase("ornitorrinco")) a = new ornitorrinco(nome, idade);
        else if (tipo.equalsIgnoreCase("peixebeta")) a = new peixeBeta(nome, idade);
        else if (tipo.equalsIgnoreCase("tartaruga")) a = new tartaruga(nome, idade);
        else {
            System.out.println("\n❌ Tipo não existe! Tipos disponíveis:");
            System.out.println("   camaleao, crocodilo, dragao, enguia, flamingo,");
            System.out.println("   morcego, ornitorrinco, peixebeta, tartaruga");
        }

        if (a != null) {
            animais.add(a);
            System.out.println("\n✅ Animal " + nome + " cadastrado com sucesso! 🎉");
        }
    }

    private static void listarTodos() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         📋 TODOS OS ANIMAIS          ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        if (animais.isEmpty()) {
            System.out.println("📭 Nenhum animal cadastrado no zoológico.");
            return;
        }

        for (int i = 0; i < animais.size(); i++) {
            animal a = animais.get(i);
            System.out.println("🐾 ANIMAL " + (i + 1) + ":");
            System.out.println("   📛 Nome: " + a.getNome());
            System.out.println("   🏷️  Tipo: " + a.getClass().getSimpleName());
            System.out.println("   🎂 Idade: " + a.getIdade() + " anos");
            System.out.print("   🔊 Som: ");
            a.emitirSom();
            System.out.print("   🍽️  Alimentação: ");
            a.comer();
            System.out.println("   ──────────────────────────────");
        }
    }

    private static void listarCorredores() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           🏃 CORREDORES             ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        boolean encontrou = false;
        for (animal a : animais) {
            if (a instanceof corredor) {
                System.out.print("🏃 " + a.getNome() + " (" + a.getClass().getSimpleName() + "): ");
                ((corredor) a).correr();
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("📭 Nenhum animal corredor encontrado.");
        }
    }

    private static void listarNadadores() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           🏊 NADADORES              ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        boolean encontrou = false;
        for (animal a : animais) {
            if (a instanceof nadador) {
                System.out.print("🏊 " + a.getNome() + " (" + a.getClass().getSimpleName() + "): ");
                ((nadador) a).nadar();
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("📭 Nenhum animal nadador encontrado.");
        }
    }

    private static void listarVoadores() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           🦅 VOADORES               ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        boolean encontrou = false;
        for (animal a : animais) {
            if (a instanceof voador) {
                System.out.print("🦅 " + a.getNome() + " (" + a.getClass().getSimpleName() + "): ");
                ((voador) a).voar();
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("📭 Nenhum animal voador encontrado.");
        }
    }

    private static void listarPredadores() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║           🐺 PREDADORES             ║");
        System.out.println("╚══════════════════════════════════════╝\n");
        
        boolean encontrou = false;
        for (animal a : animais) {
            if (a instanceof predador) {
                System.out.print("🐺 " + a.getNome() + " (" + a.getClass().getSimpleName() + "): ");
                ((predador) a).cacar();
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("📭 Nenhum animal predador encontrado.");
        }
    }
}