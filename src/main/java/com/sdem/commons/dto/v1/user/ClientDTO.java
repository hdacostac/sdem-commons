package com.sdem.commons.dto.v1.user;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ClientDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -1140876431082835376L;

	private Long id;
	private Long version;

	private String cedula;
	private String rif;
	private String razonSocial;
	private String telefono;
	private String email;
	private String direccion;
	private String cedulaRepresentanteLegal;
	private String nombresRepresentanteLegal;
	private String apellidosRepresentanteLegal;
	private String emailRepresentanteLegal;
	private String telefonoRepresentanteLegal;
	private String correoReferencia;
	private String observaciones;

	private Integer mesesPromocion;

	private Date fechaCancelacionSuscripcion;
	private Date fechaCorte;
	private Date fechaDesdePromocion;
	private Date fechaHastaPromocion;

	private short cantidadUsuariosIniciales;

	public ClientDTO() {
		// default constructor
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCedulaRepresentanteLegal() {
		return cedulaRepresentanteLegal;
	}

	public void setCedulaRepresentanteLegal(String cedulaRepresentanteLegal) {
		this.cedulaRepresentanteLegal = cedulaRepresentanteLegal;
	}

	public String getNombresRepresentanteLegal() {
		return nombresRepresentanteLegal;
	}

	public void setNombresRepresentanteLegal(String nombresRepresentanteLegal) {
		this.nombresRepresentanteLegal = nombresRepresentanteLegal;
	}

	public String getApellidosRepresentanteLegal() {
		return apellidosRepresentanteLegal;
	}

	public void setApellidosRepresentanteLegal(String apellidosRepresentanteLegal) {
		this.apellidosRepresentanteLegal = apellidosRepresentanteLegal;
	}

	public String getEmailRepresentanteLegal() {
		return emailRepresentanteLegal;
	}

	public void setEmailRepresentanteLegal(String emailRepresentanteLegal) {
		this.emailRepresentanteLegal = emailRepresentanteLegal;
	}

	public String getTelefonoRepresentanteLegal() {
		return telefonoRepresentanteLegal;
	}

	public void setTelefonoRepresentanteLegal(String telefonoRepresentanteLegal) {
		this.telefonoRepresentanteLegal = telefonoRepresentanteLegal;
	}

	public String getCorreoReferencia() {
		return correoReferencia;
	}

	public void setCorreoReferencia(String correoReferencia) {
		this.correoReferencia = correoReferencia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getMesesPromocion() {
		return mesesPromocion;
	}

	public void setMesesPromocion(Integer mesesPromocion) {
		this.mesesPromocion = mesesPromocion;
	}

	public Date getFechaCancelacionSuscripcion() {
		return fechaCancelacionSuscripcion;
	}

	public void setFechaCancelacionSuscripcion(Date fechaCancelacionSuscripcion) {
		this.fechaCancelacionSuscripcion = fechaCancelacionSuscripcion;
	}

	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public Date getFechaDesdePromocion() {
		return fechaDesdePromocion;
	}

	public void setFechaDesdePromocion(Date fechaDesdePromocion) {
		this.fechaDesdePromocion = fechaDesdePromocion;
	}

	public Date getFechaHastaPromocion() {
		return fechaHastaPromocion;
	}

	public void setFechaHastaPromocion(Date fechaHastaPromocion) {
		this.fechaHastaPromocion = fechaHastaPromocion;
	}

	public short getCantidadUsuariosIniciales() {
		return cantidadUsuariosIniciales;
	}

	public void setCantidadUsuariosIniciales(short cantidadUsuariosIniciales) {
		this.cantidadUsuariosIniciales = cantidadUsuariosIniciales;
	}

	@Override
	public Long getVersion() {
		return version;
	}

	@Override
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean isExternalDataSource() {
		return false;
	}

	@Override
	public void setExternalDataSource(boolean value) {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
