package com.upizz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {
    @GetMapping
    public String listarProveedores(){
        return "Listado de todos los proveedores - GET";
    }

    @GetMapping("/{id}")
    public String listarProveedor(@PathVariable int id){
        return "Obtener un proveedor por id - GET";
    }

    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor){
        return "Agregar un proveedor - POST";
    }

    @PutMapping("/{id}")
    public String actualizarProveedor(@PathVariable int id, @RequestBody String proveedor){
        return "Actualizar proveedor por id - PUT:" + proveedor + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id){
        return "Eliminar un proveedor - DELETE" + id;
    }
}
