package com.devi.descript.services.impl;

import com.devi.descript.services.BluePrinter;
import com.devi.descript.services.ColourPrinter;
import com.devi.descript.services.GreenPrinter;
import com.devi.descript.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;  //Dependency 1

    private BluePrinter bluePrinter;  //Dependency 2

    private GreenPrinter greenPrinter; //Dependency 3

    public ColourPrinterImpl(){
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();

    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }

}
