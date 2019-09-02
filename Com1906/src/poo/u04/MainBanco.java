package poo.u04;

public class MainBanco {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("28004443", "Pepe", 17, "M", 150);
		//System.out.println(c1);
		//c1.depositar(100);
		//System.out.println(c1);
		//c1.extraer(1200);
		//System.out.println(c1);
		//c1.extraer(200);
		//System.out.println(c1);

		Cuenta c2 = new CuentaGold("28000222","lau",26,"m",450);
		//System.out.println(c2);
		
		
		Banco santa=new Banco("Santander");
		
		System.out.println(santa.agregarCuenta(c2));
		System.out.println(santa.toString());
		System.out.println(c2.extraer(1000));
		System.out.println(santa.toString());
		
		
		
		
		
		
}

}
