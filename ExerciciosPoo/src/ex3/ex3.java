package ex3;

public class ex3 {
	private double soma;
	private double subtracao;
	private double multiplicacao;
	private double divisao;
	private double num1;
	private double num2;
	
	
	
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public double getSubtracao() {
		return subtracao;
	}
	public void setSubtracao(double subtracao) {
		this.subtracao = subtracao;
	}
	public double getMultiplicacao() {
		return multiplicacao;
	}
	public void setMultiplicacao(double multiplicacao) {
		this.multiplicacao = multiplicacao;
	}
	public double getDivisao() {
		return divisao;
	}
	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}
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
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Main [soma=");
		builder.append(soma);
		builder.append(", subtracao=");
		builder.append(subtracao);
		builder.append(", multiplicacao=");
		builder.append(multiplicacao);
		builder.append(", divisao=");
		builder.append(divisao);
		builder.append(", num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append("]");
		return builder.toString();
	}

}
