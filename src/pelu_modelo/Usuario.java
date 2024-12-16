/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelu_modelo;

import java.io.Serializable;

/**
 *
 * @author stefa
 */


public class Usuario implements Serializable{
	
	private String nombre;
	private String apellido;

	/**
	 * contructor vacio 
	 */
	public Usuario() {
	}
	
	

	/**
	 * 
	 * @param nombre
	 * @param apellido 
	 */
	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	

	/**
	 * 
	 * @return  el nombre 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * 
	 * @param apellido 
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * 
	 * @return devuelve todos los parametros de los atributos
	 */
	@Override
	public String toString() {
		return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
	}
	
	
}
