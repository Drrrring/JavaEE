package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PrinterFactory {
//    @Bean
//    public Printer createPrinter(Class<?> cls) throws InstantiationException, IllegalAccessException {
//        return (Printer) cls.newInstance();
//    }

    @Bean("hpPrinter")
    public Printer createHPPrinter(){
        return new HPPrinter();
    }

    @Bean("epsonPrinter")
    public Printer createEpsonPrinter(){
        return new EpsonPrinter();
    }
}
