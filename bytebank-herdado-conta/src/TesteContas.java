
public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);
		
		try {
			cc.transfere(10.00,cp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
