package facturator;

import java.util.Calendar;

public class Factura {
    public void GenerarFactura(String factura, String importe) {
        String salida = "";
        //LINEA C


        salida += (
                "C" +
                "XX" + //SERIE FACTURA
                factura.substring(factura.length() - 9) + //NUM FACTURA
                "99999999999999" + //RUT
                "X" + //CONSUMO FINAL
                "");
                
        
    }
    
}
