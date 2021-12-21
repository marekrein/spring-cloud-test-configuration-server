package co.reinhold.conficserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConficServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConficServerApplication.class, args);
    }

}
