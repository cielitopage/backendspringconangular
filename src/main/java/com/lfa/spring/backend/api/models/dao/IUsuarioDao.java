package com.lfa.spring.backend.api.models.dao;

import com.lfa.spring.backend.api.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {



    public Usuario findByUsername(String username);
}
