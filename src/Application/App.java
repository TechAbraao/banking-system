package Application;
import Models.Conta;


public class App {
	public static void main(String[] args) {
		Conta abraao = new Conta("Abraão", 123456789);
		Conta leandro = new Conta("Leandro", 987654321);
		abraao.deposito();
		
	}
}
