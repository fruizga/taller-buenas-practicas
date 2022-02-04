public class Cliente {
    List<Compras> compras;
	
    public void imprimirTodaInformacionCliente() {
    	System.out.println("Nombre: Antonio");
	System.out.println("Apellido 1: Zapata");
	System.out.println("Apellido 2: Restrepo");
	System.out.println("Número de documento: 123456789");
	
	for(Compras comprasLocal : compra){
            System.out.println(comprasLocal);
	}
    }
}
