public class bomba {

	//Programa escrito por Jorge Lopez Gil
	
	public static void main(String[] args){
		creditos();
		desencripta();
		encripta();
		creditos();
	}
	
	public static void desencripta(){
		
		//Variables
				String mensaje = "";
				String mensajeCodificado =" ME LA PONE TIESAPACO";
				String temporal;
				int saltos = 4;
				
				//Bucle
				temporal = mensajeCodificado;
				for (int i= mensajeCodificado.length(); i > saltos ; i--){
					mensaje = temporal.substring(1, temporal.length()) + temporal.substring(0,1);
					temporal = mensaje;
				}
				
				//Nostrar
				System.out.println("El mensaje descodificado es:");
				System.out.println(mensaje);
	}
	
	public static void encripta(){
		//Variables
				String mensajeCodificado = "";
				String mensaje ="PACO ME LA PONE TIESA";
				String temporal;
				int saltos = 4;
				
				//Bucle
				temporal = mensaje;
				for (int i=0; i < saltos; i++){
					mensajeCodificado = temporal.substring(1, temporal.length()) + temporal.substring(0,1);
					temporal = mensajeCodificado;
				}
				
				//Nostrar
				System.out.println("El mensaje codificado es: ");
				System.out.println(mensajeCodificado);
	}
	
	//Codigo de estetica :)
	public static void creditos(){
		limpiar();
		System.out.println("-------Programa creado por Jorge López Gil-------");
		limpiar();
	}
	
	public static void limpiar(){
		System.out.println("-------------------------------------------------");
	}
}