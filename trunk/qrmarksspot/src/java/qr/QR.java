/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qr;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Hashtable;

import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.*;

/**
 *
 * @author HP
 */
public class QR {

    private String message;
    private int heigth;
    private int width;
    private String filePath;

    public boolean create(String message,int heigth, int width,String path){

        this.message = message;
        this.heigth = heigth;
        this.width = width;
        this.filePath = path;

        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();
        byte[] b = null;
        try {
            // Convert a string to UTF-8 bytes in a ByteBuffer
            ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(message));
            b = bbuf.array();
        } catch (CharacterCodingException e) {
            System.out.println(e.getMessage());
        }

        String data;
        try {
            data = new String(b, "UTF-8");
            // get a byte matrix for the data
            BitMatrix matrix = null;
            int h = heigth; // 100;
            int w = width; //100;
            com.google.zxing.Writer writer = new MultiFormatWriter();
            try {
                Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>(2);
                hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
                matrix = writer.encode(data,
                com.google.zxing.BarcodeFormat.QR_CODE, w, h, hints);
            } catch (com.google.zxing.WriterException e) {
                System.out.println(e.getMessage());
            }

            // change this path to match yours (this is my mac home folder, you can use: c:\\qr_png.png if you are on windows)
            
            File file = new File(this.filePath);
            
            //file.createNewFile();
            try {
                file.createNewFile();
                MatrixToImageWriter.writeToFile(matrix, "PNG", file);
                System.out.println("printing to " + file.getAbsolutePath());
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return false;
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
