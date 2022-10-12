package ex3;

public class ex3 {
	
	private double num1;
	private double num2;
	private double soma;
	private double subtracao;
	private double multiplicacao;
	private double divisao;

	//construtor
	public ex3(double num1, double num2) {
		setSoma(num1, num2);
		setSubtracao(num1, num2);
		setMultiplicacao(num1, num2);
		setDivisao(num1, num2);	
	}
	
	//get e set
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
	
	public double getSoma() {
		return soma;
	}
	public void setSoma(double num1, double num2) {
		this.soma = num1+num2;
	}

	public double getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(double num1, double num2) {
		this.subtracao = num1-num2;
	}

	public double getMultiplicacao() {
		return multiplicacao;
	}

	public void setMultiplicacao(double num1, double num2) {
		this.multiplicacao = num1*num2;
	}

	public double getDivisao() {
		return divisao;
	}

	public void setDivisao(double num1, double num2) {
		this.divisao = num1 / num2;
	}
	
	
    //to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ex3 [num1=");
		builder.append(num1);
		builder.append(", num2=");
		builder.append(num2);
		builder.append(", soma=");
		builder.append(soma);
		builder.append(", subtracao=");
		builder.append(subtracao);
		builder.append(", multiplicacao=");
		builder.append(multiplicacao);
		builder.append(", divisao=");
		builder.append(divisao);
		builder.append("]");
		return builder.toString();
	}
	
}
