package entity;

import org.springframework.context.annotation.Bean;

public class PrinterFactory {
    @Bean
    public Printer createPrinter(Class<?> cls) throws InstantiationException, IllegalAccessException {
        return (Printer) cls.newInstance();
    }
}
