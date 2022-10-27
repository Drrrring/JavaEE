import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MyConfig {
    @Bean
    public TestClass getTest(){
        return new TestClass();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}

