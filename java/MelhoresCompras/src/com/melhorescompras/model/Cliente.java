package com.melhorescompras.model;

public class Cliente extends Usuario {
  private String cpf;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getCpf() {
    return cpf;
  }
}
