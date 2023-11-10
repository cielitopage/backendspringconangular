package com.lfa.spring.backend.api.controllers;


import com.lfa.spring.backend.api.models.entity.Factura;
import com.lfa.spring.backend.api.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
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

}
