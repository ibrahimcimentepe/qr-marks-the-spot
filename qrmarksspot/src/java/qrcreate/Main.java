/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcreate;
import qr.QR;
/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     *
     * burdaki main değişcek tabi
     * ama qr yaratılış kodunun kullanılış biçimi böyle olacak
     */
    public static void main(String[] args) {
        // TODO code application logic here

        QR code  = new QR();
        String message = "selam gencler";
        int heigth = 100;
        int width = 100;
        String filepath  = "C:\\Users\\HP\\Desktop\\qr_png.png";
        code.create(message, heigth, width, filepath);
    }

}
