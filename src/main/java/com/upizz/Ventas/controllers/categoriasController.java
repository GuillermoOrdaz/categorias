package com.upizz.Ventas.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.upizz.Ventas.services.CategoriasService;
import java.util.List;
import com.upizz.Ventas.models.Categoria;

@RestController
@RequestMapping("/api/v1/categorias")
public class categoriasController {
    //Requiero inyectar una dependencia
    CategoriasService categoriasService;

    public categoriasController(CategoriasService categoriasService){
        this.categoriasService = categoriasService;
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> getCategorias(){
        return ResponseEntity.ok(categoriasService.getAllCategorias());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoria(@PathVariable Long id){
        return ResponseEntity.ok(categoriasService.getCategoriaById(id));
    }

    @PostMapping
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriasService.createCategoria(categoria));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> updateCategoria(@RequestBody Categoria categoria, @PathVariable Long id){
        categoria.setId(id);
        return ResponseEntity.ok(categoriasService.updateCategoria(categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long id){
        categoriasService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    } 
   
}

 /*@GetMapping
    public String listarCategorias(){
        return "Listado de todas las categorias - GET";
    }

    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id){
        return "Obtener una categoria por id - GET";
    }

    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar una categoria - POST";
    }

    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "Actualizar categoria por id - PUT:" + categoria + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar una categoria - DELETE" + id;
    } */