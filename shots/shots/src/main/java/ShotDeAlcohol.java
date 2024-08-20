public class ShotDeAlcohol extends Coctel {
    private String tipo; // Premium, base

    // Constructor
    public ShotDeAlcohol(String nombre, String tipoLicor, double cantidadLicor, String tipoVaso, boolean conHielo, boolean conDecoracion, String decoracion, double precioUnitario, String tipo) {
        super(nombre, tipoLicor, cantidadLicor, tipoVaso, conHielo, conDecoracion, decoracion, precioUnitario);
        this.tipo = tipo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Shot: " + getNombre());
        System.out.println("Tipo de Licor: " + getTipoLicor());
        System.out.println("Cantidad de Licor: " + getCantidadLicor() + " ml");
        System.out.println("Tipo de Vaso: " + getTipoVaso());
        System.out.println("Con Hielo: " + (isConHielo() ? "Sí" : "No"));
        System.out.println("Decoración: " + (isConDecoracion() ? getDecoracion() : "Sin Decoración"));
        System.out.println("Precio Unitario: $" + getPrecioUnitario());
        System.out.println("Tipo: " + tipo);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getPrecioUnitario();
        if ("Premium".equalsIgnoreCase(tipo)) {
            precioFinal *= 1.2; // Ejemplo de incremento por ser Premium
        }
        return precioFinal;
    }

    // Método para calcular el costo de venta
    public double calcularCostoVenta(int cantidad) {
        return cantidad * getPrecioUnitario();
    }

    // Getter y Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
