package modelo;

import java.io.Serializable;

//Ejercicio 12 JaveBean
public class Pokemon implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int nivel;
	private int vida;
	private int ataque;
	private int defensa;
	private int ataque_especial;
	private int defensa_especial;
	private int velocidad;

	public Pokemon () {

	}

	public Pokemon (String nombre, int nivel, int vida, int ataque, int defensa, int ataque_especial, int defensa_especial, int velocidad) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataque_especial = ataque_especial;
		this.defensa_especial = defensa_especial;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaque_especial() {
		return ataque_especial;
	}

	public void setAtaque_especial(int ataque_especial) {
		this.ataque_especial = ataque_especial;
	}

	public int getDefensa_especial() {
		return defensa_especial;
	}

	public void setDefensa_especial(int defensa_especial) {
		this.defensa_especial = defensa_especial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nNivel: " + nivel + "\nVida: " + vida + "\nAtaque: " + ataque + "\nDefensa: " + defensa;
	}



}
