package com.lfa.spring.backend.api.models.services;

import com.lfa.spring.backend.api.models.entity.Cliente;
import com.lfa.spring.backend.api.models.entity.Factura;
import com.lfa.spring.backend.api.models.entity.Producto;
import com.lfa.spring.backend.api.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IClienteServices {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    Cliente findById(Long id);

    Cliente save(Cliente cliente);


    void delete(Long id);

    String findByEmail(String email);

    public List<Region> findAllRegiones();

    public Factura findFacturaById(Long id);

    public Factura saveFactura(Factura factura);

    public void deleteFacturaById(Long id);

    public List<Producto> findByNombre(String term);

    public List<Producto> findByNombreContainingIgnoreCase(String term);

    public List<Producto> findByNombreStartingWithIgnoreCase(String term);




}
