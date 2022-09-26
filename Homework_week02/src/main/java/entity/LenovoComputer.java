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
//    @Autowired
//    public void setDisplayer(DellDisplayer dellDisplayer){
//        this.displayer = dellDisplayer;
//    }
//
//    @Autowired
//    public void setPrinter(HPPrinter hpPrinter){
//        this.printer = hpPrinter;
//    }


    //构造函数注入
    public LenovoComputer(@Qualifier("dellDisplayerFactoryBean") Displayer displayer, @Qualifier("hpPrinter") Printer printer){
        this.displayer = displayer;
        this.printer = printer;
    }
}
