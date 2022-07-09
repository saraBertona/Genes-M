package it.polito.tdp.genes.db;

public class Edge {

	int i1;
	int i2;
	double d;
	public Edge(int i1, int i2, double d) {
		super();
		this.i1 = i1;
		this.i2 = i2;
		this.d = d;
	}
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	public int getI2() {
		return i2;
	}
	public void setI2(int i2) {
		this.i2 = i2;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	

}
