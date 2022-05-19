package Modelo;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class DatosAgencia {
    
    @SerializedName("Mes")
    private String mes;
    @SerializedName("Ventas del mes")
    private int nroVentas;
    @SerializedName("Agencia correspondiente")
    private String agencia;

    /**
     * 
     * @return mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * 
     * @param mes 
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * 
     * @return numero de ventas
     */
    public int getNroVentas() {
        return nroVentas;
    }
    
    /**
     * 
     * @param nroVentas 
     */

    public void setNroVentas(int nroVentas) {
        this.nroVentas = nroVentas;
    }
    
    /**
     * 
     * @return nombre de la agencia
     */

    public String getAgencia() {
        return agencia;
    }
    
    /**
     * 
     * @param agencia 
     */

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Método constructor para crear matrices.
     * @param mes
     * @param nroVentas
     * @param agencia 
     */
    public DatosAgencia(String mes, int nroVentas, String agencia) {
        this.mes = mes;
        this.nroVentas = nroVentas;
        this.agencia = agencia;
    }

    public DatosAgencia() {
    }
    
}
