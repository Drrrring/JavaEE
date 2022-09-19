import entity.DellDisplayerFactoryBean;
import entity.LenovoComputer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entity")
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainClass.class);
//        for(String s: annotationConfigApplicationContext.getBeanDefinitionNames()){
//            System.out.println(s);
//        }
        LenovoComputer o = annotationConfigApplicationContext.getBean(LenovoComputer.class);
        System.out.println(o);
    }
}
