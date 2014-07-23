package facturator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class Master {
    public void GenerarMaster(JFileChooser fcr, JLabel msg, String ini) {
        String linea = "";
        String texto = "";
        String mensaje = "";
        int num = 0;
        int cant = 0;
        try {
            fcr.showOpenDialog(fcr);
            File archivo = fcr.getSelectedFile();
            if (archivo != null) {
                try (FileReader fr = new FileReader(archivo)) {
                    BufferedReader br = new BufferedReader(fr);
                    //VERIFICO QUE NO ESTE MODIFICADO YA EL ARCHIVO
                    if (true) {
                        //COMPLETO LOS 200 CARACTERES DEL HEADER
                        linea = br.readLine();
                        while (linea.length() < 200) {
                            linea += " ";
                        }
                        linea += "\n";
                        texto = linea;
                        //COMPLETO LOS DETALLES
                        while ((linea = br.readLine()) != null) {    
                            //RECUPERO EL NUMERO DE FACTURA ACTUAL
                            num = Integer.parseInt(ini) + cant;
                            //QUITO LOS ESPACIOS SOBRANTES
                            linea = linea.substring(0, 108);
                            texto += (linea + Extra(linea, num) + "\n");
                        }
                        br.close();
                        
                        try (FileWriter fw = new FileWriter(archivo)) {
                            fw.write(texto);
                        }
                        mensaje = "MASTER - Generado correctamente.";
                    }
                    else {
                        mensaje = "MASTER - Origen incorrecto.";
                    }
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
                Aplica() +
                Importe(linea) +
                Factura(factura) + 
                Filler());
        return texto;
    }
    
    String Aplica() {
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
        monto = Integer.parseInt(linea.substring(46, 54));
        //CALCULO MONTO SIN IVA
        monto /= 1.1;
        texto += (monto + "00");
        while (texto.length() < 11) {
            texto = "0" + texto;
        }
        return texto;
    }
    
    String Filler() {
        String texto = "";
        while (texto.length() < 60) {
            texto += " ";
        }
        return texto;
    }
}
