package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Grado;
import com.colegio.repository.GradoRepository;

@Service
public class GradoServiceImpl implements GradoService{

	@Autowired
	private GradoRepository repository;
	
	@Override
	public List<Grado> listaGrado() {
		
		return repository.findAll();
		
	}

	@Override
	public Grado insertUpdateGrado(Grado obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Grado> buscarPorId(int id) {
		return repository.findById(id);
	}

	@Override
	public void eliminaPorId(int id) {
		repository.deleteById(id);
	}

	
}
