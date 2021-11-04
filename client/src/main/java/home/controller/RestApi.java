package home.controller;

import home.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @Autowired
    GrpcClientService grpcClientService;

    @GetMapping("/ping")
    public String ping() {
        return grpcClientService.ping();
    }
}
