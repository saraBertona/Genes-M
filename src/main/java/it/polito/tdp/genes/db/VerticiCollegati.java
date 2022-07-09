package it.polito.tdp.genes.db;

public class VerticiCollegati {
	Integer i1;
	Integer i2;
	public VerticiCollegati(Integer i1, Integer i2) {
		super();
		this.i1 = i1;
		this.i2 = i2;
	}
	public Integer getI1() {
		return i1;
	}
	public void setI1(Integer i1) {
		this.i1 = i1;
	}
	public Integer getI2() {
		return i2;
	}
	public void setI2(Integer i2) {
		this.i2 = i2;
	}
	@Override
	public String toString() {
		return i1 + "-" + i2+"\n";
	}
	
}
