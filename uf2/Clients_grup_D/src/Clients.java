import java.util.Scanner;

public class Clients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	public static final int n = 3; 
	private static void menu() {
		// TODO Auto-generated method stub
		int option=0, cont=0;
		String alta="si", baja="no", client[]=new String[n] ;
		do {
			System.out.println("Menu clients:\n"
							+  "---- --------------\n"
							+  "1- alta clientes. \n"
							+  "2- Visualizació d'un client\n"
							+  "3- Baixa d'un client\n"
							+  "4- Recuperació de dades de client\n"
							+  "5- Ordena els clients\n"
							+  "6- Recerca d'un client\n"
							+  "7- Sortir");
			option=introOption();
			switch(option) {
			case 1:
				System.out.println("1- alta clientes.");
				for(int i=0;i<client.length;i++){
					System.out.println(client[i]);
				}
				System.out.println(cont);
				if(cont< n) {
				altaClient(client, alta, cont);
				cont++;
				}
				System.out.println("Contar: "+cont);
				
				break;
			case 2:
				System.out.println("2- Visualizació d'un client");
				verClient();
				break;
			case 3:
				System.out.println("3- Baixa d'un client");
				baixaClient(client, baja, cont);
				break;
			case 4:
				System.out.println("4- Recuperació de dades de client");
				RecuperarClient();
				break;
			case 5:
				System.out.println("5- Ordena els clients");
				ordaClients();
				break;
			case 6:
				System.out.println("6- Recerca d'un client");
				recercaClient();
				break;
			case 7:
				System.out.println("7- Sortir");
				break;
			default:
				System.out.println(option+"- Opcion no valida.");
				break;
			}
		}while(option!=7);
		
	}
	private static void altaClient(String[] client, String alta, int cont) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String datos="", partes[];
		int cuentas=0;
		do {
			cuentas=0;
			
			System.out.println("Nif;Nom;cognoms;telef");
			datos=s.nextLine();
			client[cont]=alta+";"+(cont+1)+";"+datos;
			partes=datos.split(";");
			
			for(int i=0;i<partes.length;i++) {
				System.out.println(partes[i]);
				cuentas++;
			}
		}while(cuentas!=4);						
		
	}
	private static void verClient() {
		// TODO Auto-generated method stub
		
	}
	private static void baixaClient(String[] client, String baja, int cont) {
		// TODO Auto-generated method stub
		int num=0, contar;
		String partes[];
		System.out.println("Listado clientes:");
		
		for(int i=0;i<client.length;i++){
			System.out.println(client[i]);
		}
		System.out.println("Cantidad Clientes: "+cont);
		
		if(cont>0){
			do {
				System.out.println("Introduce el id del cliente");
				num=introOption();	
				num=num-1;
				if(num<0) {
					System.out.println("valor negativo");
				}
			}while(num<0);
			
			if(num<0||num>=cont){	
				System.out.println("Esta fuera de los limites");
			}else{
				System.out.println(num);
				String convertir=""+(num+1);
				System.out.println(convertir);
				if(client[num].contains(convertir)){
					partes=client[num].split(";");
					partes[0]=baja;
					client[num]="no;"+partes[1]+";"+partes[2]+";"+partes[3]+";"+partes[4];
				}
				System.out.println(client[num]);
				System.out.println(cont);
			}
		}else{
			System.out.println("No hay clientes añadidos");
		}
		
	}

	private static void recercaClient() {
		// TODO Auto-generated method stub
		
	}

	private static void ordaClients() {
		// TODO Auto-generated method stub
		
	}



	private static void RecuperarClient() {
		// TODO Auto-generated method stub
		
	}

	private static int introOption() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=0, option=0;
		do {
			if(s.hasNextInt()) {
				option=s.nextInt();
				i++;
			}else {
				System.out.println("El valor no es entero..");
				s.next();
			}
		}while(i<1);
		return option;
	}

}
