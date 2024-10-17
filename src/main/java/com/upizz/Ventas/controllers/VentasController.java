package com.upizz.Ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentasController {
    @GetMapping
    public String listarVentas(){
        return "Listado de todas las ventas - GET";
    }

    @GetMapping("/{id}")
    public String listarVenta(@PathVariable int id){
        return "Obtener una venta por id - GET";
    }

    @PostMapping
    public String agregarVenta(@RequestBody String venta){
        return "Agregar una venta - POST";
    }

    @PutMapping("/{id}")
    public String actualizarVenta(@PathVariable int id, @RequestBody String venta){
        return "Actualizar venta por id - PUT:" + venta + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id){
        return "Eliminar una venta - DELETE" + id;
    }
}
