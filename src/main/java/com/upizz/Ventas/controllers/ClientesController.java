package com.upizz.Ventas.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {
    @GetMapping
    public String listarClientes(){
        return "Listado de todos los clientes - GET";
    }

    @GetMapping("/{id}")
    public String listarCliente(@PathVariable int id){
        return "Obtener un cliente por id - GET";
    }

    @PostMapping
    public String agregarCliente(@RequestBody String cliente){
        return "Agregar un cliente - POST";
    }

    @PutMapping("/{id}")
    public String actualizarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Actualizar cliente por id - PUT:" + cliente + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){
        return "Eliminar un cliente - DELETE" + id;
    }
}
