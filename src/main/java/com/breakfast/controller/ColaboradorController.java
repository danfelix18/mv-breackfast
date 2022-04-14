package com.breakfast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.breakfast.entity.Colaborador;
import com.breakfast.repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Colaborador> list() {
		return colaboradorRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin(origins = "http://localhost:3000")
	public Colaborador adicionar(@RequestBody Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin(origins = "http://localhost:3000")
	public boolean deletar(@RequestParam Long id) {
		try {
			colaboradorRepository.deleteById(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin(origins = "http://localhost:3000")
	public Colaborador editar(@RequestBody Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}
	
}
