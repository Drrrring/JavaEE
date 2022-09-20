package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Computer {
//    @Autowired
    public Displayer displayer;
//    @Autowired
//    @Qualifier("HPPrinter")
    public Printer printer;


}
