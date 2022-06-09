package com.melhorescompras.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
  private int id, likes;
  private String nome, descricao, imagem;
  private double preco;
  private Detalhe detalhe;
  private PerguntaResposta perguntaResposta;
  List<Comentario> comentarios = new ArrayList<Comentario>();
}
