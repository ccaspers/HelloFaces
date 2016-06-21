package com.ccaspers.hellofaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 * Bean zur Erzeugung einer Grußbotschaft an eine beliebige Zielgruppe.
 * Wird durch die ManagedBean-Annotation zur Injection registriert.
 * 
 * Ist als 'hellobean' in Expressions referenzierbar. Pro Session wird
 * eine Instanz der Bean erzeugt. Dadurch wird Inhalt über Seitenaufrufe hinweg
 * gerettet.
 *
 */
@ManagedBean(name="hellobean")
@SessionScoped
public class HelloFacesBean implements Serializable {
	
	private static final long serialVersionUID = 7971718495546510159L;
	private static final String HELLO = "Hello";
	private String audience;
	
	public HelloFacesBean(){
		audience = "World";
	}
	
	public void setAudience(String audience){
		this.audience = audience;
	}
	
	public String getAudience() {
		return this.audience;
	}
	
	public String getGreeting(){
		return HELLO + " "  + audience + "!";
	}
}
