import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CoctelConJugo extends Coctel {
    private String diaEnQueSeVence;

    // Constructor
    public CoctelConJugo(String nombre, String tipoLicor, double cantidadLicor, String tipoVaso, boolean conHielo, boolean conDecoracion, String decoracion, double precioUnitario, String diaEnQueSeVence) {
        super(nombre, tipoLicor, cantidadLicor, tipoVaso, conHielo, conDecoracion, decoracion, precioUnitario);
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Coctel: " + getNombre());
        System.out.println("Tipo de Licor: " + getTipoLicor());
        System.out.println("Cantidad de Licor: " + getCantidadLicor() + " ml");
        System.out.println("Tipo de Vaso: " + getTipoVaso());
        System.out.println("Con Hielo: " + (isConHielo() ? "Sí" : "No"));
        System.out.println("Decoración: " + (isConDecoracion() ? getDecoracion() : "Sin Decoración"));
        System.out.println("Precio Unitario: $" + getPrecioUnitario());
        System.out.println("Día en que se Vence: " + diaEnQueSeVence);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioUnitario();
    }

    public double calcularCostoVenta(int cantidad) {
        double costoNormal = cantidad * getPrecioUnitario();
        long diasRestantes = calcularDiasRestantes();

        if (diasRestantes <= 1) {
            return costoNormal * 0.95; // Descuento del 5%
        } else if (diasRestantes == 2) {
            return costoNormal * 0.965; // Descuento del 3.5%
        } else if (diasRestantes == 3) {
            return costoNormal * 0.98; // Descuento del 2%
        } else {
            return costoNormal; // Precio normal si faltan más de 3 días
        }
    }

    private long calcularDiasRestantes() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaVencimiento = LocalDate.parse(diaEnQueSeVence);
        return ChronoUnit.DAYS.between(fechaActual, fechaVencimiento);
    }

    // Getter y Setter
    public String getDiaEnQueSeVence() {
        return diaEnQueSeVence;
    }

    public void setDiaEnQueSeVence(String diaEnQueSeVence) {
        this.diaEnQueSeVence = diaEnQueSeVence;
    }
}
