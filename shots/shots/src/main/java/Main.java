public class Main {
    public static void main(String[] args) {
        // Crear un mojito con fecha de vencimiento cercana
        CoctelConJugo mojitoCercano = new CoctelConJugo("Mojito", "Ron", 50, "Vaso Alto", true, true, "Menta", 15000, "2024-08-20");
        mojitoCercano.mostrarDetalles();
        System.out.println("Precio Final: $" + mojitoCercano.calcularPrecioFinal());

        // Crear un shot de tequila premium
        ShotDeAlcohol shotTequila = new ShotDeAlcohol("Tequila Shot", "Tequila", 30, "Vaso Shot", false, false, null, 8000, "Premium");
        shotTequila.mostrarDetalles();
        System.out.println("Precio Final: $" + shotTequila.calcularPrecioFinal());

        // Crear otro mojito con más tiempo antes de vencer
        CoctelConJugo mojito = new CoctelConJugo("Mojito", "Ron", 50, "Vaso Alto", true, true, "Menta", 15000, "2024-08-22");
        mojito.mostrarDetalles();
        System.out.println("Costo de Venta: $" + mojito.calcularCostoVenta(10));

        // Calcular el costo de venta del shot de tequila
        System.out.println("Costo de Venta: $" + shotTequila.calcularCostoVenta(5));
    }
}
