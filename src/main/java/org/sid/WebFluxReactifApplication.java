package org.sid;

import org.sid.dao.SocieteRepository;
import org.sid.dao.TransactionRepository;
import org.sid.entities.Societe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class WebFluxReactifApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxReactifApplication.class, args);
    }

    @Bean
    CommandLineRunner run(SocieteRepository societeRepository, TransactionRepository transactionRepository){
        return args -> {
            Stream.of("SG", "AWB", "BMCE", "AXA")
                    .forEach(code ->
                            societeRepository.save(
                                    new Societe("Societe " + code, code, 100.0+Math.random()*900))
                                    .subscribe(soc->{
                                        System.out.println(soc.toString());
                                    }));

        };
    }
}
