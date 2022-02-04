package pooproject;

import java.util.List;

public class Cliente {
    List<Compras> cmp;

    public Cliente(){
    	imprimirInformacionPersonal();
	imprimirInformacionFamiliar();
		
		
    }

    private void imprimirInformacionFamiliar() {
    	System.out.println("Información familiar");
    	System.out.println("Estado civil: " + "Casado");
    	System.out.println("Cantidad de hijos: " + "3");
	System.out.println("Cantidad de hermanos: " + "4");
	System.out.println("Nombre del padre: " + "Jesús Zapata");
	System.out.println("Nombre de la madree: " + "Patricia Restrepo");
    }
	
    public void imprimirInformacionPersonal() {
	
	Persona persona = new Persona();
	String nombre = persona.getNombre();
	String appellido1 = persona.getPrimerApellido();
	String appellido2 = persona.getSegundoApellido();
	String numeroDocumento = Integer.toString(persna.getNumeroDeDocumento());
		
	System.out.println("Información Personal");
	System.out.println("Nombre: " + nombre");
	System.out.println("Apellido 1: " + apellido1);
	System.out.println("Apellido 2: " + apellido2);
	System.out.println("Número de documento " + numeroDocumento);		
    }
	
    public void impTodaInfoCliente() {
	System.out.println("Nombre: " + "Antonio");
    	System.out.println("Apellido 1: " + "Zapata");
    	System.out.println("Apellido 2: " + "Restrepo");
    	System.out.println("Número de documento " + "123456789");
        
    	for(Compras comprasLocal : compra){
            System.out.println(comprasLocal);
	}
    }
}