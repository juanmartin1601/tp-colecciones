public class TestInventario {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();
        
        System.out.println("=== SISTEMA DE GESTIÓN DE STOCK ===\n");
        
        // 1. Crear al menos cinco productos con diferentes categorías
        System.out.println("--- 1. AGREGANDO PRODUCTOS ---");
        Producto p1 = new Producto("P001", "Arroz Integral 1kg", 1500.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Laptop HP", 85000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera Nike", 2500.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sábanas Queen", 3500.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Aceite de Oliva", 1800.0, 25, CategoriaProducto.ALIMENTOS);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos los productos
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID
        System.out.println("\n--- 3. BÚSQUEDA POR ID ---");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        }
        
        // 4. Filtrar por categoría
        System.out.println("\n--- 4. FILTRO POR CATEGORÍA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        // 5. Eliminar un producto
        System.out.println("\n--- 5. ELIMINANDO PRODUCTO ---");
        inventario.eliminarProducto("P003");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        System.out.println("\n--- 6. ACTUALIZANDO STOCK ---");
        inventario.actualizarStock("P001", 100);
        
        // 7. Mostrar total de stock
        System.out.println("\n--- 7. TOTAL DE STOCK ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades en stock: " + totalStock);
        
        // 8. Producto con mayor stock
        System.out.println("\n--- 8. PRODUCTO CON MAYOR STOCK ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar por rango de precio
        System.out.println("\n--- 9. FILTRO POR PRECIO ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar categorías disponibles
        System.out.println("\n--- 10. CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();
    }
}