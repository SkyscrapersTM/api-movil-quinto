package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.entity.Grado;

public interface GradoService {

	public List<Grado> listaGrado();
	public Grado insertUpdateGrado(Grado obj);
	public Optional<Grado> buscarPorId(int id);
	public void eliminaPorId(int id);
}
