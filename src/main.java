
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	        CuentaUno miCuenta;

	        double saldoActual;



	        miCuenta = new CuentaUno("Antonio L�pez","1000-2365-85-1230456789",2500,0);

	        saldoActual = miCuenta.estado();

	        System.out.println("El saldo actual es"+ saldoActual );



	        operacuenta(miCuenta, null);

	 
	}

	public static void operacuenta(CuentaUno miCuenta, Float cantidad) {
		try {

		    miCuenta.retirar(2300);

		} catch (Exception e) {

		    System.out.print("Fallo al retirar");

		}

		try {

		    System.out.println("Ingreso en cuenta");

		    miCuenta.ingresar(695);

		} catch (Exception e) {

		    System.out.print("Fallo al ingresar");

		}
	}

}
