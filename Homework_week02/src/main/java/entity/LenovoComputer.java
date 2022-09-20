package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LenovoComputer extends Computer{
//    @Autowired
//    public Displayer displayer;
//    @Autowired
//    @Qualifier("hPPrinter")
//    public Printer printer;
    @Autowired
    public void setDisplayer(DellDisplayer dellDisplayer){
        this.displayer = dellDisplayer;
    }

    @Autowired
    public void setPrinter(HPPrinter hpPrinter){
        this.printer = hpPrinter;
    }

    @Override
    public String toString() {
        return "LenovoComputer {" + "displayer: " + this.displayer.toString() + " printer: " + this.printer.toString() + "}";
    }
}
