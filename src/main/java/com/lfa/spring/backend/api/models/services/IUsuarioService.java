package com.lfa.spring.backend.api.models.services;

import com.lfa.spring.backend.api.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}
