package com.gvt.commons.dto.v1.user;

import java.io.Serializable;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SystemUserDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -6229937870090738715L;

	private Long id;
	private Long version;

	private String idValidation;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String email;
	private String direccion;
	private String contrasena;
	private String nombreProfesion;
	private String nombreDistintivoPersona;
	private String observaciones;

	private Long idProfesion;
	private Long idDistintivoPersona;

	public SystemUserDTO() {
		// default constructor
	}

	public String getIdValidation() {
		return idValidation;
	}

	public void setIdValidation(String idValidation) {
		this.idValidation = idValidation;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombreProfesion() {
		return nombreProfesion;
	}

	public void setNombreProfesion(String nombreProfesion) {
		this.nombreProfesion = nombreProfesion;
	}

	public String getNombreDistintivoPersona() {
		return nombreDistintivoPersona;
	}

	public void setNombreDistintivoPersona(String nombreDistintivoPersona) {
		this.nombreDistintivoPersona = nombreDistintivoPersona;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(Long idProfesion) {
		this.idProfesion = idProfesion;
	}

	public Long getIdDistintivoPersona() {
		return idDistintivoPersona;
	}

	public void setIdDistintivoPersona(Long idDistintivoPersona) {
		this.idDistintivoPersona = idDistintivoPersona;
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
