package com.br.java.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.java.web.models.PostaModels;
import com.br.java.web.services.PostServices;

@Controller
public class PostController {

	@Autowired
	PostServices postServices;

	@RequestMapping("/postagens")
	@ResponseBody
	public Map<String, PostaModels> devolverPostagens() {

		return postServices.getPostagens();

	}

	@RequestMapping("/postagens/{id}")
	@ResponseBody
	public PostaModels procurarPosta(@PathVariable String id) {
		return postServices.buscarPosta(id);

	}
}
