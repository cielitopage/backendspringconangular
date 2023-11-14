package com.lfa.spring.backend.api.models.dao;

import com.lfa.spring.backend.api.models.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductosDao extends CrudRepository<Producto, Long> {


    @Query("select p from Producto p where p.nombre like %?1%")
    public List<Producto> findByNombre(String term);

    public List<Producto> findByNombreStartingWithIgnoreCase(String term);

    public List<Producto> findByNombreContainingIgnoreCaseOrderByNombreAsc(String term);

}