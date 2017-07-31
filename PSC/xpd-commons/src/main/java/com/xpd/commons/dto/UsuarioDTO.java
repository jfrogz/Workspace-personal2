package com.xpd.commons.dto;

import java.util.Calendar;

public class UsuarioDTO {

private Long iu_usuario;
	
	private String usuario;
	private String contrasena;
	private Calendar fechah_registro;
	private Calendar fechah_fin;
	private Short postpago;
	private Integer disponible;
	private Short estado;
	public Long getIu_usuario() {
		return iu_usuario;
	}
	public void setIu_usuario(Long iu_usuario) {
		this.iu_usuario = iu_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Calendar getFechah_registro() {
		return fechah_registro;
	}
	public void setFechah_registro(Calendar fechah_registro) {
		this.fechah_registro = fechah_registro;
	}
	public Calendar getFechah_fin() {
		return fechah_fin;
	}
	public void setFechah_fin(Calendar fechah_fin) {
		this.fechah_fin = fechah_fin;
	}
	public Short getPostpago() {
		return postpago;
	}
	public void setPostpago(Short postpago) {
		this.postpago = postpago;
	}
	public Integer getDisponible() {
		return disponible;
	}
	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}
	public Short getEstado() {
		return estado;
	}
	public void setEstado(Short estado) {
		this.estado = estado;
	}
}
