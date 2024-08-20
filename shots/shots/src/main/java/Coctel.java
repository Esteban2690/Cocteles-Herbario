public abstract class Coctel {
    private String nombre;
    private String tipoLicor;
    private double cantidadLicor; // En mililitros
    private String tipoVaso;
    private boolean conHielo;
    private boolean conDecoracion;
    private String decoracion;
    private double precioUnitario;

    // Constructor
    public Coctel(String nombre, String tipoLicor, double cantidadLicor, String tipoVaso, boolean conHielo, boolean conDecoracion, String decoracion, double precioUnitario) {
        this.nombre = nombre;
        this.tipoLicor = tipoLicor;
        this.cantidadLicor = cantidadLicor;
        this.tipoVaso = tipoVaso;
        this.conHielo = conHielo;
        this.conDecoracion = conDecoracion;
        this.decoracion = decoracion;
        this.precioUnitario = precioUnitario;
    }

    // Métodos abstractos que las subclases deben implementar
    public abstract void mostrarDetalles();
    public abstract double calcularPrecioFinal();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public double getCantidadLicor() {
        return cantidadLicor;
    }

    public void setCantidadLicor(double cantidadLicor) {
        this.cantidadLicor = cantidadLicor;
    }

    public String getTipoVaso() {
        return tipoVaso;
    }

    public void setTipoVaso(String tipoVaso) {
        this.tipoVaso = tipoVaso;
    }

    public boolean isConHielo() {
        return conHielo;
    }

    public void setConHielo(boolean conHielo) {
        this.conHielo = conHielo;
    }

    public boolean isConDecoracion() {
        return conDecoracion;
    }

    public void setConDecoracion(boolean conDecoracion) {
        this.conDecoracion = conDecoracion;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
