package com.xpd.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xpd.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
