package app;

public class Clasificacion {

    public Clasificacion(String tipo, int edadMinima, String descripcion) {
        this.tipo = tipo;
        this.edadMinima = edadMinima;
        this.descripcion = descripcion;
    }

    private String tipo;
    private int edadMinima;
    private String descripcion;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}