package com.devi.descript.config;

import com.devi.descript.services.BluePrinter;
import com.devi.descript.services.ColourPrinter;
import com.devi.descript.services.GreenPrinter;
import com.devi.descript.services.RedPrinter;
import com.devi.descript.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){

        //return new EnglishBluePrinter();
        return new HinidiBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        //return new EnglishRedPrinter();
        return new HindiRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        //return new EnglishGreenPrinter();
        return new HindiGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl( bluePrinter, redPrinter, greenPrinter);

    }

}

//In the provided PrinterConfig class, the configuration for bean creation is defined using the @Bean annotation. By
// changing the implementation classes returned by the bluePrinter(), redPrinter(), and greenPrinter() methods, different
// implementations of the BluePrinter, RedPrinter, and GreenPrinter interfaces are provided. These implementations are
// injected into the colourPrinter() method, which creates a ColourPrinterImpl instance with the specified
// implementations of the printer interfaces. This approach demonstrates the flexibility of Dependency Injection,
// allowing for easy swapping of implementations at runtime without modifying the ColourPrinterImpl class.
// This promotes modularity, maintainability, and testability of the codebase, as different implementations can be
// configured and tested independently.
