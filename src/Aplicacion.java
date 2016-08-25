
public class Aplicacion {
	public static void main(String args[])throws ExcepcionIndiceIncorrecto{
		ListaEnlazada<String> lista= new ListaEnlazada<String>();
		lista.add("Meliza");
		lista.add("Diego");
		lista.add("Tatiana");
		lista.add("Santiago");
		
		for(String a:lista){
			System.out.println(a);
		}
		
	}
}
