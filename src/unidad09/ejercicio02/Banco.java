package unidad09.ejercicio02;

public class Banco {

	public Cuenta getCuenta(int numeroCuenta) throws BancoException {
		if (numeroCuenta <0){
			throw new BancoException("Numero de cuanta no valido");
		}
		return new Cuenta();
	}
}
