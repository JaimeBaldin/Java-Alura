//public class SaldoInsuficienteExcepetion extends RuntimeException - unchecked

public class SaldoInsuficienteExcepetion extends Exception {
	
	public SaldoInsuficienteExcepetion(String msg) {
		super(msg);
	}
	
}
