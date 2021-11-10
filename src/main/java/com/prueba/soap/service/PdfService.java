package com.prueba.soap.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Service
public class PdfService {

    public void generarPDF(byte[] File64, String fileName){
        OutputStream outputStream=null;
        try{
            File file=new File("C:\\Users\\Fredy\\Desktop"+File.separator+fileName+".pdf");
            outputStream=new FileOutputStream(file);
            outputStream.write(File64);
        }catch(Exception e){
            System.out.println(e.getCause());
        }
    }
}
