package ex1;

public class ex1 {
	
	//atributos
	String Nome;
	String Sobrenome;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String Sobrenome) {
		this.Sobrenome = Sobrenome;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ex1 [Nome=");
		builder.append(Nome);
		builder.append(", Sobrenome=");
		builder.append(Sobrenome);
		builder.append(", NomeCompleto=");
		//builder.append(NomeCompleto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
