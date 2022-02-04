* Solución *

- Renombrar lista cmp y llamarla compras para hacer el código entendible.
- Eliminar el método impInfoPersonal ya que esta impresión también se está haciendo en el método impTodaInfoCliente
- Renombrar método impTodaInfoCliente y llamarlo imprimirTodaInformacionCliente para eliminar abreviación de palabras
- Renombrar cmpLocal y llamarla comprasLocal para hacer más comprensible el nombre de la lista
- En las intrucciones de ipresión, imprimir un único string en vez de la concatenación de dos strings, esto para hacer más legible el código.
  Ej:
     System.out.println("Nombre: " + "Antonio"); reemplazar por:
     System.out.println("Nombre: Antonio");