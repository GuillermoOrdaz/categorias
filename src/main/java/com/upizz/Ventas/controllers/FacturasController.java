package com.upizz.Ventas.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes/{clienteId}/facturas")
public class FacturasController {
    /*@GetMapping
    public String listarFacturas(){
        return "Listado de todas las facturas - GET";
    }

    @GetMapping("/{id}")
    public String listarFactura(@PathVariable int id){
        return "Obtener una factura por id - GET";
    } */

    @GetMapping
    public String listarFacturasPorCliente(@PathVariable int clienteId) {
        return "Listado de facturas del cliente " + clienteId + " - GET";
    }

    @GetMapping("/{facturaId}")
    public String obtenerFacturaPorCliente(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Obtener factura " + facturaId + " del cliente " + clienteId + " - GET";
    }

    @PostMapping
    public String agregarFactura(@RequestBody String factura){
        return "Agregar una factura - POST";
    }

    @PutMapping("/{id}")
    public String actualizarFactura(@PathVariable int id, @RequestBody String factura){
        return "Actualizar factura por id - PUT:" + factura + "con id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id){
        return "Eliminar una factura - DELETE" + id;
    }
}
