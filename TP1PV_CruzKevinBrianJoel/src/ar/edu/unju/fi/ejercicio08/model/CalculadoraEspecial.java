package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	private int num;

	public CalculadoraEspecial() {
		
	}
	public long CalculadoraSumatoria() {
		long resultado=0;
		for(int k=1;k<=this.num;k++) {
			resultado+=Math.pow((k*(k+1))/2, 2);
		}
		return resultado;
	}
	public long CalculadoraProduco() {
		long resultado=1;
		for(int k=1;k<=this.num;k++) {
			resultado*=k*(k+4);
		}
		return resultado; 
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	

}
