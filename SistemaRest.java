import java.util.Scanner;

public class SistemaRest {

//private static final String String = null;



//Funcion para validar dato de entrada
	public static int ValidarDatoINT (){
		 Scanner Entrada=new Scanner(System.in);
		 String Platos=Entrada.nextLine();
		 double CantPlatos = Double.parseDouble(Platos);
		 Entrada.close();
		 return (int) CantPlatos;
	}
	
//Calular precio por elemento
	public static int PrecioPorElemento(int Precio, int Cantidad){
		return Precio*Cantidad;
		
	}

		 
		 
	public static void main(String[] args) {
// Declaracion de variables
		int[] ListaPrecios=new int [6];
		ListaPrecios[0]=1500;
		ListaPrecios[1]=2000;
		ListaPrecios[2]=2500;
		ListaPrecios[3]=3000;
		ListaPrecios[4]=2000;
		ListaPrecios[5]=3000;
		ListaPrecios[6]=2000;
		
		
	
		System.out.println("Ingrese cantidades consumidas por los clientes de:");
		
		System.out.print("Completos ");
		
				
		int PrecioCantidad=PrecioPorElemento(ListaPrecios[0],ValidarDatoINT());
		
		int Total=PrecioCantidad;
		
		System.out.print(Total);
	}
	
}
