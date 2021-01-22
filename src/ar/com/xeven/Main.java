package ar.com.xeven;
/*
	Una financiera tiene 3 tipos de clientes:
	    Riesgosos, confiables y nuevos.
    Todos los clientes pueden solicitar un préstamo.
    A los clientes riesgosos sólo se les otorgan préstamos
     de hasta 100 pesos.
    A los nuevos se les puede prestar 200.
    A los confiables hasta 500.
    Los clientes pueden pagar su deuda de forma total o parcial.
    Todos los clientes pueden consultar su deuda.
    Si un cliente ya solicitó un préstamo y cancela su deuda,
        se convierte en cliente confiable.
	 */
public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente("riesgoso");
        c.pedirPrestamo(50.0);
        System.out.println("Deuda actual: $"+c.consultarDeuda());
        c.realizarPago(10.0);
        System.out.println("Ahora debe: $"+c.consultarDeuda());
        System.out.println("Y su categoría es: "+c.getCategoria());
        System.out.println("Monto prestado originalmente: $"+c.getMontoPrestado());
        c.realizarPago(c.consultarDeuda());
        System.out.println("La categoría es: "+c.getCategoria());
   }
}
