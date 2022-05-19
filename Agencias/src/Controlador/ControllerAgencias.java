package Controlador;

import Modelo.DatosAgencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class ControllerAgencias {

    DatosAgencia ventasInfo[][] = new DatosAgencia[3][4];
    DatosAgencia venta = new DatosAgencia();

    /**
     * 
     * @return getVentasInfo(), sera la matriz que reservará los datos de cada agencia.
     */
    public DatosAgencia[][] getVentasInfo() {
        return ventasInfo;
    }

    public void setVentasInfo(DatosAgencia[][] ventasInfo) {
        this.ventasInfo = ventasInfo;
    }
    
    /**
     * 
     * @param agencia
     * @return matriz llena con datos de las ventas, mes, y nombre de la agencia.
     */

    public DatosAgencia[][] ingresarVentas(String agencia) {
        String opcionMes[][] = {{"Enero", "Febrero", "Marzo", "Abril"}, {"Mayo", "Junio", "Julio", "Agosto"}, {"Septiembre", "Octubre", "Noviembre", "Diciembre"}};
        venta.setAgencia((agencia));
        for (int i = 0; i < ventasInfo.length; i++) {
            for (int j = 0; j < ventasInfo[0].length; j++) {
                int k = 0;
                venta.setMes(opcionMes[i][j]);
                venta.setNroVentas((Integer.valueOf(JOptionPane.showInputDialog("Ingrese el numero de ventas del mes "))));

                ventasInfo[i][j] = new DatosAgencia(venta.getMes(), venta.getNroVentas(), venta.getAgencia());
            }
        }
        return ventasInfo;
    }
    /**
     * 
     * @param agencia 
     * Método que guarda la matriz ingresada en el set.
     */

    public void matrizIngresada(String agencia) {
        setVentasInfo(ingresarVentas(agencia));
    }
    
    /**
     * Método que muestra los datos de la agencia que pida el usuario en una tabla
     * @param tableResumen
     * @param agencia
     * @return booleano para verificar que se hayan ingresado datos.
     */

    public Boolean mostrarResumen(JTable tableResumen, DatosAgencia agencia[][]) {
        Boolean verificar = true;
        DefaultTableModel tablaResumen = new DefaultTableModel();
        tablaResumen.addColumn("Mes");
        tablaResumen.addColumn("Ventas");
        tableResumen.setModel(tablaResumen);

        String[] datos = new String[5];

        if (agencia[0][0] == null) {
            JOptionPane.showMessageDialog(null, "No existe registro de esta agencia");
            verificar = false;
        } else {
            for (int i = 0; i < agencia.length; i++) {
                for (int j = 0; j < agencia[0].length; j++) {
                    datos[0] = String.valueOf(agencia[i][j].getMes());
                    datos[1] = String.valueOf(agencia[i][j].getNroVentas());
                    tablaResumen.addRow(datos);
                }
            }
            tableResumen.setModel(tablaResumen);
        }
        return verificar;
    }
    /**
     * Método para saber la suma total de todas las ventas del año por agencia
     * @param txtVentasTotal
     * @param agencia 
     */

    public void totalVentas(JTextArea txtVentasTotal, DatosAgencia agencia[][]) {
        int ventasTotal = 0;
        for (int i = 0; i < agencia.length; i++) {
            for (int j = 0; j < agencia[0].length; j++) {
                ventasTotal = ventasTotal + agencia[i][j].getNroVentas();
            }
        }
        txtVentasTotal.append(String.valueOf(ventasTotal));
    }

    public void promedioVentasMes(DatosAgencia agencia[][], DatosAgencia agencia1[][], DatosAgencia agencia2[][], DatosAgencia agencia3[][], DatosAgencia agencia4[][], JTextArea txtPromedioVentas, JComboBox mesSeleccion) {
        String mes = (String) mesSeleccion.getSelectedItem();
        double suma = 0;
        double promedio = 0.0;
        for (int i = 0; i < agencia.length; i++) {
            for (int j = 0; j < agencia[0].length; j++) {
                if (agencia[i][j].getMes().equals(mes) || agencia1[i][j].getMes().equals(mes) || agencia2[i][j].getMes().equals(mes) || agencia3[i][j].getMes().equals(mes) || agencia4[i][j].getMes().equals(mes)) {
                    suma = agencia[i][j].getNroVentas() + agencia1[i][j].getNroVentas() + agencia2[i][j].getNroVentas() + agencia3[i][j].getNroVentas() + agencia4[i][j].getNroVentas();
                    promedio = (double) suma / 5.0;
                }
            }
        }
        txtPromedioVentas.append(String.valueOf(Math.round(promedio * 100.0) / 100.0));
    }
    
    /**
     * Método para determinar la agencia que ha vendido más vehículos en un mes determinado
     * @param agencia
     * @param agencia1
     * @param agencia2
     * @param agencia3
     * @param agencia4
     * @param txtMayor
     * @param mesSeleccion 
     */

    public void mayor(DatosAgencia agencia[][], DatosAgencia agencia1[][], DatosAgencia agencia2[][], DatosAgencia agencia3[][], DatosAgencia agencia4[][], JTextArea txtMayor, JComboBox mesSeleccion) {
        String mes = (String) mesSeleccion.getSelectedItem();
        int datos[] = new int[5];
        String agenciaNombres[] = new String[5];
        for (int i = 0; i < agencia.length; i++) {
            for (int j = 0; j < agencia.length; j++) {
                if (agencia[i][j].getMes().equals(mes) || agencia1[i][j].getMes().equals(mes) || agencia2[i][j].getMes().equals(mes) || agencia3[i][j].getMes().equals(mes) || agencia4[i][j].getMes().equals(mes)) {
                    datos[0] = agencia[i][j].getNroVentas();
                    datos[1] = agencia1[i][j].getNroVentas();
                    datos[2] = agencia2[i][j].getNroVentas();
                    datos[3] = agencia3[i][j].getNroVentas();
                    datos[4] = agencia4[i][j].getNroVentas();

                    agenciaNombres[0] = agencia[i][j].getAgencia();
                    agenciaNombres[1] = agencia1[i][j].getAgencia();
                    agenciaNombres[2] = agencia2[i][j].getAgencia();
                    agenciaNombres[3] = agencia3[i][j].getAgencia();
                    agenciaNombres[4] = agencia4[i][j].getAgencia();

                    int mayor = datos[0];
                    int posD = 0, posA = 0;
                    for (int k = 0; k < datos.length; k++) {
                        if (datos[k] >= mayor) {
                            mayor = datos[k];
                            posD = k;
                        }
                    }
                    for (int k = 0; k < agenciaNombres.length; k++) {
                        if (mayor == datos[k]) {
                            posA = k;
                            if (posD == posA) {
                                txtMayor.append(agenciaNombres[k]);
                            }
                        }
                    }
                }
            }
        }

    }
    /**
     * Método para determinar el mes en el las ventas han sido menores, teniendo en cuenta todas las agencias.
     * @param agencia
     * @param agencia1
     * @param agencia2
     * @param agencia3
     * @param agencia4
     * @param txtMenor 
     */

    public void sumaVentasMes(DatosAgencia agencia[][], DatosAgencia agencia1[][], DatosAgencia agencia2[][], DatosAgencia agencia3[][], DatosAgencia agencia4[][], JTextArea txtMenor) {
        String opcionMes[][] = {{"Enero", "Febrero", "Marzo", "Abril"}, {"Mayo", "Junio", "Julio", "Agosto"}, {"Septiembre", "Octubre", "Noviembre", "Diciembre"}};
        int sumasMes[][] = new int[3][4];
        for (int i = 0; i < agencia.length; i++) {
            for (int j = 0; j < agencia[0].length; j++) {
                sumasMes[i][j] = agencia[i][j].getNroVentas() + agencia1[i][j].getNroVentas() + agencia2[i][j].getNroVentas() + agencia3[i][j].getNroVentas() + agencia4[i][j].getNroVentas();
            }
        }
        int menor = sumasMes[0][0];
        int posi = 0, posj = 0;
        for (int i = 0; i < sumasMes.length; i++) {
            for (int j = 0; j < sumasMes[0].length; j++) {
                if (sumasMes[i][j] <= menor) {
                    menor = sumasMes[i][j];
                    posi = i;
                    posj = j;
                }

            }
        }
        int posAi, posAj;
        for (int i = 0; i < sumasMes.length; i++) {
            for (int j = 0; j < sumasMes[0].length; j++) {
                if (menor == sumasMes[i][j]) {
                    posAi = i;
                    posAj = j;
                    if (posi == posAi && posj == posAj) {
                        txtMenor.append(agencia[i][j].getMes());
                    }

                }
            }
        }
    }
    /**
     * 
     * @param agencia
     * @param nombre 
     * Método para generar JSON
     */

    public void generarGson(DatosAgencia agencia[][], String nombre) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = gson.toJson(agencia);
            FileWriter jsonGenerado = new FileWriter(nombre + ".json");
            jsonGenerado.write(jsonString);
            jsonGenerado.flush();
            JOptionPane.showMessageDialog(null, "Json generado con éxito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Json no generado");
        }

    }
}
