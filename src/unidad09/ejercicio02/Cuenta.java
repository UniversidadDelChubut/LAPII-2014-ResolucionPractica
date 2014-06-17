package unidad09.ejercicio02;

public class Cuenta {
	
	private int numero;
	private double saldo;
	
	public Cuenta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public synchronized void extraer(double monto) throws BancoException {
		if (this.saldo < monto){
			throw new BancoException("Saldo induficiente");
		}
		this.saldo -= monto;
	}
	
	public synchronized void depositar(double monto) {
		this.saldo += monto;
	}
	
}
