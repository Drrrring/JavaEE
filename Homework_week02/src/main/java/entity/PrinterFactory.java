package entity;

import org.springframework.context.annotation.Bean;


public class PrinterFactory{
    @Bean
    public Printer createPrinter(Class<?> cls) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Printer) Class.forName(cls.getName()).newInstance();
    }
}
