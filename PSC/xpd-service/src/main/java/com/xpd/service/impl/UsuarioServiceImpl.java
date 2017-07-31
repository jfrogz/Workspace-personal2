package com.xpd.service.impl;

import com.xpd.commons.exception.XPDException;
import com.xpd.model.Usuario;
import com.xpd.persistence.UsuarioRepository;
import com.xpd.service.UsuarioService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Resource
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario create(Usuario usuario) {
        Usuario createdTable = usuario;
        return usuarioRepository.save(createdTable);
    }

    @Transactional(rollbackFor = XPDException.class)
    public Usuario delete(Long id) throws XPDException {
        Usuario deletedUsuario = usuarioRepository.findOne(id);
        if (deletedUsuario == null) {
            throw new XPDException();
        }
        usuarioRepository.delete(deletedUsuario);
        return deletedUsuario;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Transactional(rollbackFor = XPDException.class)
    public Usuario update(Usuario usuario) throws XPDException {
        Usuario updatedUsuario = usuarioRepository.findOne(usuario.getIu_usuario());
        if (updatedUsuario == null) {
            throw new XPDException();
        }
        updatedUsuario.setContrasena(usuario.getContrasena());
        updatedUsuario.setDisponible(usuario.getDisponible());
        updatedUsuario.setEstado(usuario.getEstado());
        updatedUsuario.setFechah_fin(usuario.getFechah_fin());
        updatedUsuario.setFechah_registro(usuario.getFechah_registro());
        updatedUsuario.setIu_usuario(usuario.getIu_usuario());
        updatedUsuario.setPostpago(usuario.getPostpago());
        updatedUsuario.setUsuario(usuario.getUsuario());
        return updatedUsuario;
    }

    @Transactional
    public Usuario findById(Long id) {
        return usuarioRepository.findOne(id);
    }

}
