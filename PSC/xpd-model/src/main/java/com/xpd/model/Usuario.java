package com.xpd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "d_usuario")
public class Usuario implements Serializable{
	@Transient
	private static final long serialVersionUID = 1L;  

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iu_usuario;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "Ccontraseña")
	private String contrasena;
	
	@Column(name = "fechah_registro")
	private Date fechah_registro;
	
	@Column(name = "fechah_fin")
	private Date fechah_fin;
	
	@Column(name = "postpago")
	private Short postpago;
	
	@Column(name = "timbrado")
	private Integer timbrado;
	
	@Column(name = "disponible")
	private Integer disponible;
	
	@Column(name = "estado")
	private Short estado;
	
	@Transient
	private String validacionValue;
	@Transient
	private String validacionAtributo;
	
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
	
	public Date getFechah_registro() {
		return fechah_registro;
	}
	public void setFechah_registro(Date fechah_registro) {
		this.fechah_registro = fechah_registro;
	}
	public Date getFechah_fin() {
		return fechah_fin;
	}
	public void setFechah_fin(Date fechah_fin) {
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
	public String getValidacionValue() {
		return validacionValue;
	}
	public void setValidacionValue(String validacionValue) {
		this.validacionValue = validacionValue;
	}
	public String getValidacionAtributo() {
		return validacionAtributo;
	}
	public void setValidacionAtributo(String validacionAtributo) {
		this.validacionAtributo = validacionAtributo;
	}
	public Integer getTimbrado() {
		return timbrado;
	}
	public void setTimbrado(Integer timbrado) {
		this.timbrado = timbrado;
	}
	
	
}
