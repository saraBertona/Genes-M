package it.polito.tdp.genes.model;

public class Coppia {
	private Integer partenza;
	private Integer destinazione;
	private double peso;
	public Coppia(Integer partenza, Integer destinazione, double peso) {
		super();
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.peso = peso;
	}
	public Integer getPartenza() {
		return partenza;
	}
	public void setPartenza(Integer partenza) {
		this.partenza = partenza;
	}
	public Integer getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(Integer destinazione) {
		this.destinazione = destinazione;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Coppia [partenza=" + partenza + ", destinazione=" + destinazione + ", peso=" + peso + "]";
	}
	
	
}
