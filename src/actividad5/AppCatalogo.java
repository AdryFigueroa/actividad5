package actividad5;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCatalogo {

		
		public static final int OPCION_MENU_CREAR   = 1;
	    public static final int OPCION_MENU_VER     = 2;
	   // public static final int OPCION_MENU_AGREGAR = 3;
	    public static final int OPCION_MENU_SALIR   = 4;
	    
	    public static ArrayList<Producto> productos = new ArrayList<>();
	    
	    public static void main(String[] args) {
	        int opcionMenu;
	        do {
	            opcionMenu = menu();
	            
	            switch ( opcionMenu ) {
	                case OPCION_MENU_CREAR:
	                    crearProducto();
	                    break;
	                case OPCION_MENU_VER:
	                    verProductos();
	                    break;
	//                case OPCION_MENU_AGREGAR:
	//                  agregarProducto();
	//                   break;             
	            }
	            
	        } while( opcionMenu != OPCION_MENU_SALIR );
	        
	        System.out.printf("Ha escogido %d %n", opcionMenu);
	    }
	    
	    // BLOQUEO CREATIVO... LO DEJO EN BORRADOR
	    
	   // private static void agregarProducto() {
			
			
		//}

		private static int menu() {
	        System.out.println("OPCIONES=====");
	        System.out.println("1. Crear producto");
	        System.out.println("2. Ver productos");
	      //  System.out.println("3. Agregar producto");
	        System.out.println("4. Salir");
	        System.out.println("\nPor favor escoja una opción:");
	        try (Scanner scanner = new Scanner(System.in)) {
				return scanner.nextInt();
			}
	    }
	    
	    private static void crearProducto() {
	        System.out.println("\n\nCREAR PRODUCTO\n================\n\n");
	        System.out.println("Ingrese el nombre de su producto:");
	        Scanner scanner = new Scanner(System.in);
	        String nombre = scanner.nextLine();
	        System.out.println("Ingrese el precio de su producto:");
	        int precio = scanner.nextInt();
	        System.out.println("Creando producto....");
	        Producto productoNuevo = new Producto();
	        productos.add(productoNuevo);
	        verProductos();
	    }
	    
	    private static void verProductos() {
	        System.out.println("\n\nPRODUCTOS\n==============\n");
	        int i = 1;
	        
	    }
}
