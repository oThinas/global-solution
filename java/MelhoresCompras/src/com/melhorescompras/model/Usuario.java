package com.melhorescompras.model;

public class Usuario {
  private int id;
  private String nome, login, senha;

  public void logar(String login, String senha) {
    if (!(this.login.equals(login) || this.senha.equals(senha)))
      return;
    
    System.out.println("Logou");
    
  }
}
