package com.prueba.soap.endpoint;

import com.prueba.soap.service.PdfService;
import com.prueba.soap.spring_boot_soap_example.GetUserRequest;
import com.prueba.soap.spring_boot_soap_example.GetUserResponse;
import com.prueba.soap.spring_boot_soap_example.PDFRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class pdfEndpoint {
    @Autowired
    PdfService pdfService;

    @PayloadRoot(namespace = "http://soap.prueba.com/springboot-soap-example",
            localPart = "pdfRequest")
    @ResponsePayload
    public void getPdfRequest(@RequestPayload PDFRequest request){
        pdfService.generarPDF(request.getFile(),"holi");
    }
}
