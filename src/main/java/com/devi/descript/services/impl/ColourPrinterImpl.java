package com.devi.descript.services.impl;

import com.devi.descript.services.BluePrinter;
import com.devi.descript.services.ColourPrinter;
import com.devi.descript.services.GreenPrinter;
import com.devi.descript.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;  //Dependency 1

    private BluePrinter bluePrinter;  //Dependency 2

    private GreenPrinter greenPrinter; //Dependency 3

//    public ColourPrinterImpl(){
//        this.redPrinter = new EnglishRedPrinter();
//        this.bluePrinter = new EnglishBluePrinter();
//        this.greenPrinter = new EnglishGreenPrinter();
//
//    }


//    The class ColourPrinterImpl implements the ColourPrinter interface and has three dependencies: RedPrinter,
//    BluePrinter, and GreenPrinter. In the constructor, these dependencies are injected, enabling flexibility
//    and adherence to the Dependency Injection principle.

//The original constructor, which directly instantiated the dependencies (RedPrinter, BluePrinter, and GreenPrinter)
// within the ColourPrinterImpl class, was commented out or removed to adhere to the Dependency Injection (DI)
// principle.
//----------------------------------------
//Explanation:
//Dependency Injection (DI): DI is a design pattern in which an object receives its dependencies from an external
// source rather than creating them itself. This pattern promotes loose coupling, flexibility, and testability in
// software components
// --------------------------------------
//Here, the ColourPrinterImpl class declares a constructor that takes instances of BluePrinter, RedPrinter, and
//GreenPrinter as parameters. These dependencies are then assigned to the corresponding fields within the class
// -------------------------
// In the provided code snippet, IoC is exemplified by the fact that the dependencies (RedPrinter, BluePrinter, and
// GreenPrinter) are not instantiated directly within the ColourPrinterImpl class. Instead, they are injected into
// the class from an external source.



    public ColourPrinterImpl(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){ //DI happens here
        this.bluePrinter = bluePrinter;
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
    }
    //sd


    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }

}
