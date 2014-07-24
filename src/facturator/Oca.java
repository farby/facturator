package facturator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Oca {
    public void GenerarOca(JFileChooser fcr, JLabel msg, String ini) {
        String linea = "";
        String texto = "";
        String mensaje = "";
        int num = 0;
        int cant = 0;
        try {
            fcr.showOpenDialog(fcr);
            File archivo = fcr.getSelectedFile();
            if (archivo != null) {
                /***LEO EL ARCHIVO***/
                try (FileReader fr = new FileReader(archivo)) {
                    BufferedReader br = new BufferedReader(fr);
                    //VERIFICO QUE NO ESTE MODIFICADO YA EL ARCHIVO
                    while ((linea = br.readLine()) != null) {
                        //RECUPERO EL NUMERO DE FACTURA ACTUAL
                        num = Integer.parseInt(ini) + cant;
                        texto += (linea + Extra(linea, num) + "\n");
                        cant ++;
                    }
                    br.close();
                    /***ESCRIBO EL ARCHIVO***/
                    try (FileWriter fw = new FileWriter(archivo)) {
                        fw.write(texto);
                    }
                    mensaje = "OCA - Generado correctamente.";
                }
            }
        }
        catch (IOException e) {
            mensaje = e.getMessage();
        }
        finally {
            msg.setText(mensaje);
        }
    }
    
    String Extra(String linea, int factura) {
        String texto = "";
        //AGREGO IMPORTE SIN IVA
        texto += (
            Aplica(linea) +
            Factura(factura) +
            Importe(linea) +
            Retencion(linea));
        return texto;
    }
    
    String Aplica(String linea) {
        String texto = "1";
        return texto;
    }
    
    String Factura(int factura) {
        String texto = String.valueOf(factura);       
        while (texto.length() < 20) {
            texto = "0" + texto;
        }
        return texto;
    }
    
    String Importe(String linea) {
        String texto = "";
        int monto;
        monto = Integer.parseInt(linea.substring(linea.length() - 10, linea.length() - 2));
        //CALCULO EL IMPORTE SIN IVA
        monto /= 1.1;
        texto += (monto + "00");
        while (texto.length() < 9) {
            texto = "0" + texto;
        }
        return texto;
    }
    
    String Retencion(String linea) {
        String texto = "000000000";
        return texto;
    }
}
