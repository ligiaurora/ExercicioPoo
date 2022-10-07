package ex3;

public class ex3 {
	
	private double num1;
	private double num2;
	private double resultadosoma;

	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getResultadosoma() {
		return resultadosoma;
	}
	public void setResultadosoma(double resultadosoma) {
		this.resultadosoma = num1+ num2;
	}
	
	
	public void SomaValores() {			
		this.setResultadosoma(this.getNum1() +this.getNum2());
	}
}
