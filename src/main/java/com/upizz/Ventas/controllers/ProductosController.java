package com.upizz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {
    @GetMapping
    public String listarProductos(){
        return "Listado de todos los productos - GET";
    }

    @GetMapping("/{id}")
    public String listarProducto(@PathVariable int id){
        return "Obtener un producto por id - GET";
    }

    @PostMapping
    public String agregarProducto(@RequestBody String producto){
        return "Agregar un producto - POST";
    }

    @PutMapping("/{id}")
    public String actualizarProducto(@PathVariable int id, @RequestBody String producto){
        return "Actualizar producto por id - PUT:" + producto + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){
        return "Eliminar un producto - DELETE" + id;
    }
}
