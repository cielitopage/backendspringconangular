package com.lfa.spring.backend.api.models.dao;

import com.lfa.spring.backend.api.models.entity.Cliente;
import com.lfa.spring.backend.api.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")  // JPQL
    public List<Region> findAllRegiones();
    String findByEmail(String email);


}
