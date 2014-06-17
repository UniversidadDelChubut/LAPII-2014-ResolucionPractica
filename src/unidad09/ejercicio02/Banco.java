package unidad09.ejercicio02;

import java.util.List;

public class Banco {

	private List<Cuenta> cuentas;
	
	public Banco() {
		this.cuentas.add(new Cuenta(100, 5000));
		this.cuentas.add(new Cuenta(103, 15000));
		this.cuentas.add(new Cuenta(104, 10000002));
		this.cuentas.add(new Cuenta(105, 12));
	}

	public Cuenta getCuenta(int numeroCuenta) throws BancoException {
		if (numeroCuenta <0){
			throw new BancoException("Numero de cuenta no valido");
		}
		
		
		for (Cuenta c: this.cuentas){
			if (c.getNumero() == numeroCuenta) {
				return c;
			}
		}
		
		throw new BancoException("Cuanta inexistente");
	}
	
	
	public void debitar(List<Debito> debitos) {
		for (Debito debito: debitos){
			try {
				debito.setCuenta(this.getCuenta(debito.getNumeroCuenta()));
				new Thread(debito).start();
			} catch (BancoException e) {
				System.err.println("No existe la cuenta " + debito.getNumeroCuenta());
			}
			
		}
	}
}
