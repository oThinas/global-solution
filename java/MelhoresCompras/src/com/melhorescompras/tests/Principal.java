package com.melhorescompras.tests;

import java.util.Scanner;

import com.melhorescompras.model.Cliente;
import com.melhorescompras.model.Profissional;
import com.melhorescompras.model.ProfissionalEnum;
import com.melhorescompras.model.Video;

public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Profissional profissional = new Profissional();
    profissional = null;
    Video video = new Video();
    video = null;
    int op = 0;
    
    do {
      do {
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Profissional");
        System.out.println("3 - Cadastrar Vídeo");
        System.out.println("4 - Visualizar Vídeo");
        System.out.println("5 - Gostar do Vídeo");
        System.out.println("6 - Sair");
        System.out.println("Por favor, digite o número da opção desejada.");
        op = sc.nextInt();
      } while (!(op == 1 || op == 2 || op == 3 || op == 4 || op == 5 || op == 6));
      
      if (op == 1) {
        Cliente cliente = new Cliente();
        cliente.setCpf("111.111.111-11");
        printLinha();
        System.out.println("Cliente cadastrado!");
        printLinha();
      }
      else if (op == 2) {
        profissional = new Profissional();
        profissional.setTipoProfissional(ProfissionalEnum.ESPECIALISTA);
        printLinha();
        System.out.println("Profissional cadastrado!");
        printLinha();
      }
      else if (op == 3) {
        if (profissional == null) {
          System.out.println("É necessário cadastrar um profissional antes.");
          return;
        }

        video = new Video();
        video.setId(1);
        video.setDescricao("Descrição do produto...");
        video.setDuracao(60);
        video.setLocalArmazenamento("C:/Desktop");
        video.setNomeVideo("Título do produto...");
        video.setUsuario(profissional);
        printLinha();
        System.out.println("Vídeo cadastrado!");
        printLinha();
   
      }
      else if (op == 4) {
        if (video == null) {
          System.out.println("É necessário cadastrar um vídeo antes.");
          return;
        } 
        video.adicionarVisualizacoes();
        printLinha();
        System.out.println("Visualizações no vídeo: " + video.getQuantidadeVisualizacao());
        printLinha();
      }
      else if (op == 5) {
        if (video == null) {
          System.out.println("É necessário cadastrar um vídeo antes.");
          return;
        } 
        video.adicionarLikes();
        printLinha();
        System.out.println("Likes no vídeo: " + video.getLikes());
        printLinha();
      }
      else {
        printLinha();
        System.out.println("Saindo do sistema...");
        printLinha();
      }
      
      sc.close();
    } while (op != 6);
  }

  public static void printLinha() {
    System.out.println("-------------------");
  }
}
