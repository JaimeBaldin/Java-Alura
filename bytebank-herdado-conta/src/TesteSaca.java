
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(2910, 3535);
		
		conta.deposita(200);
		
		try {
			conta.saca(300);
		} catch(SaldoInsuficienteExcepetion ex) {
			System.out.println("Saldo insuficiente " + ex.getMessage()); 
		}
		
		System.out.println("Seu saldo ficou: " + conta.saldo);
	}

}
