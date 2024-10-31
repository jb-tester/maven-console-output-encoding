package org.example.sbruntest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SbRunTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbRunTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("добрый день!");
        System.out.println("Dobré odpoledne!");
        System.out.println("Bon après-midi!");
    }
}
