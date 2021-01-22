package ar.com.xeven;

public class Cliente {
    private String categoria;
    Double montoPrestado;
    Double montoDevuelto;

    public void pedirPrestamo(Double monto){
        if((monto <= 100 && categoria.equals("riesgoso")) ||
           (monto <= 200 && categoria.equals("nuevo")) ||
           (monto <= 500 && categoria.equals("confiable")))
                montoPrestado = monto;
    }
    public void realizarPago(Double monto){
        montoDevuelto += monto;
        if(montoDevuelto>=montoPrestado)
            categoria = "confiable";
    }
    public Double consultarDeuda(){
        return montoPrestado-montoDevuelto;
    }

    public Cliente(String categoria) {
        this.categoria = categoria;
        montoPrestado = 0.0;
        montoDevuelto = 0.0;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getMontoPrestado() {
        return montoPrestado;
    }

    public Double getMontoDevuelto() {
        return montoDevuelto;
    }
}
