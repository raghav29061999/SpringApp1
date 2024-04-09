package com.devi.descript;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.devi.descript.services.impl.ColourPrinterImpl;
import com.devi.descript.services.ColourPrinter;


@SpringBootApplication
@Log
public class coloursApplication implements CommandLineRunner {

    private ColourPrinter colourPrinter;

    public coloursApplication(ColourPrinter colourPrinter){
        this.colourPrinter = colourPrinter;
    }
    public static void main(String[] args) {
        SpringApplication.run(coloursApplication.class,args);

    }

    @Override
    public void run(final String... args) {
//        final ColourPrinter colourPrinter = new ColourPrinterImpl();
        log.info(colourPrinter.print());
    }
}
