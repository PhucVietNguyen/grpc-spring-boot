package home.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
//        Server server = ServerBuilder
//                .forPort(9090)
//                .addService(new TestServiceImpl()).build();
//        server.start();
//        server.awaitTermination();
    }
}
