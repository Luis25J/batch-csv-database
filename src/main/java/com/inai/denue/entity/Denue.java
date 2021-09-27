package com.inai.denue.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "denue")
public class Denue implements Serializable {

	private static final long serialVersionUID = -3781887609609178736L;

	@Id
	@Column//(length = 10)
	private Long id;

	@Column//(length = 50)
	private String clee;

	@Column//(length = 150)
	private String nomEstab;

	@Column//(length = 150)
	private String razSocial;

	@Column//(length = 6)
	private String codigoAct;
	
	@Column//(length = 250)
	private String nombreAct;

	@Column//(length = 20)
	private String perOcu;
	
	@Column//(length = 25)
	private String tipoVial;
	
	@Column//(length = 100)
	private String nomVial;
	
	@Column//(length = 40)
	private String tipoVe1;

	@Column//(length = 100)
	private String nomVe1;
	
	@Column//(length = 40)
	private String tipoVe2;

	@Column//(length = 100)
	private String nomVe2;
	
	@Column//(length = 40)
	private String tipoVe3;

	@Column//(length = 100)
	private String nomVe3;
	
	@Column//(length = 7)
	private Long numeroExt;
	
	@Column//(length = 35)
	private String letraExt;
	
	@Column//(length = 35)
	private String edificio;
	
	@Column//(length = 35)
	private String edificioE;
	
	@Column//(length = 7)
	private Long numeroInt;
	
	@Column//(length = 35)
	private String letraInt;
	
	@Column//(length = 25)
	private String tipoAsent;
	
	@Column//(length = 75)
	private String nombAsent;
	
	@Column//(length = 50)
	private String tipocencom;
	
	@Column//(length = 75)
	private String nomCencom;
	
	@Column//(length = 35)
	private String numLocal;
	
	@Column//(length = 5)
	private String codPostal;
	
	@Column//(length = 2)
	private String cveEnt;
	
	@Column//(length = 40)
	private String entidad;
	
	@Column//(length = 3)
	private String cveMun;
	
	@Column//(length = 100)
	private String municipio;
	
	@Column//(length = 4)
	private String cveLoc;
	
	@Column//(length = 50)
	private String localidad;
	
	@Column//(length = 4)
	private String ageb;
	
	@Column//(length = 3)
	private String manzana;
	
	@Column//(length = 20)
	private String telefono;
	
	@Column//(length = 75)
	private String correoElec;
	
	@Column//(length = 75)
	private String www;
	
	@Column//(length = 8)
	private String tipoUnieco;
	
	@Column//(length = 20)
	private String latitud;
	
	@Column//(length = 20)
	private String longitud;
	
	@Column//(length = 15)
	private String fechaAlta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClee() {
		return clee;
	}

	public void setClee(String clee) {
		this.clee = clee;
	}

	public String getNomEstab() {
		return nomEstab;
	}

	public void setNomEstab(String nomEstab) {
		this.nomEstab = nomEstab;
	}

	public String getRazSocial() {
		return razSocial;
	}

	public void setRazSocial(String razSocial) {
		this.razSocial = razSocial;
	}

	public String getCodigoAct() {
		return codigoAct;
	}

	public void setCodigoAct(String codigoAct) {
		this.codigoAct = codigoAct;
	}

	public String getNombreAct() {
		return nombreAct;
	}

	public void setNombreAct(String nombreAct) {
		this.nombreAct = nombreAct;
	}

	public String getPerOcu() {
		return perOcu;
	}

	public void setPerOcu(String perOcu) {
		this.perOcu = perOcu;
	}

	public String getTipoVial() {
		return tipoVial;
	}

	public void setTipoVial(String tipoVial) {
		this.tipoVial = tipoVial;
	}

	public String getNomVial() {
		return nomVial;
	}

	public void setNomVial(String nomVial) {
		this.nomVial = nomVial;
	}

	public String getTipoVe1() {
		return tipoVe1;
	}

	public void setTipoVe1(String tipoVe1) {
		this.tipoVe1 = tipoVe1;
	}

	public String getNomVe1() {
		return nomVe1;
	}

	public void setNomVe1(String nomVe1) {
		this.nomVe1 = nomVe1;
	}

	public String getTipoVe2() {
		return tipoVe2;
	}

	public void setTipoVe2(String tipoVe2) {
		this.tipoVe2 = tipoVe2;
	}

	public String getNomVe2() {
		return nomVe2;
	}

	public void setNomVe2(String nomVe2) {
		this.nomVe2 = nomVe2;
	}

	public String getTipoVe3() {
		return tipoVe3;
	}

	public void setTipoVe3(String tipoVe3) {
		this.tipoVe3 = tipoVe3;
	}

	public String getNomVe3() {
		return nomVe3;
	}

	public void setNomVe3(String nomVe3) {
		this.nomVe3 = nomVe3;
	}

	public Long getNumeroExt() {
		return numeroExt;
	}

	public void setNumeroExt(Long numeroExt) {
		this.numeroExt = numeroExt;
	}

	public String getLetraExt() {
		return letraExt;
	}

	public void setLetraExt(String letraExt) {
		this.letraExt = letraExt;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getEdificioE() {
		return edificioE;
	}

	public void setEdificioE(String edificioE) {
		this.edificioE = edificioE;
	}

	public Long getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(Long numeroInt) {
		this.numeroInt = numeroInt;
	}

	public String getLetraInt() {
		return letraInt;
	}

	public void setLetraInt(String letraInt) {
		this.letraInt = letraInt;
	}

	public String getTipoAsent() {
		return tipoAsent;
	}

	public void setTipoAsent(String tipoAsent) {
		this.tipoAsent = tipoAsent;
	}

	public String getNombAsent() {
		return nombAsent;
	}

	public void setNombAsent(String nombAsent) {
		this.nombAsent = nombAsent;
	}

	public String getTipocencom() {
		return tipocencom;
	}

	public void setTipocencom(String tipocencom) {
		this.tipocencom = tipocencom;
	}

	public String getNomCencom() {
		return nomCencom;
	}

	public void setNomCencom(String nomCencom) {
		this.nomCencom = nomCencom;
	}

	public String getNumLocal() {
		return numLocal;
	}

	public void setNumLocal(String numLocal) {
		this.numLocal = numLocal;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getCveEnt() {
		return cveEnt;
	}

	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getCveMun() {
		return cveMun;
	}

	public void setCveMun(String cveMun) {
		this.cveMun = cveMun;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCveLoc() {
		return cveLoc;
	}

	public void setCveLoc(String cveLoc) {
		this.cveLoc = cveLoc;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getAgeb() {
		return ageb;
	}

	public void setAgeb(String ageb) {
		this.ageb = ageb;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElec() {
		return correoElec;
	}

	public void setCorreoElec(String correoElec) {
		this.correoElec = correoElec;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public String getTipoUnieco() {
		return tipoUnieco;
	}

	public void setTipoUnieco(String tipoUnieco) {
		this.tipoUnieco = tipoUnieco;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
