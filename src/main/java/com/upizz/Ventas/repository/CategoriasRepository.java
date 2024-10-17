package com.upizz.Ventas.repository;


import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.concurrent.atomic.*;
import com.upizz.Ventas.models.Categoria;
import java.util.ArrayList;

@Repository
public class CategoriasRepository {
    //Almacenar en un listado las categorias: salvar, listar, eliminar, actualizar, etc.
    //Generar de manera única el id para cada categoria
    private List<Categoria> categorias = new ArrayList<Categoria>();
    private AtomicLong id = new AtomicLong();

    public Categoria guardar(Categoria categoria) {
        categoria.setId(id.incrementAndGet());
        categorias.add(categoria);
        return categoria;
    }

    public List<Categoria> obtenerTodas() {
        return categorias;
    }

    public Categoria obtenerPorId(Long id) {
        //Estructurada
        /*for (Categoria categoria : categorias){
            if(categoria.getId().equals(id)){
                return categoria;
            }
        } */
        return categorias.stream().filter(categoria -> categoria.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(/*Categoria categoria*/Long id){
        categorias.removeIf(categoria -> categoria.getId().equals(id));
    }

    public Categoria actualizar(Categoria categoria){
        eliminar(categoria.getId());
        categorias.add(categoria);
        return categoria;
    }
}
