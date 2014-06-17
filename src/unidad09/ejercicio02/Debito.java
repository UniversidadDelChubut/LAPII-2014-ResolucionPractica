package unidad09.ejercicio02;

public class Debito implements Runnable {
	
	private int numeroCuenta;
	private double monto;
	
	private Cuenta cuenta;
	
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
	@Override
	public void run() {
		try {
			this.getCuenta().extraer(this.getMonto());
		} catch (BancoException e) {
			e.printStackTrace();
		}
	}
	
	
}
