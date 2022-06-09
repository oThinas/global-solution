package com.melhorescompras.model;

public class Video {
  private int id, likes, duracao, quantidadeVisualizacao;
  private String nomeVideo, descricao, localArmazenamento;
  private Profissional usuario;

  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }
  
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }
  public int getDuracao() {
    return duracao;
  }
  public void setLocalArmazenamento(String localArmazenamento) {
    this.localArmazenamento = localArmazenamento;
  }
  public String getLocalArmazenamento() {
    return localArmazenamento;
  }
  public void setNomeVideo(String nomeVideo) {
    this.nomeVideo = nomeVideo;
  }
  public String getNomeVideo() {
    return nomeVideo;
  }
  public void setUsuario(Profissional usuario) {
    this.usuario = usuario;
  }
  public Profissional getUsuario() {
    return usuario;
  }
  public int getLikes() {
    return likes;
  }
  public int getQuantidadeVisualizacao() {
    return quantidadeVisualizacao;
  }

  public void adicionarLikes() {
    this.likes += 1;
  }

  public void adicionarVisualizacoes() {
    this.quantidadeVisualizacao += 1;
  }
}
