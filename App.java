import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Factura factura = new Factura();
        inicializarProductos(factura);  // Inicializa los productos predeterminados
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Agregar producto");
                System.out.println("2. Modificar producto");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Buscar producto");
                System.out.println("5. Mostrar productos");
                System.out.println("6. Generar factura");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el código del producto: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la cantidad del producto: ");
                        int cantidad = scanner.nextInt();
                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();
                        Producto producto = new Producto(codigo, nombre, cantidad, precio);
                        factura.agregarProducto(producto);
                    }
                        
                    case 2 -> {
                        System.out.print("Ingrese el código del producto a modificar: ");
                        String codigo = scanner.nextLine();
                        Producto productoMod = factura.buscarProducto(codigo);
                        if (productoMod != null) {
                            productoMod.modificarPrecio(5);
                            System.out.println("El precio se ha incrementado en 5%");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Ingrese el código del producto a eliminar: ");
                        String codigo = scanner.nextLine();
                        factura.eliminarProducto(codigo);
                        System.out.println("Producto eliminado.");
                    }
                        
                    case 4 -> {
                        System.out.print("Ingrese el código del producto a buscar: ");
                        String codigo = scanner.nextLine();
                        Producto productoBuscado = factura.buscarProducto(codigo);
                        if (productoBuscado != null) {
                            System.out.println(productoBuscado.toString());
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                    }
                        
                    case 5 -> factura.mostrarProductos();
                        
                    case 6 -> factura.generarFactura();
                        
                    case 0 -> System.out.println("Saliendo...");
                        
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 0);
        }
    }

   
    private static void inicializarProductos(Factura factura) {
        factura.agregarProducto(new Producto("001", "Leche", 10, 1.50));
        factura.agregarProducto(new Producto("002", "Pan", 15, 0.80));
        factura.agregarProducto(new Producto("003", "Huevos", 12, 2.20));
        factura.agregarProducto(new Producto("004", "Queso", 8, 3.50));
        factura.agregarProducto(new Producto("005", "Manzanas", 20, 1.00));
        factura.agregarProducto(new Producto("006", "Carne", 5, 6.00));
        factura.agregarProducto(new Producto("007", "Pollo", 7, 4.50));
        factura.agregarProducto(new Producto("008", "Pasta", 10, 1.20));
        factura.agregarProducto(new Producto("009", "Aceite", 6, 2.50));
        factura.agregarProducto(new Producto("010", "Arroz", 10, 1.75));
    }
}
