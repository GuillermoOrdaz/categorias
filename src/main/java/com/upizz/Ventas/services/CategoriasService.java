package com.upizz.Ventas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upizz.Ventas.models.Categoria;
import com.upizz.Ventas.repository.*;

@Service
public class CategoriasService {

    CategoriasRepository categoriasRepository;

    public CategoriasService(CategoriasRepository categoriasRepository){
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categoria> getAllCategorias(){
        return categoriasRepository.obtenerTodas();
    }

    public Categoria getCategoriaById(Long id){
        return categoriasRepository.obtenerPorId(id);
    }

    public Categoria createCategoria(Categoria categoria){
        return categoriasRepository.guardar(categoria);
    }

    public Categoria updateCategoria(Categoria categoria){
        return categoriasRepository.actualizar(categoria);
    }

    public void deleteCategoria(Long id){
        categoriasRepository.eliminar(id);
    }
}
