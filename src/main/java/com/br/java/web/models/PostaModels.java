package com.br.java.web.models;

public class PostaModels {

	private String usuario;
	private String postagem;

	

	public PostaModels(String usuario, String postagem) {
		this.usuario = usuario;
		this.postagem = postagem;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public String getUsuario() {
		return usuario;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Nome do Usuário: " + this.usuario);
		modelo.append("\n Postagem: " + this.postagem);

		return modelo.toString();

	}

}
