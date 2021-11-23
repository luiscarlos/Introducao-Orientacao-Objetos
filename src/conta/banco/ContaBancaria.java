package conta.banco;

public class ContaBancaria {

	
	private String descricao;
	private double saldo = 8000;
	
	
	public void somar100() {
		saldo = saldo + 100;
	}
	
	public void subtrair100() {
		saldo = saldo - 100;
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
}
