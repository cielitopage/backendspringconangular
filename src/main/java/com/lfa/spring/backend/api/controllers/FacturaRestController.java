package com.lfa.spring.backend.api.controllers;


import com.lfa.spring.backend.api.models.entity.Factura;
import com.lfa.spring.backend.api.models.entity.Producto;
import com.lfa.spring.backend.api.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200","*"})
@RequestMapping("/api")
@RestController
public class FacturaRestController {

    @Autowired
    private IClienteServices clienteServices;


    @RequestMapping("/facturas/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Factura show(@PathVariable Long id){
        return clienteServices.findFacturaById(id);
    }

    @DeleteMapping("/facturas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        clienteServices.deleteFacturaById(id);
    }

    @PostMapping("/facturas")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura create(@RequestBody Factura factura){
        return clienteServices.saveFactura(factura);
    }


    @GetMapping("/facturas/filtrar-productos/{term}")
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> filtrarProductos(@PathVariable String term){
        return clienteServices.findByNombre(term);
    }


}
