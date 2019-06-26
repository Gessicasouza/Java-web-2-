package com.br.java.web.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.java.web.models.PostaModels;

@Service
public class PostServices {

	Map<String, PostaModels> listaPostagem = new HashMap<String, PostaModels>();

	public PostServices() {

		this.listaPostagem.put("1",new PostaModels("Gessica Souza", "No meio da dificuldade encontra-se a oportunidade. "));
		this.listaPostagem.put("2", new PostaModels("Andressa Cintra", "Navegar é preciso senão a rotina te cansa."));
		this.listaPostagem.put("3", new PostaModels("Guilheme Tafelli","Não é a linguagem de programação que define o programador, mas sim sua lógica."));
		this.listaPostagem.put("4", new PostaModels("Miguel Bastos", "Quando vejo uma criança, ela inspira-me dois sentimentos: ternura, pelo que é, e respeito pelo que pode vir a ser."));

	}

	public Map<String, PostaModels> getPostagens() {

		return listaPostagem;
	}

	public PostaModels buscarPosta(String id) {
		return this.listaPostagem.get(id);

	}

}
