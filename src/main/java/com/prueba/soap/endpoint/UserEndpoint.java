package com.prueba.soap.endpoint;

import com.prueba.soap.service.UserService;
import com.prueba.soap.spring_boot_soap_example.GetUserRequest;
import com.prueba.soap.spring_boot_soap_example.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    @Autowired
    UserService userService;

    @PayloadRoot(namespace = "http://soap.prueba.com/springboot-soap-example",
    localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse response=new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
