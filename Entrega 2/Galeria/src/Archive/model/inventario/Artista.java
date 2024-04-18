package model.inventario;

import java.util.ArrayList;

public class Artista {

	/* 
	 * Atributos
	 */

	protected String nombre;

	protected ArrayList<Pieza> piezas = new ArrayList<Pieza>(); 

	private boolean isColectivo;
	
	private ArrayList<Artista> colectivo;

	/* 
	 * Constructor
	 */

	public Artista(String nombre) {
		this.nombre = nombre;
	}

	/* 
	 * Getters + Setters
	 */

	public String getNombre() {
		return nombre;
	}
	
	public boolean isColectivo() {
		return isColectivo;
	}
	
	public void setColectivo(boolean is) {
		this.isColectivo = is;
	}

	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}
	
	public void addPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public ArrayList<Artista> getColectivo() {
		return colectivo;
	}
	
	public void addArtista(Artista artista) {
		this.colectivo.add(artista);
	}

}