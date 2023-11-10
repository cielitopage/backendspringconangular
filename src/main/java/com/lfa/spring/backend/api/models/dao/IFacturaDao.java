package com.lfa.spring.backend.api.models.dao;

import com.lfa.spring.backend.api.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {


}
