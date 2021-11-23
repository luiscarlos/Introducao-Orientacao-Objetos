package conta.banco;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setDescricao("conta do luis");
		
		System.out.println(contaBancaria);
		System.out.println("******** saque **************");
		contaBancaria.sacar(100);
		System.out.println(contaBancaria);
		
		
		System.out.println("******** depposito **************");
		contaBancaria.depositar(200);
		System.out.println(contaBancaria.getSaldo());
	}

}
